package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketFuelMakerAction implements IMessage {

    private BlockPos pos;
    private int actionID;
    private boolean shiftClick;

    public SPacketFuelMakerAction() {}

    public SPacketFuelMakerAction(BlockPos pos, int actionID, boolean shiftClick) {
        this.pos = pos;
        this.actionID = actionID;
        this.shiftClick = shiftClick;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(pos.getX());
        buf.writeInt(pos.getY());
        buf.writeInt(pos.getZ());
        buf.writeInt(actionID);
        buf.writeBoolean(shiftClick);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        pos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
        actionID = buf.readInt();
        shiftClick = buf.readBoolean();
    }

    public static class Handler implements IMessageHandler<SPacketFuelMakerAction, IMessage> {

        @Override
        public IMessage onMessage(SPacketFuelMakerAction message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> {
                WorldServer server = player.getServerWorld();
                if(!server.isBlockLoaded(message.pos))
                    return;
                TileEntity te = server.getTileEntity(message.pos);
                if(te instanceof TileEntityFuelMaker) {
                    TileEntityFuelMaker fuelMaker = (TileEntityFuelMaker) te;
                    try {
                        fuelMaker.runAction(message.actionID, message.shiftClick);
                    } catch (IllegalArgumentException ex) {
                        VehicleMod.logger.fatal("Received invalid FuelMaker packet from " + player.getName());
                        player.connection.disconnect(new TextComponentString("You sent invalid FuelMaker packet"));
                    }
                }
            });
            return null;
        }
    }
}
