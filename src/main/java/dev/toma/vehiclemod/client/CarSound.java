package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class CarSound extends MovingSound {
	
	private final EntityVehicle vehicle;
	public final SoundEvent event;
	
	public CarSound(SoundEvent event, EntityVehicle parent) {
		super(event, SoundCategory.MASTER);
		this.event = event;
		this.vehicle = parent;
		this.repeat = true;
		this.attenuationType = AttenuationType.LINEAR;
	}
	
	@Override
	public void update() {
		if(vehicle.isDead) {
			stopSound();
		} else {
			this.xPosF = (float)vehicle.posX;
			this.yPosF = (float)vehicle.posY;
			this.zPosF = (float)vehicle.posZ;
		}
	}
	
	public void stopSound() {
		this.donePlaying = true;
	}
}
