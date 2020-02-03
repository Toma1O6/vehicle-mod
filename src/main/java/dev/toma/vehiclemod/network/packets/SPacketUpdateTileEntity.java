package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketUpdateTileEntity implements IMessage {

    public SPacketUpdateTileEntity() {

    }

    private NBTTagCompound nbt;
    private BlockPos pos;

    public SPacketUpdateTileEntity(BlockPos pos, NBTTagCompound nbt) {
        this.pos = pos;
        this.nbt = nbt;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(pos.getX());
        buf.writeInt(pos.getY());
        buf.writeInt(pos.getZ());
        ByteBufUtils.writeTag(buf, nbt);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        pos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
        nbt = ByteBufUtils.readTag(buf);
    }

    public static class Handler implements IMessageHandler<SPacketUpdateTileEntity, IMessage> {

        @Override
        public IMessage onMessage(SPacketUpdateTileEntity message, MessageContext ctx) {
            ctx.getServerHandler().player.getServer().addScheduledTask(() -> {
                EntityPlayerMP playerMP = ctx.getServerHandler().player;
                World world = playerMP.world;
                if(message.pos == null) {
                    VehicleMod.logger.fatal("Received TileEntity packet with NULL position!");
                    return;
                }
                TileEntity tileEntity = world.getTileEntity(message.pos);
                if(tileEntity != null) {
                    tileEntity.readFromNBT(message.nbt);
                }
            });
            return null;
        }
    }
}
