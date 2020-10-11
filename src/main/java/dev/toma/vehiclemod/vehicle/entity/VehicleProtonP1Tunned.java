package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleProtonP1Tunned extends VehicleProtonP1 {

    static final Vector3f[] PARTS = {new Vector3f(1.5f, 0.2f, 0.0f), new Vector3f(-2.3f, 0.2f, 0.75f), new Vector3f(-2.3f, 0.2f, -0.75f)};

    public VehicleProtonP1Tunned(World world) {
        super(world);
    }

    public VehicleProtonP1Tunned(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.5f);
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.protonP1_tunned;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.PROTON_P1_TUNNED_START;
    }

    @Override
    public void initSounds() {
        this.sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.PROTON_P1_TUNNED_ACC)
                .withBrakeSound(Registries.VMSounds.PROTON_P1_TUNNED_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.PROTON_P1_TUNNED_GAS)
                .build(this);
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }
}
