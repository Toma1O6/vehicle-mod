package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.client.NitroCloudSound;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CPacketCloudStatus implements IMessage {

    boolean state;
    int entityID;

    public CPacketCloudStatus() {}

    public CPacketCloudStatus(boolean state, int entityID) {
        this.state = state;
        this.entityID = entityID;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(state);
        buf.writeInt(entityID);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        state = buf.readBoolean();
        entityID = buf.readInt();
    }

    public static class Handler implements IMessageHandler<CPacketCloudStatus, IMessage> {

        @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(CPacketCloudStatus message, MessageContext ctx) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.addScheduledTask(() -> {
                WorldClient world = mc.world;
                Entity entity = world.getEntityByID(message.entityID);
                if(entity instanceof EntityVehicle) {
                    ((EntityVehicle) entity).getNitroHandler().setCloudState(message.state);
                    mc.getSoundHandler().playSound(new NitroCloudSound((EntityVehicle) entity));
                }
            });
            return null;
        }
    }
}
