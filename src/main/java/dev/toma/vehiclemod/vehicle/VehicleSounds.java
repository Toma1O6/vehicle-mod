package dev.toma.vehiclemod.vehicle;

public class VehicleSounds {
	
	public final VMTickableSound idle;
	private final VMTickableSound acceleration;
	private final VMTickableSound braking;
	private final VMTickableSound release;
	private final VMTickableSound topSpeed;
	
	public VehicleSounds(VMTickableSound idle, VMTickableSound acc, VMTickableSound brake, VMTickableSound rls, VMTickableSound topSpeed) {
		this.idle = idle;
		this.acceleration = acc;
		this.braking = brake;
		this.release = rls;
		this.topSpeed = topSpeed;
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

	public VMTickableSound getTopSpeedSound() {
		return topSpeed;
	}
}
