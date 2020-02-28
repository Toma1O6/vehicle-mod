package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleBeamerPickup extends EntityVehicle {

    static final Vector3f[] PARTS = {new Vector3f(1.8f, 0.3f, 0), new Vector3f(-1.8f, 0f, 0f)};
    VehicleSounds sounds;

    public VehicleBeamerPickup(World world) {
        super(world);
        setSize(1.5f, 2.0f);
    }

    public VehicleBeamerPickup(World world, BlockPos pos) {
        super(world, pos);
        setSize(1.5f, 2.0f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 27);
    }

    @Override
    public double getMountedYOffset() {
        return 0.3;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.beamerPickup;
    }

    @Override
    public String[] getVariants() {
        return DEF_COLORS;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.BEAMERPICKUP_ACC)
                .withBrakeSound(Registries.VMSounds.BEAMERPICKUP_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.BEAMERPICKUP_GAS)
                .build(this);
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.BEAMERPICKUP_START;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return 1.4;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.35 : 0.35;
    }
}
