package dev.toma.vehiclemod.common.entity.vehicle.suv;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleSputnikDuster extends EntityVehicleSUV {

    static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(2.0, 0.65, 0)
            .exhaust(-2.0, 0.35, 0.4)
            .frontNeon(2.6)
            .backNeon(1.8)
            .sideNeons(1.1, 0.2)
            .frontLength(2.2)
            .backLength(1.8)
            .nitroExit(1.5, 1.2, 0.7, -0.05, 0.1, 0.1)
            .nitroExit(1.5, 1.2, -0.7, -0.05, 0.1, -0.1)
            .nitroExit(2.4, 0.6, 1.0, -0.1, 0.02, 0.1)
            .nitroExit(2.4, 0.6, -1.0, -0.1, 0.02, -0.1)
            .nitroExit(2.5, 0.6, 0.8, 0.15, 0.0, 0.0)
            .nitroExit(2.5, 0.6, -0.8, 0.15, 0.0, 0.0)
            .build();

    public VehicleSputnikDuster(World world) {
        super(world);
        setSize(2.0f, 1.75F);
    }

    public VehicleSputnikDuster(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.75F);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 18);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.SPUTNIK_DUSTER_ACC)
                .brk(VMSounds.SPUTNIK_DUSTER_BRAKE)
                .rls(VMSounds.SPUTNIK_DUSTER_GAS)
                .str(VMSounds.SPUTNIK_DUSTER_START)
                .honk(VMSounds.HORN_8)
                .starting(VMSounds.CAR_START_D)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return 0.3;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 6;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.vehicleConfig.sputnikDuster;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 4;
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
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
