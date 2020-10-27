package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleMCGMultiVan extends EntityVehicleSpecial {

    static final Vector3f[] PARTS = {new Vector3f(2.2F, 0.2f, 0), new Vector3f(-3, 0.3f, 0)};

    public VehicleMCGMultiVan(World world) {
        super(world);
        setSize(1.5f, 2.0f);
    }

    public VehicleMCGMultiVan(World world, BlockPos pos) {
        super(world, pos);
        setSize(1.5f, 2.0f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 54);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.MCGMV_ACC)
                .brk(VMSounds.MCGMV_BRAKE)
                .rls(VMSounds.MCGMV_GAS)
                .str(VMSounds.MCGMV_START)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return 0.22;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.mcgMultiVan;
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
    protected double getPassengerOffsetX(int id) {
        return 1.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.3 : 0.3;
    }
}
