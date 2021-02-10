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

public class CPacketUpdateEntity implements IMessage {

    private int entityID;
    private NBTTagCompound data;

    public CPacketUpdateEntity() {}

    public CPacketUpdateEntity(Entity entity) {
        this.entityID = entity.getEntityId();
        this.data = entity.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entityID);
        ByteBufUtils.writeTag(buf, data);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        entityID = buf.readInt();
        data = ByteBufUtils.readTag(buf);
    }

    public static class Handler implements IMessageHandler<CPacketUpdateEntity, IMessage> {

        @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(CPacketUpdateEntity message, MessageContext ctx) {
            Minecraft mc = Minecraft.getMinecraft();
            mc.addScheduledTask(() -> {
                WorldClient world = mc.world;
                Entity entity = world.getEntityByID(message.entityID);
                if(entity != null) {
                    entity.readFromNBT(message.data);
                }
            });
            return null;
        }
    }
}
