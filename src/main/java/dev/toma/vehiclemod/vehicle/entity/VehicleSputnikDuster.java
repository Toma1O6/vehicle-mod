package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnikDuster extends EntityVehicle {

    static final Vector3f[] PARTS = {new Vector3f(2.0F, 0.4F, 0.0F), new Vector3f(-2.0F, 0.1F, 0.4F)};
    VehicleSounds sounds;

    public VehicleSputnikDuster(World world) {
        super(world);
    }

    public VehicleSputnikDuster(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 2.0f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public double getMountedYOffset() {
        return 0.2;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.sputnikDuster;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 4;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.SPUTNIK_DUSTER_START;
    }

    @Override
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        this.sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.SPUTNIK_DUSTER_ACC)
                .withBrakeSound(Registries.VMSounds.SPUTNIK_DUSTER_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.SPUTNIK_DUSTER_GAS)
                .build(this);
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.4 : -0.4;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.5 : 0.5;
    }
}
