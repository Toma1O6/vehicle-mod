package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleBeamerS320RS extends EntityVehicle {

    static final Vector3f[] PARTS = {new Vector3f(1.5F, 0.4F, 0.0F), new Vector3f(-2.2F, 0.3F, 0.7F), new Vector3f(-2.2f, 0.3F, -0.8F)};
    VehicleSounds sounds;

    public VehicleBeamerS320RS(World world) {
        super(world);
        setSize(2.0f, 1.5f);
        health = getStats().maxHealth;
    }

    public VehicleBeamerS320RS(World world, BlockPos pos) {
        this(world);
        setPosition(pos.getX(), pos.getY()+1, pos.getZ());
        health = getStats().maxHealth;
        setFuel();
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.beamers320rs;
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 4;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.BEAMERB1_START;
    }

    @Override
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.BEAMERB1_ACC)
                .withBrakeSound(Registries.VMSounds.BEAMERB1_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.BEAMERB1_GAS)
                .build(this);
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.15 : -0.65;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        double d = 0.4;
        return id % 2 == 0 ? -d : d;
    }
}
