package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.tileentity.TileEntityMechanicPackage;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketLockpickAttempt implements IMessage {

    private int index; // button index
    private int offset; // how many buttons have been pressed
    private BlockPos pos;

    public SPacketLockpickAttempt() {

    }

    public SPacketLockpickAttempt(int index, int offset, BlockPos pos) {
        this.index = index;
        this.offset = offset;
        this.pos = pos;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(index);
        buf.writeInt(offset);
        buf.writeInt(pos.getX());
        buf.writeInt(pos.getY());
        buf.writeInt(pos.getZ());
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        index = buf.readInt();
        offset = buf.readInt();
        pos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
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
                BlockPos pos = message.pos;
                TileEntity tileEntity = world.getTileEntity(pos);
                if(tileEntity instanceof TileEntityMechanicPackage) {
                    TileEntityMechanicPackage mechanicPackage = (TileEntityMechanicPackage) tileEntity;
                    int[] combinations = mechanicPackage.getCombinations();
                    if(message.offset < 0 || message.offset >= combinations.length)
                        return;
                    int correct = combinations[message.offset];
                    int pressed = message.index;
                    if(correct != pressed) {
                        player.closeScreen();
                        world.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.MASTER, 1.0F, 1.0F);
                        player.getHeldItemMainhand().shrink(1);
                    } else if(message.offset == combinations.length - 1) {
                        player.closeScreen();
                        for (int i = 0; i < mechanicPackage.getSizeInventory(); i++) {
                            ItemStack stack = mechanicPackage.getStackInSlot(i);
                            if(!stack.isEmpty()) {
                                player.addItemStackToInventory(stack.copy());
                            }
                        }
                        world.destroyBlock(pos, false);
                    }
                }
            });
            return null;
        }
    }
}
