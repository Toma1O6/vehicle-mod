package dev.toma.vehiclemod.config;

import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.RequiresWorldRestart;

public final class VehicleStats {

	@Config.Ignore
	public static float topSpeedMin = 500.0F;
	@Config.Ignore
	public static float topSpeedMax;
	@Config.Ignore
	public static float accelerationMin = 500.0F;
	@Config.Ignore
	public static float accelerationMax;
	@Config.Ignore
	public static float handlingMin = 500.0F;
	@Config.Ignore
	public static float handlingMax;
	@Config.Ignore
	public static float brakingMin = 500.0F;
	@Config.Ignore
	public static float brakingMax;

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

	public VehicleStats calculateRanges() {
		float f0 = getTotalFrom(ItemVehicleUpgrade.Type.ECU.getModifiers()[0], ItemVehicleUpgrade.Type.ENGINE.getModifiers()[0], ItemVehicleUpgrade.Type.TRANSMISSION.getModifiers()[0]);
		if(maxSpeed < topSpeedMin) {
			topSpeedMin = maxSpeed;
		} else if(maxSpeed * f0 > topSpeedMax) {
			topSpeedMax = maxSpeed * f0;
		}
		float f1 = getTotalFrom(ItemVehicleUpgrade.Type.ECU.getModifiers()[1], ItemVehicleUpgrade.Type.TRANSMISSION.getModifiers()[1], ItemVehicleUpgrade.Type.TURBO.getModifiers()[0]);
		if(acceleration < accelerationMin) {
			accelerationMin = acceleration;
		} else if(acceleration * f1 > accelerationMax) {
			accelerationMax = acceleration * f1;
		}
		float f2 = getTotalFrom(ItemVehicleUpgrade.Type.SUSPENSION.getModifiers()[0], ItemVehicleUpgrade.Type.TIRES.getModifiers()[0]);
		if(turnSpeed < handlingMin) {
			handlingMin = turnSpeed;
		} else if(turnSpeed * f2 > handlingMax) {
			handlingMax = turnSpeed * f2;
		}
		float f3 = getTotalFrom(ItemVehicleUpgrade.Type.BRAKES.getModifiers()[0], ItemVehicleUpgrade.Type.TIRES.getModifiers()[1]);
		if(brakeSpeed < brakingMin) {
			brakingMin = brakeSpeed;
		} else if(brakeSpeed * f3 > brakingMax) {
			brakingMax = brakeSpeed * f3;
		}
		return this;
	}

	private static float getTotalFrom(float[]... floats) {
		float f0 = 1.0F;
		for (float[] f1 : floats) {
			f0 += f1[6];
		}
		return f0;
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
