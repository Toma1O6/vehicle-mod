package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.LightController;
import dev.toma.vehiclemod.network.VMNetworkManager;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketChangeLightStatus implements IMessage {

    EnumAction action;
    int entityID;
    boolean state;
    LightController.TurnLightStatus status;

    public SPacketChangeLightStatus() {}

    private SPacketChangeLightStatus(EnumAction action, EntityVehicle vehicle, boolean state, LightController.TurnLightStatus status) {
        this.action = action;
        this.entityID = vehicle.getEntityId();
        this.state = state;
        this.status = status;
    }

    public static SPacketChangeLightStatus headlights(EntityVehicle vehicle, boolean state) {
        return new SPacketChangeLightStatus(EnumAction.HEADLIGHTS, vehicle, state, null);
    }

    public static SPacketChangeLightStatus turnStatus(EntityVehicle vehicle, LightController.TurnLightStatus status) {
        return new SPacketChangeLightStatus(EnumAction.INDICATOR, vehicle, false, status);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(action.ordinal());
        buf.writeInt(entityID);
        switch (action) {
            case HEADLIGHTS:
                buf.writeBoolean(state);
                break;
            case INDICATOR:
                buf.writeInt(status.ordinal());
                break;
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        action = EnumAction.values()[buf.readInt()];
        entityID = buf.readInt();
        switch (action) {
            case HEADLIGHTS:
                state = buf.readBoolean();
                break;
            case INDICATOR:
                status = LightController.TurnLightStatus.values()[buf.readInt()];
                break;
        }
    }

    public static class Handler implements IMessageHandler<SPacketChangeLightStatus, IMessage> {

        @Override
        public IMessage onMessage(SPacketChangeLightStatus message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> {
                WorldServer server = player.getServerWorld();
                Entity entity = server.getEntityByID(message.entityID);
                if(entity instanceof EntityVehicle) {
                    LightController controller = ((EntityVehicle) entity).getLightController();
                    switch (message.action) {
                        case HEADLIGHTS:
                            controller.setLightState(message.state);
                            break;
                        case INDICATOR:
                            controller.setTurnLightStatus(message.status);
                            break;
                    }
                    NBTTagCompound nbt = new NBTTagCompound();
                    controller.onNBTWrite(nbt);
                    VMNetworkManager.instance().sendToAllTracking(new CPacketSendLightStatus(message.entityID, nbt), entity);
                }
            });
            return null;
        }
    }

    enum EnumAction {

        HEADLIGHTS,
        INDICATOR
    }
}
