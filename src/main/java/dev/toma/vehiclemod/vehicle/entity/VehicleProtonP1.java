package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleProtonP1 extends EntityVehicle {

    VehicleSounds sounds;

    public VehicleProtonP1(World world) {
        super(world);
    }

    public VehicleProtonP1(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.5f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public double getMountedYOffset() {
        return 0.05;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.protonP1;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.PROTON_P1_START;
    }

    @Override
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        this.sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.PROTON_P1_ACC)
                .withBrakeSound(Registries.VMSounds.PROTON_P1_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.PROTON_P1_GAS)
                .build(this);
    }

    @Override
    public Vector3f[] getPartVecs() {
        return new Vector3f[] {new Vector3f(), new Vector3f()};
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.45: 0.45;
    }
}
