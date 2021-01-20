package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketInput implements IMessage {
	
	int value;
	
	public SPacketInput() {}
	
	public SPacketInput(int value) {
		this.value = value;
	}
	
	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(value);
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		value = buf.readInt();
	}
	
	public static class Handler implements IMessageHandler<SPacketInput, IMessage> {
		
		@Override
		public IMessage onMessage(SPacketInput p, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
			player.getServer().addScheduledTask(() -> {
				if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle) {
					((EntityVehicle)player.getRidingEntity()).updateInput(p.value, player);
				}
			});
			return null;
		}
	}
}
