package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketInput implements IMessage {
	
	boolean forward, back, right, left;
	
	public SPacketInput() {}
	
	public SPacketInput(boolean forward, boolean back, boolean right, boolean left) {
		this.forward = forward;
		this.back = back;
		this.right = right;
		this.left = left;
	}
	
	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(forward);
		buf.writeBoolean(back);
		buf.writeBoolean(right);
		buf.writeBoolean(left);
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		forward = buf.readBoolean();
		back = buf.readBoolean();
		right = buf.readBoolean();
		left = buf.readBoolean();
	}
	
	public static class Handler implements IMessageHandler<SPacketInput, IMessage> {
		
		@Override
		public IMessage onMessage(SPacketInput p, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
			player.getServer().addScheduledTask(() -> {
				if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle) {
					((EntityVehicle)player.getRidingEntity()).updateInput(p.forward, p.back, p.right, p.left, player);
				}
			});
			return null;
		}
	}
}
