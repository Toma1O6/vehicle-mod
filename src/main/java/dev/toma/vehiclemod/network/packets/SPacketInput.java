package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.internals.IDriveable;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SPacketInput implements IMessage {
	
	byte value;
	int driveableID;
	
	public SPacketInput() {}
	
	public SPacketInput(byte value, int driveableID) {
		this.value = value;
		this.driveableID = driveableID;
	}
	
	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeByte(value);
		buf.writeInt(driveableID);
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		value = buf.readByte();
		driveableID = buf.readInt();
	}
	
	public static class Handler implements IMessageHandler<SPacketInput, IMessage> {
		
		@Override
		public IMessage onMessage(SPacketInput packet, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
			player.getServer().addScheduledTask(() -> {
				Entity entity = player.world.getEntityByID(packet.driveableID);
				if(entity instanceof IDriveable) {
					IDriveable driveable = (IDriveable) entity;
					if(driveable.shouldAcceptInputFrom(player)) {
						driveable.handleInputs(packet.value);
					}
				}
			});
			return null;
		}
	}
}
