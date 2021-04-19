package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.common.entity.vehicle.internals.NitroHandler;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class CarNitroSound extends MovingSound {

    final EntityVehicle vehicle;

    public CarNitroSound(SoundEvent event, EntityVehicle vehicle) {
        super(event, SoundCategory.MASTER);
        this.vehicle = vehicle;
        this.repeat = true;
    }

    @Override
    public void update() {
        NitroHandler handler = vehicle.getNitroHandler();
        if(vehicle.isDead || !handler.isNitroActive()) {
            donePlaying = true;
        } else {
            this.xPosF = (float)vehicle.posX;
            this.yPosF = (float)vehicle.posY;
            this.zPosF = (float)vehicle.posZ;
        }
    }
}
