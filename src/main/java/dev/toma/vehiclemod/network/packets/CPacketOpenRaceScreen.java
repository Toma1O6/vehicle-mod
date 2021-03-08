package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.client.gui.GuiRaces;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CPacketOpenRaceScreen implements IMessage {

    boolean op;

    public CPacketOpenRaceScreen() {}

    public CPacketOpenRaceScreen(boolean op) {
        this.op = op;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(op);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        op = buf.readBoolean();
    }

    public static class Handler implements IMessageHandler<CPacketOpenRaceScreen, IMessage> {

        @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(CPacketOpenRaceScreen message, MessageContext ctx) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.addScheduledTask(() -> mc.displayGuiScreen(new GuiRaces(mc.world, message.op)));
            return null;
        }
    }
}
