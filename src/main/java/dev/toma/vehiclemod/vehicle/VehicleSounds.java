package dev.toma.vehiclemod.vehicle;

import com.google.common.base.Preconditions;
import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.util.SoundEvent;

public class VehicleSounds {
	
	public final VMTickableSound idle;
	private final VMTickableSound acceleration;
	private final VMTickableSound braking;
	private final VMTickableSound release;
	
	private VehicleSounds(VMTickableSound idle, VMTickableSound acc, VMTickableSound brake, VMTickableSound rls) {
		this.idle = idle;
		this.acceleration = acc;
		this.braking = brake;
		this.release = rls;
	}
	
	public VMTickableSound getAccelerateSound() {
		return acceleration;
	}
	
	public VMTickableSound getBrakeSound() {
		return braking;
	}
	
	public VMTickableSound getGasReleaseSound() {
		return release;
	}

	public static class Builder {

		private SoundEvent acc, brake, rls;

		private Builder() {

		}

		public static Builder create() {
			return new Builder();
		}

		public Builder withAccelerateSound(SoundEvent event) {
			this.acc = event;
			return this;
		}

		public Builder withBrakeSound(SoundEvent event) {
			this.brake = event;
			return this;
		}

		public Builder withGasReleaseSound(SoundEvent event) {
			this.rls = event;
			return this;
		}

		public VehicleSounds build(EntityVehicle vehicle) {
			Preconditions.checkNotNull(acc, "Not building: Accelerate sound cannot be null!");
			Preconditions.checkNotNull(brake, "Not building: Brake sound cannot be null");
			Preconditions.checkNotNull(rls, "Not building: Gas release sound cannot be null!");
			VMTickableSound IDLE = new VMTickableSound(Registries.VMSounds.VEHICLE_IDLE, vehicle);
			VMTickableSound ACC = new VMTickableSound(this.acc, vehicle);
			VMTickableSound BRAKE = new VMTickableSound(this.brake, vehicle);
			VMTickableSound RELEASE = new VMTickableSound(this.rls, vehicle);
			return new VehicleSounds(IDLE, ACC, BRAKE, RELEASE);
		}
	}
}
