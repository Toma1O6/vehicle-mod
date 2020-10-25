package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.util.GuiHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketOpenVehicleComponentGUI implements IMessage {

    public SPacketOpenVehicleComponentGUI() {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<SPacketOpenVehicleComponentGUI, IMessage> {

        @Override
        public IMessage onMessage(SPacketOpenVehicleComponentGUI message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            player.getServer().addScheduledTask(() -> player.openGui(VehicleMod.instance, GuiHandler.VEHICLE_COMPONENT, player.world, (int) player.posX, (int) player.posY, (int) player.posZ));
            return null;
        }
    }
}
