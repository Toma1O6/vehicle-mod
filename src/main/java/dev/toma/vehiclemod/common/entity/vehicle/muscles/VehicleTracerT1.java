package dev.toma.vehiclemod.common.entity.vehicle.muscles;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleTracerT1 extends EntityVehicleMuscles {

    private static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.5, 0.5, 0)
            .exhaust(-2.2, 0.3, 0.3)
            .frontNeon(2.4)
            .backNeon(2.0)
            .rightNeon(0.85)
            .leftNeon(0.8)
            .frontLength(1.4)
            .sideLength(1.5)
            .backLength(1.4)
            .nitroExit(0.7, 0.8, 0.5, -0.13, 0.1, 0.1)
            .nitroExit(0.7, 0.8, -0.5, -0.13, 0.1, -0.1)
            .nitroExit(2.2, 0.3, 0.65, 0.1, 0.05, 0.05)
            .nitroExit(2.2, 0.3, -0.65, 0.1, 0.05, -0.05)
            .build();

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
                .honk(VMSounds.HORN_11)
                .starting(VMSounds.CAR_START_D)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.18;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 4;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.tracer_t1;
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
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.4 : 0.4;
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 1);
    }
}
