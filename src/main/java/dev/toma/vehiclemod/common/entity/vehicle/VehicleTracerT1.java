package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleTracerT1 extends EntityVehicle {

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
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.TRACER_ACC)
                .brk(VMSounds.TRACER_BRAKE)
                .rls(VMSounds.TRACER_GAS)
                .str(VMSounds.TRACER_START)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.18;
    }

    @Override
    public VehicleStats getConfigStats() {
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
    protected double getPassengerOffsetX(int id) {
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.4 : 0.4;
    }
}
