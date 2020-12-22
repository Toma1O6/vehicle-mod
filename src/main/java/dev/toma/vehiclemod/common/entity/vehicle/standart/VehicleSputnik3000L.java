package dev.toma.vehiclemod.common.entity.vehicle.standart;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleSputnik3000L extends EntityVehicleStandart {

    static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.75, 0.65, 0)
            .exhaust(-1.9, 0.25, 0.5)
            .frontNeon(2.3)
            .backNeon(1.8)
            .sideNeons(1.0)
            .backLength(1.4)
            .frontLength(1.6)
            .build();

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
                .starting(VMSounds.CAR_START_A)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 4;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.sputnik3000L;
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
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
