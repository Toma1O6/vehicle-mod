package dev.toma.vehiclemod.common.entity.vehicle.sport;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleProtonP9X extends EntityVehicleSport {

    static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.5, 0.6, 0)
            .exhaust(-2.4, 0.2, 0.65)
            .sideNeons(1.05, -0.15)
            .frontNeon(2.1)
            .backNeon(2.1)
            .nitroExit(0.8, 0.9, 0.8, -0.12, 0.1, 0.1)
            .nitroExit(0.8, 0.9, -0.8, -0.12, 0.1, -0.1)
            .nitroExit(2.0, 0.5, 1.0, 0.08, -0.05, 0.1)
            .nitroExit(2.0, 0.5, -1.0, 0.08, -0.05, -0.1)
            .build();

    public VehicleProtonP9X(World world) {
        super(world);
    }

    public VehicleProtonP9X(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.protonP9X;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.PROTON_P9X_ACC)
                .brk(VMSounds.PROTON_P9X_BRAKE)
                .rls(VMSounds.PROTON_P9X_GAS)
                .str(VMSounds.PROTON_P9X_START)
                .starting(VMSounds.CAR_START_G)
                .honk(VMSounds.HORN_1)
                .build();
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
    }

    @Override
    public double getMountedYOffset() {
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.45 : 0.45;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 4;
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 3);
    }
}
