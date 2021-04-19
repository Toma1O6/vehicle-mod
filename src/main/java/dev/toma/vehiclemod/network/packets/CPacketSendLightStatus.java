package dev.toma.vehiclemod.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CPacketSendLightStatus implements IMessage {

    private int entityID;
    private NBTTagCompound nbt;

    public CPacketSendLightStatus() {}

    public CPacketSendLightStatus(int entityID, NBTTagCompound compound) {
        this.entityID = entityID;
        this.nbt = compound;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entityID);
        ByteBufUtils.writeTag(buf, nbt);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        entityID = buf.readInt();
        nbt = ByteBufUtils.readTag(buf);
    }

    public static class Handler implements IMessageHandler<CPacketSendLightStatus, IMessage> {

        @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(CPacketSendLightStatus message, MessageContext ctx) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.addScheduledTask(() -> {
                WorldClient client = mc.world;
                Entity entity = client.getEntityByID(message.entityID);
                if(entity instanceof EntityVehicle) {
                    ((EntityVehicle) entity).lightController.deserializeNBT(message.nbt);
                }
            });
            return null;
        }
    }
}
