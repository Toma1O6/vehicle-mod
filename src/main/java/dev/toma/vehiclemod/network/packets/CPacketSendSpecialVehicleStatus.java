package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.client.CarSound;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.ISpecialVehicle;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CPacketSendSpecialVehicleStatus implements IMessage {

    EnumState state;
    int entityID;

    public CPacketSendSpecialVehicleStatus() {}

    public <V extends EntityVehicle & ISpecialVehicle> CPacketSendSpecialVehicleStatus(EnumState state, V vehicle) {
        this.state = state;
        this.entityID = vehicle.getEntityId();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(state.ordinal());
        buf.writeInt(entityID);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        state = EnumState.values()[buf.readInt()];
        entityID = buf.readInt();
    }

    public static class Handler implements IMessageHandler<CPacketSendSpecialVehicleStatus, IMessage> {

        @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(CPacketSendSpecialVehicleStatus message, MessageContext ctx) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.addScheduledTask(() -> {
                WorldClient world = mc.world;
                Entity entity = world.getEntityByID(message.entityID);
                if(entity instanceof ISpecialVehicle) {
                    ISpecialVehicle vehicle = (ISpecialVehicle) entity;
                    SoundHandler handler = mc.getSoundHandler();
                    switch (message.state) {
                        case START_TRACKING:
                            CarSound sound = vehicle.getPlayingSound();
                            if(sound != null) {
                                handler.stopSound(sound);
                            }
                            if(vehicle.isEffectActive()) {
                                CarSound sirenSound = new CarSound(vehicle.getSpecialEffectSound(), (EntityVehicle) vehicle);
                                vehicle.setPlayingSound(sirenSound);
                                handler.playSound(sirenSound);
                            }
                            break;
                        case STOP_TRACKING:
                            CarSound actualSound = vehicle.getPlayingSound();
                            if(actualSound != null) {
                                handler.stopSound(actualSound);
                            }
                            vehicle.setPlayingSound(null);
                            break;
                    }
                }
            });
            return null;
        }
    }

    public enum EnumState {

        START_TRACKING,
        STOP_TRACKING
    }
}
