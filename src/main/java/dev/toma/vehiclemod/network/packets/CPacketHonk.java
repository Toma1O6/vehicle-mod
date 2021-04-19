package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.client.CarHonkSound;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CPacketHonk implements IMessage {

    int id;
    boolean state;

    public CPacketHonk() {

    }

    public CPacketHonk(boolean state, int id) {
        this.state = state;
        this.id = id;
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

    public static class Handler implements IMessageHandler<CPacketHonk, IMessage> {

        @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(CPacketHonk message, MessageContext ctx) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.addScheduledTask(() -> {
                World world = mc.world;
                Entity entity = world.getEntityByID(message.id);
                boolean state = message.state;
                if(entity instanceof EntityVehicle) {
                    EntityVehicle vehicle = (EntityVehicle) entity;
                    SoundHandler handler = mc.getSoundHandler();
                    CarHonkSound honkSound = vehicle.honkSound;
                    if(honkSound != null && handler.isSoundPlaying(honkSound)) {
                        handler.stopSound(honkSound);
                    }
                    vehicle.honkSound = null;
                    if(state) {
                        CarHonkSound carHonkSound = new CarHonkSound(vehicle);
                        vehicle.honkSound = carHonkSound;
                        handler.playSound(carHonkSound);
                    }
                }
            });
            return null;
        }
    }
}
