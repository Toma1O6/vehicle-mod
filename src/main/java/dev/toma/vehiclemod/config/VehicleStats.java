package dev.toma.vehiclemod.config;

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

	@Config.Name("Fuel Capacity")
	@Config.RangeInt(min = 10)
	@RequiresWorldRestart
	public int fuelCapacity;

	@Config.Name("TPP Camera Offset")
	@RequiresWorldRestart
	public Vector3i cameraOff;
	
	public VehicleStats(float maxHP, float maxSpeed, float acceleration, float brakeSpeed, float turningSpeed, float maxAngle, float fuelConsumption, int capacity, Vector3i offset) {
		this.maxHealth = maxHP;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
		this.turnSpeed = turningSpeed;
		this.maxTurningAngle = maxAngle;
		this.brakeSpeed = brakeSpeed;
		this.fuelConsumption = fuelConsumption;
		this.fuelCapacity = capacity;
		this.cameraOff = offset;
	}

	public VehicleStats(float maxHP, float maxSpeed, float acceleration, float brakeSpeed, float turningSpeed, float maxAngle, float fuelConsumption, int capacity) {
		this(maxHP, maxSpeed, acceleration, brakeSpeed, turningSpeed, maxAngle, fuelConsumption, capacity, new Vector3i(0, 0, 0));
	}
	
	public static void writeStatsToBuf(ByteBuf buf, VehicleStats stats) {
		buf.writeFloat(stats.maxHealth);
		buf.writeFloat(stats.maxSpeed);
		buf.writeFloat(stats.acceleration);
		buf.writeFloat(stats.turnSpeed);
		buf.writeFloat(stats.maxTurningAngle);
		buf.writeFloat(stats.brakeSpeed);
		buf.writeFloat(stats.fuelConsumption);
		buf.writeInt(stats.fuelCapacity);
		stats.cameraOff.toBuffer(buf);
	}
	
	public static VehicleStats readStatsFromBuf(ByteBuf buf) {
		VehicleStats stats = new VehicleStats(0F, 0F, 0F, 0F, 0F, 0F, 0F, 10);
		stats.maxHealth = buf.readFloat();
		stats.maxSpeed = buf.readFloat();
		stats.acceleration = buf.readFloat();
		stats.turnSpeed = buf.readFloat();
		stats.maxTurningAngle = buf.readFloat();
		stats.brakeSpeed = buf.readFloat();
		stats.fuelConsumption = buf.readFloat();
		stats.fuelCapacity = buf.readInt();
		stats.cameraOff.fromBuffer(buf);
		return stats;
	}

	public static class Vector3i {

		private int x, y, z;

		public Vector3i(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public int getZ() {
			return z;
		}

		public void toBuffer(ByteBuf buf) {
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
		}

		public void fromBuffer(ByteBuf buf) {
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
		}
	}
}
