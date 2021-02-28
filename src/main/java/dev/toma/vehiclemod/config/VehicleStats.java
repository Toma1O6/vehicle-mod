package dev.toma.vehiclemod.config;

import dev.toma.vehiclemod.common.items.ItemPerk;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.common.tunning.StatModifier;
import dev.toma.vehiclemod.common.tunning.StatModifierType;
import dev.toma.vehiclemod.common.tunning.StatPackage;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	@Config.Ignore
	protected static List<VehicleStats> trackingList = new ArrayList<>();

	@Config.Name("Max Health")
	@Config.RequiresMcRestart
	public float maxHealth;
	
	@Config.Name("Max Speed")
	@Config.RequiresMcRestart
	public float maxSpeed;
	
	@Config.Name("Acceleration")
	@Config.RequiresMcRestart
	public float acceleration;
	
	@Config.Name("Turning Speed")
	@Config.RequiresMcRestart
	public float turnSpeed;
	
	@Config.Name("Max Turning Angle")
	@Config.RequiresMcRestart
	public float maxTurningAngle;
	
	@Config.Name("Braking Speed")
	@Config.RequiresMcRestart
	public float brakeSpeed;
	
	@Config.Name("Fuel Consumption")
	@Config.RequiresMcRestart
	public float fuelConsumption;

	@Config.Name("Fuel Capacity")
	@Config.RangeInt(min = 10)
	@Config.RequiresMcRestart
	public int fuelCapacity;

	@Config.Name("TPP Camera Offset")
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

	public VehicleStats track() {
		trackingList.add(this);
		calculateRanges();
		return this;
	}

	public static void initiateValueRefresh() {
		topSpeedMin = 500.0F;
		accelerationMin = 500.0F;
		handlingMin = 500.0F;
		brakingMin = 500.0F;
		topSpeedMax = 0.0F;
		accelerationMax = 0.0F;
		handlingMax = 0.0F;
		brakingMax = 0.0F;
		trackingList.forEach(VehicleStats::calculateRanges);
	}

	public static int getTotalVehicleRating(VehicleStats stats) {
		return getTopSpeedRating(stats) + getAccelerationRating(stats) + getBrakeRating(stats) + getHandlingRating(stats);
	}

	public static int getTopSpeedRating(VehicleStats stats) {
		float f = fix((stats.maxSpeed - topSpeedMin) / (topSpeedMax - topSpeedMin));
		return (int) (250 * f);
	}

	public static int getAccelerationRating(VehicleStats stats) {
		float f = fix((stats.acceleration - accelerationMin) / (accelerationMax - accelerationMin));
		return (int) (250 * f);
	}

	public static int getBrakeRating(VehicleStats stats) {
		float f = fix((stats.brakeSpeed - brakingMin) / (brakingMax - brakingMin));
		return (int) (250 * f);
	}

	public static int getHandlingRating(VehicleStats stats) {
		float f = fix((stats.turnSpeed - handlingMin) / (handlingMax - handlingMin));
		return (int) (250 * f);
	}

	public static float fix(float f) {
		return f > 0.999F ? 1.0F : f;
	}

	private void calculateRanges() {
		List<ItemPerk> perks = ForgeRegistries.ITEMS.getValuesCollection().stream().filter(it -> it instanceof ItemPerk && it.getRegistryName().getResourcePath().contains("gold")).map(i -> (ItemPerk) i).collect(Collectors.toList());
		float f0 = getTotalModifierWith(StatModifierType.TOP_SPEED, perks);
		if(maxSpeed < topSpeedMin) {
			topSpeedMin = maxSpeed;
		} else if(maxSpeed * f0 > topSpeedMax) {
			topSpeedMax = maxSpeed * f0;
		}
		float f1 = getTotalModifierWith(StatModifierType.ACCELERATION, perks);
		if(acceleration < accelerationMin) {
			accelerationMin = acceleration;
		} else if(acceleration * f1 > accelerationMax) {
			accelerationMax = acceleration * f1;
		}
		float f2 = getTotalModifierWith(StatModifierType.HANDLING, perks);
		if(turnSpeed < handlingMin) {
			handlingMin = turnSpeed;
		} else if(turnSpeed * f2 > handlingMax) {
			handlingMax = turnSpeed * f2;
		}
		float f3 = getTotalModifierWith(StatModifierType.BRAKING, perks);
		if(brakeSpeed < brakingMin) {
			brakingMin = brakeSpeed;
		} else if(brakeSpeed * f3 > brakingMax) {
			brakingMax = brakeSpeed * f3;
		}
	}

	private static float getTotalModifierWith(StatModifierType modifierType, List<ItemPerk> perks) {
		float f = 1.0F;
		for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
			StatPackage statPackage = type.getPackage();
			for (StatModifier modifier : statPackage.getModifiers()) {
				if(modifier.getType() == modifierType) {
					f += modifier.getValue(6);
				}
			}
		}
		for (ItemPerk perk : perks) {
			if(perk.getModifierType() == modifierType) {
				f += (perk.getValue() * 3);
			}
		}
		return f;
	}

	public static class Vector3i {

		@Config.Name("X")
		public int x;
		@Config.Name("Y")
		public int y;
		@Config.Name("Z")
		public int z;

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
