package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.network.VMNetworkManager;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketHonk implements IMessage {

    boolean state;
    int id;

    public SPacketHonk() {

    }

    public SPacketHonk(boolean state, EntityVehicle vehicle) {
        this.state = state;
        this.id = vehicle.getEntityId();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(state);
        buf.writeInt(id);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        state = buf.readBoolean();
        id = buf.readInt();
    }

    public static class Handler implements IMessageHandler<SPacketHonk, IMessage> {

        @Override
        public IMessage onMessage(SPacketHonk message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> {
                World world = player.world;
                Entity entity = world.getEntityByID(message.id);
                if(entity instanceof EntityVehicle) {
                    EntityVehicle vehicle = (EntityVehicle) entity;
                    VMNetworkManager.instance().sendToAllTracking(new CPacketHonk(message.state, message.id), vehicle);
                }
            });
            return null;
        }
    }
}
