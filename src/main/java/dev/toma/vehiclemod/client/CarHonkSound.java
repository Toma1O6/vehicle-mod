package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;

public class CarHonkSound extends MovingSound {

    final EntityVehicle vehicle;

    public CarHonkSound(EntityVehicle vehicle) {
        super(vehicle.getSoundPack().honk(), SoundCategory.MASTER);
        this.vehicle = vehicle;
        this.repeat = false;
        this.attenuationType = AttenuationType.LINEAR;
    }

    @Override
    public void update() {
        if(vehicle.isDead) {
            donePlaying = true;
        } else {
            this.xPosF = (float)vehicle.posX;
            this.yPosF = (float)vehicle.posY;
            this.zPosF = (float)vehicle.posZ;
        }
    }
}
