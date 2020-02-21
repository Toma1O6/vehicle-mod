package dev.toma.vehiclemod.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketSetNBT implements IMessage {

    private ItemStack stack;
    private NBTTagCompound nbt;

    public SPacketSetNBT() {
    }

    public SPacketSetNBT(ItemStack stack, NBTTagCompound nbtToSet) {
        this.stack = stack;
        this.nbt = nbtToSet;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeItemStack(buf, stack);
        ByteBufUtils.writeTag(buf, nbt);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        stack = ByteBufUtils.readItemStack(buf);
        nbt = ByteBufUtils.readTag(buf);
    }

    public static class Handler implements IMessageHandler<SPacketSetNBT, IMessage> {
        @Override
        public IMessage onMessage(SPacketSetNBT message, MessageContext ctx) {
            ctx.getServerHandler().player.getServer().addScheduledTask(() -> {
                ItemStack stack = message.stack;
                stack.setTagCompound(message.nbt);
                ctx.getServerHandler().player.inventory.markDirty();
            });
            return null;
        }
    }
}
