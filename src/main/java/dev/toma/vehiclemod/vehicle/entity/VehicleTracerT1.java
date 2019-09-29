package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VMTickableSound;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleTracerT1 extends EntityVehicle {

    private VehicleSounds sounds;
    private static final Vector3f[] VECTOR_3_FS = {new Vector3f(), new Vector3f()};

    public VehicleTracerT1(World world) {
        super(world);
    }

    public VehicleTracerT1(World world, BlockPos pos) {
        super(world, pos);
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
        return new Vector3f[] {new Vector3f(2, 1, 0), new Vector3f(-3.1F, 0.1F, 0.45F)};
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public void initSounds() {
        sounds = new VehicleSounds(
                new VMTickableSound(Registries.VMSounds.VEHICLE_IDLE, this),
                new VMTickableSound(Registries.VMSounds.TRACER_ACC, this),
                new VMTickableSound(Registries.VMSounds.TRACER_BRAKE, this),
                new VMTickableSound(Registries.VMSounds.TRACER_GAS, this),
                new VMTickableSound(Registries.VMSounds.TRACER_TOP_SPEED, this)
        );
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.3;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.6 : 0.5;
    }
}
