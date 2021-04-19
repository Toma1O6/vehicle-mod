package dev.toma.vehiclemod.common.entity.vehicle.standart;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.PositionManager;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleProtonP1 extends EntityVehicleStandart {

    public static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.5, 0.45, 0)
            .exhaust(-2.3, 0.45, 0.6)
            .frontNeon(1.7)
            .backNeon(2.0)
            .sideNeons(0.85, -0.1)
            .frontLength(1.7)
            .sideLength(1.5)
            .backLength(1.7)
            .nitroExit(1.0, 0.9, 0.7, -0.1, 0.1, 0.1)
            .nitroExit(1.0, 0.9, -0.7, -0.1, 0.1, -0.1)
            .nitroExit(1.7, 0.5, 0.0, 0.1, 0.0, 0.0)
            .build();

    public VehicleProtonP1(World world) {
        super(world);
    }

    public VehicleProtonP1(World world, BlockPos pos) {
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
                .acc(VMSounds.PROTON_P1_ACC)
                .brk(VMSounds.PROTON_P1_BRAKE)
                .rls(VMSounds.PROTON_P1_GAS)
                .str(VMSounds.PROTON_P1_START)
                .honk(VMSounds.HORN_1)
                .starting(VMSounds.CAR_START_A)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.15;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 3;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.protonP1;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4: 0.4;
    }
}
