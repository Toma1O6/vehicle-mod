package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.internals.ISpecialVehicle;
import dev.toma.vehiclemod.network.VMNetworkManager;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketSiren implements IMessage {

    @Override
    public void toBytes(ByteBuf buf) {

    }

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<SPacketSiren, IMessage> {

        @Override
        public IMessage onMessage(SPacketSiren message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> {
                Entity entity = player.getRidingEntity();
                if(entity instanceof ISpecialVehicle) {
                    EntityVehicle vehicle = (EntityVehicle) entity;
                    ISpecialVehicle specialVehicle = (ISpecialVehicle) entity;
                    if(player == entity.getControllingPassenger()) {
                        specialVehicle.setEffectActive(!specialVehicle.isEffectActive());
                        vehicle.sync();
                        if(specialVehicle.isEffectActive())
                            VMNetworkManager.instance().sendToAllTracking(new CPacketSendSpecialVehicleStatus(CPacketSendSpecialVehicleStatus.EnumState.START_TRACKING, (EntityVehicle & ISpecialVehicle) vehicle), vehicle);
                        else
                            VMNetworkManager.instance().sendToAllTracking(new CPacketSendSpecialVehicleStatus(CPacketSendSpecialVehicleStatus.EnumState.STOP_TRACKING, (EntityVehicle & ISpecialVehicle) vehicle), vehicle);
                    }
                }
            });
            return null;
        }
    }
}
