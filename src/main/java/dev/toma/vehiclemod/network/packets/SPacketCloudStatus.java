package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.internals.NitroHandler;
import dev.toma.vehiclemod.network.VMNetworkManager;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketCloudStatus implements IMessage {

    boolean state;

    public SPacketCloudStatus() {}

    public SPacketCloudStatus(boolean state) {
        this.state = state;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(state);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        state = buf.readBoolean();
    }

    public static class Handler implements IMessageHandler<SPacketCloudStatus, IMessage> {

        @Override
        public IMessage onMessage(SPacketCloudStatus message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> {
                Entity entity = player.getRidingEntity();
                if(entity instanceof EntityVehicle && entity.getControllingPassenger() == player) {
                    EntityVehicle vehicle = (EntityVehicle) entity;
                    NitroHandler handler = vehicle.getNitroHandler();
                    handler.setCloudState(message.state);
                    VMNetworkManager.instance().sendToAllTracking(new CPacketCloudStatus(message.state, vehicle.getEntityId()), vehicle);
                }
            });
            return null;
        }
    }
}
