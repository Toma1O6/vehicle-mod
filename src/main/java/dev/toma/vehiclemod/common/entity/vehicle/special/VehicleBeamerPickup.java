package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleBeamerPickup extends EntityVehicleSpecial {

    private static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.8, 0.55, 0)
            .exhaust(-1.8, 0.25, 0)
            .frontNeon(2.0)
            .backNeon(1.5)
            .sideNeons(0.85, 0.2)
            .frontLength(1.6)
            .sideLength(1.4)
            .backLength(1.4)
            .nitroExit(2.0, 0.6, 0.75, -0.05, 0.1, 0.1)
            .nitroExit(2.0, 0.6, -0.75, -0.05, 0.1, -0.1)
            .build();

    public VehicleBeamerPickup(World world) {
        super(world);
    }

    public VehicleBeamerPickup(World world, BlockPos pos) {
        super(world, pos);
        setSize(1.5f, 2.0f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 36);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.BEAMERPICKUP_ACC)
                .brk(VMSounds.BEAMERPICKUP_BRAKE)
                .rls(VMSounds.BEAMERPICKUP_GAS)
                .str(VMSounds.BEAMERPICKUP_START)
                .honk(VMSounds.HORN_9)
                .starting(VMSounds.CAR_START_E)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return 0.3;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 2;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.beamerPickup;
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
        return 1.4;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.35 : 0.35;
    }
}
