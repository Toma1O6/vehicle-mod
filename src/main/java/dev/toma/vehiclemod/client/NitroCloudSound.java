package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.client.audio.ITickableSound;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.util.SoundCategory;

public class NitroCloudSound extends PositionedSound implements ITickableSound {

    private final EntityVehicle vehicle;

    public NitroCloudSound(EntityVehicle vehicle) {
        super(VMSounds.NITRO_CLOUD, SoundCategory.MASTER);
        this.vehicle = vehicle;
        this.repeat = true;
        this.xPosF = (float) vehicle.posX;
        this.yPosF = (float) vehicle.posY;
        this.zPosF = (float) vehicle.posZ;
    }

    @Override
    public boolean isDonePlaying() {
        return vehicle.isDead || !vehicle.getNitroHandler().areCloudsActive();
    }

    @Override
    public void update() {

    }
}
