package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnik3000L extends EntityVehicle {

    VehicleSounds sounds;
    static Vector3f[] PARTS = {new Vector3f(1.75F, 0.4F, 0), new Vector3f(-1.9F, 0, 0.5F)};

    public VehicleSputnik3000L(World world) {
        super(world);
        setSize(2.0f, 1.5f);
    }

    public VehicleSputnik3000L(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0F, 1.5F);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.sputnik3000L;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 4;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.SPUTNIK3_START;
    }

    @Override
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.SPUTNIK3_ACC)
                .withBrakeSound(Registries.VMSounds.SPUTNIK3_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.SPUTNIK3_GAS)
                .build(this);
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.4 : -0.4;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4 : 0.4;
    }
}
