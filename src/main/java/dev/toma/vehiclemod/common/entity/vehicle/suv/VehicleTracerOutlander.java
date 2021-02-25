package dev.toma.vehiclemod.common.entity.vehicle.suv;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleTracerOutlander extends EntityVehicleSUV {

    static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(1.7, 0.8, 0)
            .exhaust(-3.1, 0.2, 0.75)
            .sideNeons(1.0)
            .frontNeon(2.2)
            .backNeon(2.9)
            .nitroExit(1.0, 1.0, 0.9, -0.1, 0.2, 0.1)
            .nitroExit(1.0, 1.0, -0.9, -0.1, 0.2, -0.1)
            .nitroExit(2.2, 0.4, 1.0, -0.1, 0.05, 0.1)
            .nitroExit(2.2, 0.4, -1.0, -0.1, 0.05, -0.1)
            .build();

    public VehicleTracerOutlander(World world) {
        super(world);
    }

    public VehicleTracerOutlander(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.tracerOutlander;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public double getMountedYOffset() {
        return 0.2F;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.15;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.55 : 0.55;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder
                .create(this)
                .acc(VMSounds.TRACER_OUTLANDER_ACC)
                .brk(VMSounds.TRACER_OUTLANDER_BRAKE)
                .rls(VMSounds.TRACER_OUTLANDER_GAS)
                .str(VMSounds.TRACER_OUTLANDER_START)
                .starting(VMSounds.CAR_START_D)
                .honk(VMSounds.HORN_2)
                .build();
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 18);
    }

    @Override
    public PositionManager getVehiclePositions() {
        return POSITIONS;
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 4;
    }

    public static class VehicleTracerOutlanderT extends VehicleTracerOutlander {

        public VehicleTracerOutlanderT(World world) {
            super(world);
        }

        public VehicleTracerOutlanderT(World world, BlockPos pos) {
            super(world, pos);
        }
    }
}
