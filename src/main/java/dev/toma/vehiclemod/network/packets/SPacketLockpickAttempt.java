package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.util.DateTimeHelper;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.function.BiFunction;

public class SPacketLockpickAttempt implements IMessage {

    private LockpickType type;
    private int index; // button index
    private int offset; // how many buttons have been pressed

    // package position
    private BlockPos pos;

    // vehicle id
    private int vehicleID;

    public SPacketLockpickAttempt() {
    }

    // packages
    private SPacketLockpickAttempt(LockpickType type, int index, int offset, BlockPos pos) {
        this.type = type;
        this.index = index;
        this.offset = offset;
        this.pos = pos;
    }

    private SPacketLockpickAttempt(LockpickType type, int index, int offset, int id) {
        this.type = type;
        this.index = index;
        this.offset = offset;
        this.vehicleID = id;
    }

    public static SPacketLockpickAttempt lockpickPackage(int index, int offset, BlockPos pos) {
        return new SPacketLockpickAttempt(LockpickType.PACKAGE, index, offset, pos);
    }

    public static SPacketLockpickAttempt lockpickVehicle(int index, int offset, int vehicleID) {
        return new SPacketLockpickAttempt(LockpickType.VEHICLE, index, offset, vehicleID);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(type.ordinal());
        buf.writeInt(index);
        buf.writeInt(offset);
        switch (type) {
            case PACKAGE:
                buf.writeInt(pos.getX());
                buf.writeInt(pos.getY());
                buf.writeInt(pos.getZ());
                break;
            case VEHICLE:
                buf.writeInt(vehicleID);
                break;
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        type = LockpickType.values()[buf.readInt()];
        index = buf.readInt();
        offset = buf.readInt();
        switch (type) {
            case PACKAGE:
                pos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
                break;
            case VEHICLE:
                vehicleID = buf.readInt();
                break;
        }
    }

    public static class Handler implements IMessageHandler<SPacketLockpickAttempt, IMessage> {

        @Override
        public IMessage onMessage(SPacketLockpickAttempt message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> {
                if(player.getHeldItemMainhand().getItem() != Registries.VMItems.LOCKPICK) {
                    player.closeScreen();
                    return;
                }
                World world = player.world;
                ILockpickable lockpickable = message.type.get(message, world);
                if(lockpickable == null) {
                    player.closeScreen();
                    return;
                }
                int[] combinations = lockpickable.getCombinations();
                if(combinations == null) {
                    player.closeScreen();
                    return;
                }
                int offset = message.offset;
                if(offset < 0 || offset >= combinations.length)
                    return;
                int correct = combinations[offset];
                int pressed = message.index;
                if(correct != pressed) {
                    player.closeScreen();
                    world.playSound(null, player.posX, player.posY, player.posZ, DateTimeHelper.isAprilFools() ? VMSounds.LOCKPICK_FAILED_AF : VMSounds.LOCKPICK_FAILED, SoundCategory.MASTER, 1.0F, 1.0F);
                    if(lockpickable.shouldBreakLockpick(VehicleMod.random)) {
                        world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.MASTER, 1.0F, 1.0F);
                        player.getHeldItemMainhand().shrink(1);
                    }
                } else if(message.offset == combinations.length - 1) {
                    player.closeScreen();
                    world.playSound(null, player.posX, player.posY, player.posZ, VMSounds.LOCK_UNLOCKED, SoundCategory.MASTER, 1.0F, 1.0F);
                    lockpickable.handleUnlock(player, world);
                } else {
                    world.playSound(null, player.posX, player.posY, player.posZ, VMSounds.LOCKPICK_SUCCESS, SoundCategory.MASTER, 1.0F, 1.0F);
                }
            });
            return null;
        }
    }

    public enum LockpickType {

        PACKAGE((msg, world) -> {
            BlockPos pos = msg.pos;
            TileEntity tileEntity = world.getTileEntity(pos);
            if(tileEntity instanceof ILockpickable) {
                return (ILockpickable) tileEntity;
            } return null;
        }),
        VEHICLE((msg, world) -> {
            int id = msg.vehicleID;
            Entity entity = world.getEntityByID(id);
            if(entity instanceof ILockpickable) {
                return (ILockpickable) entity;
            } return null;
        });

        private final BiFunction<SPacketLockpickAttempt, World, ILockpickable> function;

        LockpickType(BiFunction<SPacketLockpickAttempt, World, ILockpickable> function) {
            this.function = function;
        }

        public ILockpickable get(SPacketLockpickAttempt msg, World world) {
            return function.apply(msg, world);
        }
    }
}
