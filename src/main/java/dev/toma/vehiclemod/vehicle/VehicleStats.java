package dev.toma.vehiclemod.vehicle;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.RequiresWorldRestart;

public final class VehicleStats {
	
	@Config.Name("Max Health")
	@RequiresWorldRestart
	public float maxHealth;
	
	@Config.Name("Max Speed")
	@RequiresWorldRestart
	public float maxSpeed;
	
	@Config.Name("Acceleration")
	@RequiresWorldRestart
	public float acceleration;
	
	@Config.Name("Turning Speed")
	@RequiresWorldRestart
	public float turnSpeed;
	
	@Config.Name("Max Turning Angle")
	@RequiresWorldRestart
	public float maxTurningAngle;
	
	@Config.Name("Braking Speed")
	@RequiresWorldRestart
	public float brakeSpeed;
	
	@Config.Name("Fuel Consumption")
	@RequiresWorldRestart
	public float fuelConsumption;
	
	public VehicleStats(float maxHP, float maxSpeed, float acceleration, float brakeSpeed, float turningSpeed, float maxAngle, float fuelConsumption) {
		this.maxHealth = maxHP;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
		this.turnSpeed = turningSpeed;
		this.maxTurningAngle = maxAngle;
		this.brakeSpeed = brakeSpeed;
		this.fuelConsumption = fuelConsumption;
	}
	
	public static void writeStatsToBuf(ByteBuf buf, VehicleStats stats) {
		buf.writeFloat(stats.maxHealth);
		buf.writeFloat(stats.maxSpeed);
		buf.writeFloat(stats.acceleration);
		buf.writeFloat(stats.turnSpeed);
		buf.writeFloat(stats.maxTurningAngle);
		buf.writeFloat(stats.brakeSpeed);
		buf.writeFloat(stats.fuelConsumption);
	}
	
	public static VehicleStats readStatsFromBuf(ByteBuf buf) {
		VehicleStats stats = new VehicleStats(0F, 0F, 0F, 0F, 0F, 0F, 0F);
		stats.maxHealth = buf.readFloat();
		stats.maxSpeed = buf.readFloat();
		stats.acceleration = buf.readFloat();
		stats.turnSpeed = buf.readFloat();
		stats.maxTurningAngle = buf.readFloat();
		stats.brakeSpeed = buf.readFloat();
		stats.fuelConsumption = buf.readFloat();
		return stats;
	}
}
