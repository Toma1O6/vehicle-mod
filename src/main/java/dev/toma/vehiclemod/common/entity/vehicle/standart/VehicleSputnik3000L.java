package dev.toma.vehiclemod.common.entity.vehicle.standart;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnik3000L extends EntityVehicleStandart {

    public static Vector3f[] PARTS = {new Vector3f(1.75F, 0.4F, 0), new Vector3f(-1.9F, 0, 0.5F)};

    public VehicleSputnik3000L(World world) {
        super(world);
    }

    public VehicleSputnik3000L(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.SPUTNIK3_ACC)
                .brk(VMSounds.SPUTNIK3_BRAKE)
                .rls(VMSounds.SPUTNIK3_GAS)
                .str(VMSounds.SPUTNIK3_START)
                .honk(VMSounds.HORN_11)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
    }

    @Override
    public VehicleStats getConfigStats() {
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
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.4 : -0.4;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4 : 0.4;
    }
}
