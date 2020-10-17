package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnikDuster extends EntityVehicle {

    static final Vector3f[] PARTS = {new Vector3f(2.0F, 0.4F, 0.0F), new Vector3f(-2.0F, 0.1F, 0.4F)};

    public VehicleSputnikDuster(World world) {
        super(world);
    }

    public VehicleSputnikDuster(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 2.0f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.SPUTNIK_DUSTER_ACC)
                .brk(VMSounds.SPUTNIK_DUSTER_BRAKE)
                .rls(VMSounds.SPUTNIK_DUSTER_GAS)
                .str(VMSounds.SPUTNIK_DUSTER_START)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return 0.2;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.sputnikDuster;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 4;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.4 : -0.4;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.5 : 0.5;
    }
}
