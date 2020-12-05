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
    int nitroSlot;

    public SPacketVehicleAction() {}

    public SPacketVehicleAction(Action action, boolean eco, int nitroSlot) {
        this.action = action;
        this.eco = eco;
        this.nitroSlot = nitroSlot;
    }

    public static SPacketVehicleAction start() {
        return new SPacketVehicleAction(Action.START, false, 0);
    }

    public static SPacketVehicleAction eco(boolean state) {
        return new SPacketVehicleAction(Action.ECO, state, 0);
    }

    public static SPacketVehicleAction nitro(int slotID) {
        return new SPacketVehicleAction(Action.NITRO, false, slotID);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(action.ordinal());
        switch (action) {
            case ECO:
                buf.writeBoolean(eco);
                break;
            case NITRO:
                buf.writeInt(nitroSlot);
                break;
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        action = Action.values()[buf.readInt()];
        switch (action) {
            case ECO:
                eco = buf.readBoolean();
                break;
            case NITRO:
                nitroSlot = buf.readInt();
                break;
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
                        case NITRO:
                            vehicle.getNitroHandler().initiateUse(player, message.nitroSlot);
                            break;
                    }
                }
            });
            return null;
        }
    }

    public enum Action {
        START,
        ECO,
        NITRO
    }
}
