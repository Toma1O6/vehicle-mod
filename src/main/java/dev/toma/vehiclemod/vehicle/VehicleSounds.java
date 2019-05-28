package dev.toma.vehiclemod.vehicle;

import net.minecraft.util.SoundEvent;

public class VehicleSounds {
	
	public static final SoundEvent IDLE = null;
	private final SoundEvent acceleration;
	private final SoundEvent braking;
	private final SoundEvent release;
	
	public VehicleSounds(SoundEvent acc, SoundEvent brake, SoundEvent rls) {
		this.acceleration = acc;
		this.braking = brake;
		this.release = rls;
	}
	
	public SoundEvent getAccelerateSound() {
		return acceleration;
	}
	
	public SoundEvent getBrakeSound() {
		return braking;
	}
	
	public SoundEvent getGasReleaseSound() {
		return release;
	}
}
