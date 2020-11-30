package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketVehicleAction implements IMessage {

    Action action;
    boolean eco;

    public SPacketVehicleAction() {}

    public SPacketVehicleAction(Action action, boolean eco) {
        this.action = action;
        this.eco = eco;
    }

    public static SPacketVehicleAction start() {
        return new SPacketVehicleAction(Action.START, false);
    }

    public static SPacketVehicleAction eco(boolean state) {
        return new SPacketVehicleAction(Action.ECO, state);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(action.ordinal());
        if(action == Action.ECO) {
            buf.writeBoolean(eco);
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        action = Action.values()[buf.readInt()];
        if(action == Action.ECO) {
            eco = buf.readBoolean();
        }
    }

    public static class Handler implements IMessageHandler<SPacketVehicleAction, IMessage> {

        @Override
        public IMessage onMessage(SPacketVehicleAction message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> {
                WorldServer server = player.getServerWorld();
                Entity entity = player.getRidingEntity();
                if(entity instanceof EntityVehicle && entity.getControllingPassenger() == player) {
                    EntityVehicle vehicle = (EntityVehicle) entity;
                    switch (message.action) {
                        case START:
                            if(vehicle.getStartCooldown() == 0 && !vehicle.isStarted()) {
                                vehicle.initiateStart();
                                vehicle.sync();
                            }
                            break;
                        case ECO:
                            vehicle.setEcoMode(message.eco);
                            vehicle.sync();
                            break;
                    }
                }
            });
            return null;
        }
    }

    public enum Action {
        START,
        ECO
    }
}
