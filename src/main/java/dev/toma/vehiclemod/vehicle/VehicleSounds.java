package dev.toma.vehiclemod.vehicle;

public class VehicleSounds {
	
	public final VMTickableSound idle;
	private final VMTickableSound acceleration;
	private final VMTickableSound braking;
	private final VMTickableSound release;
	
	public VehicleSounds(VMTickableSound idle, VMTickableSound acc, VMTickableSound brake, VMTickableSound rls) {
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
	
	public void stopPlaying() {
		/*idle.stopSound();
		acceleration.stopSound();
		braking.stopSound();
		release.stopSound();*/
	}
}
