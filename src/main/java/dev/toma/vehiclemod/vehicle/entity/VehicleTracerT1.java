package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleTracerT1 extends EntityVehicle {

    private VehicleSounds sounds;
    private static final Vector3f[] VECTOR_3_FS = {new Vector3f(1.5F, 0.25F, 0), new Vector3f(-2.2F, 0.05F, 0.3F)};

    public VehicleTracerT1(World world) {
        super(world);
    }

    public VehicleTracerT1(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public double getMountedYOffset() {
        return -0.18;
    }

    @Override
    public String[] getVariants() {
        return DEF_COLORS;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.TRACER_START;
    }

    @Override
    public VehicleSounds getSounds() {
        if(sounds == null) this.initSounds();
        return sounds;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.tracer_t1;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return VECTOR_3_FS;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public void initSounds() {
        sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.TRACER_ACC)
                .withBrakeSound(Registries.VMSounds.TRACER_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.TRACER_GAS)
                .build(this);
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.4 : 0.4;
    }
}
