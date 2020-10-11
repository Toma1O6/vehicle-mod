package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleFedorattiNightStalker extends EntityVehicle {

    static final Vector3f[] PARTS = {new Vector3f(-1.5F, 0.4F, 0.0F), new Vector3f(-2.25F, 0.2F, 0.0F)};
    VehicleSounds sounds;

    public VehicleFedorattiNightStalker(World world) {
        super(world);
    }

    public VehicleFedorattiNightStalker(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.5f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 5);
    }

    @Override
    public double getMountedYOffset() {
        return -0.2;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.fedorattiNightStalker;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.FEDORATTI_NIGHTSTALKER_START;
    }

    @Override
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        this.sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.FEDORATTI_NIGHTSTALKER_ACC)
                .withBrakeSound(Registries.VMSounds.FEDORATTI_NIGHTSTALKER_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.FEDORATTI_NIGHTSTALKER_GAS)
                .build(this);
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return 0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4 : 0.4;
    }
}
