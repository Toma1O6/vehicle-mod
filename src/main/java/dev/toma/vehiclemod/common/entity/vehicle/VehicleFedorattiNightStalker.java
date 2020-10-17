package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.config.VehicleStats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleFedorattiNightStalker extends EntityVehicle {

    static final Vector3f[] PARTS = {new Vector3f(-1.5F, 0.4F, 0.0F), new Vector3f(-2.25F, 0.2F, 0.0F)};

    public VehicleFedorattiNightStalker(World world) {
        super(world);
    }

    public VehicleFedorattiNightStalker(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.5f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 5);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.FEDORATTI_NIGHTSTALKER_ACC)
                .brk(VMSounds.FEDORATTI_NIGHTSTALKER_BRAKE)
                .rls(VMSounds.FEDORATTI_NIGHTSTALKER_GAS)
                .str(VMSounds.FEDORATTI_NIGHTSTALKER_START)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.2;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.fedorattiNightStalker;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return 0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4 : 0.4;
    }
}
