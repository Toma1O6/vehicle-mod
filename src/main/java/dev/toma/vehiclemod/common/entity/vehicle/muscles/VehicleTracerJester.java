package dev.toma.vehiclemod.common.entity.vehicle.muscles;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class VehicleTracerJester extends EntityVehicleMuscles {

    static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.6, 0.7, 0)
            .exhaust(new Vec3d( -2.6, 0.3, 0.8), new Vec3d(-2.6, 0.3, -0.8))
            .sideNeons(0.9)
            .frontNeon(2.1)
            .backNeon(2.4)
            .nitroExit(0.9, 1.0, 0.8, -0.1, 0.1, 0.05)
            .nitroExit(0.9, 1.0, -0.8, -0.1, 0.1, -0.05)
            .nitroExit(2.0, 0.4, 0.9, -0.1, 0.05, 0.1)
            .nitroExit(2.0, 0.4, -0.9, -0.1, 0.05, -0.1)
            .build();

    public VehicleTracerJester(World world) {
        super(world);
    }

    public VehicleTracerJester(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 2);
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.tracerJester;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.TRACER_JESTER_ACC)
                .brk(VMSounds.TRACER_JESTER_BRAKE)
                .rls(VMSounds.TRACER_JESTER_GAS)
                .str(VMSounds.TRACER_JESTER_START)
                .starting(VMSounds.CAR_START_D)
                .honk(VMSounds.HORN_8)
                .build();
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 6;
    }

    @Override
    public double getMountedYOffset() {
        return -0.05;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.1;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.45 : 0.45;
    }
}
