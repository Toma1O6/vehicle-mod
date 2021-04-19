package dev.toma.vehiclemod.common.entity.vehicle.sport;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleUpgrades;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class VehicleProtonP3 extends EntityVehicleSport {

    static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.5, 0.45, 0)
            .exhaust(new Vec3d( -2.3, 0.45, 0.65), new Vec3d(-2.3, 0.45, -0.65))
            .frontNeon(1.7)
            .backNeon(2.0)
            .sideNeons(0.85, -0.1)
            .frontLength(1.7)
            .sideLength(1.5)
            .backLength(1.7)
            .nitroExit(1.0, 0.9, 0.7, -0.1, 0.1, 0.1)
            .nitroExit(1.0, 0.9, -0.7, -0.1, 0.1, -0.1)
            .nitroExit(1.7, 0.5, 0.0, 0.1, 0.0, 0.0)
            .nitroExit(1.7, 0.5, 0.9, 0.1, 0.0, 0.1)
            .nitroExit(1.7, 0.5, -0.9, 0.1, 0.0, -0.1)
            .build();

    public VehicleProtonP3(World world) {
        super(world);
    }

    public VehicleProtonP3(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.5f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.PROTON_P3_ACC)
                .brk(VMSounds.PROTON_P3_BRAKE)
                .rls(VMSounds.PROTON_P3_GAS)
                .str(VMSounds.PROTON_P3_START)
                .honk(VMSounds.HORN_1)
                .starting(VMSounds.CAR_START_G)
                .build();
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.protonP3;
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 5;
    }

    @Override
    public double getMountedYOffset() {
        return -0.15;
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
        return id % 2 == 0 ? -0.4: 0.4;
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 3);
    }
}
