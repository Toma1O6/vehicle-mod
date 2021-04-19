package dev.toma.vehiclemod.network.packets;

import dev.toma.vehiclemod.common.entity.vehicle.internals.EnumVehicleState;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CPacketVehicleData implements IMessage {

	private int vehicleID;
	private float currentSpeed, turnModifier, health, fuel;
	private EnumVehicleState state;
	
	public CPacketVehicleData() {
	}
	
	public CPacketVehicleData(EntityVehicle vehicle) {
		this.vehicleID = vehicle.getEntityId();
		this.currentSpeed = vehicle.currentSpeed;
		this.turnModifier = vehicle.turnModifier;
		this.health = vehicle.health;
		this.fuel = vehicle.fuel;
		this.state = vehicle.currentState;
	}
	
	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(vehicleID);
		buf.writeFloat(currentSpeed);
		buf.writeFloat(turnModifier);
		buf.writeFloat(health);
		buf.writeFloat(fuel);
		buf.writeInt(state.ordinal());
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		vehicleID = buf.readInt();
		currentSpeed = buf.readFloat();
		turnModifier = buf.readFloat();
		health = buf.readFloat();
		fuel = buf.readFloat();
		state = EnumVehicleState.values()[buf.readInt()];
	}
	
	public static class Handler implements IMessageHandler<CPacketVehicleData, IMessage> {
		
		@Override
		public IMessage onMessage(CPacketVehicleData message, MessageContext ctx) {
			if(ctx.side.isClient()) {
				Minecraft.getMinecraft().addScheduledTask(() -> handle(message));
			}
			return null;
		}
		
		public static void handle(CPacketVehicleData p) {
			World world = Minecraft.getMinecraft().player.world;
			Entity e = world.getEntityByID(p.vehicleID);
			if(e != null) {
				if(e instanceof EntityVehicle) {
					EntityVehicle car = (EntityVehicle)e;
					car.currentSpeed = p.currentSpeed;
					car.turnModifier = p.turnModifier;
					car.health = p.health;
					car.fuel = p.fuel;
					car.currentState = p.state;
				}
			}
		}
	}
}
