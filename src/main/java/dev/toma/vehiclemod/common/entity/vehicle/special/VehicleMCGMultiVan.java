package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleMCGMultiVan extends EntityVehicleSpecial {

    private static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(2.2, 0.45, 0)
            .exhaust(-3, 0.55, 0)
            .frontNeon(2.5)
            .backNeon(2.4)
            .leftNeon(1.07)
            .rightNeon(1.0)
            .frontLength(1.9)
            .sideLength(2.9)
            .backLength(1.8)
            .nitroExit(2.2, 1.1, 0.6, -0.03, 0.15, 0.2)
            .nitroExit(2.2, 1.1, -0.5, -0.03, 0.15, -0.2)
            .nitroExit(2.4, 0.5, 0.0, 0.15, 0.02, 0.0)
            .build();

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
                .honk(VMSounds.HORN_15)
                .starting(VMSounds.CAR_START_E)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return 0.22;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 3;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.mcgMultiVan;
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
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
