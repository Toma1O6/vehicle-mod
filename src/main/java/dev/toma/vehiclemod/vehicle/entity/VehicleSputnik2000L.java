package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnik2000L extends EntityVehicle {

    private VehicleSounds sounds;
    private static final Vector3f[] PARTS = {new Vector3f(1.7F, 0.5F, 0.0F), new Vector3f(-1.95F, 0.15F, 0.3F)};

    public VehicleSputnik2000L(World world) {
        super(world);
    }

    public VehicleSputnik2000L(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public double getMountedYOffset() {
        return -0.05;
    }

    @Override
    public String[] getVariants() {
        return DEF_COLORS;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.SPUTNIK_START;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.sputnik2000L;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    public VehicleSounds getSounds() {
        if(this.sounds == null) this.initSounds();
        return sounds;
    }

    @Override
    public void initSounds() {
        this.sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.SPUTNIK_ACC)
                .withBrakeSound(Registries.VMSounds.SPUTNIK_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.SPUTNIK_GAS)
                .build(this);
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return 0.1;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.4 : 0.4;
    }
}
