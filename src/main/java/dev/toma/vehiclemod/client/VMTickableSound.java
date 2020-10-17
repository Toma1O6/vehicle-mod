package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class VMTickableSound extends MovingSound {
	
	private final EntityVehicle vehicle;
	public final SoundEvent event;
	
	public VMTickableSound(SoundEvent event, EntityVehicle parent) {
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SoundEvent) {
			SoundEvent e = ((SoundEvent)obj);
			return e.getSoundName().equals(this.getSoundLocation());
		}
		return false;
	}
}