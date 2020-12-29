package dev.toma.vehiclemod.common.entity.vehicle.standart;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.standart.EntityVehicleStandart;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnik2000L extends EntityVehicleStandart {

    private static final PositionManager POSITIONS = PositionManager.Builder.create().engine(1.7, 0.75, 0).exhaust(new Vec3d(-1.95, 0.4, 0.3)).build();

    public VehicleSputnik2000L(World world) {
        super(world);
    }

    public VehicleSputnik2000L(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 3;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.SPUTNIK_ACC)
                .brk(VMSounds.SPUTNIK_BRAKE)
                .rls(VMSounds.SPUTNIK_GAS)
                .str(VMSounds.SPUTNIK_START)
                .honk(VMSounds.HORN_6)
                .starting(VMSounds.CAR_START_A)
                .build();
    }

    @Override
    public PositionManager getVehiclePositions() {
        return PositionManager.Builder.create()
                .engine(1.7, 0.75, 0)
                .exhaust(new Vec3d(-1.95, 0.4, 0.3))
                .frontNeon(2.2)
                .backNeon(1.8)
                .rightNeon(0.8)
                .leftNeon(0.85)
                .frontLength(1.4)
                .sideLength(1.4)
                .backLength(1.4)
                .nitroExit(1.0, 0.9, 0.7, -0.1, 0.1, 0.1)
                .nitroExit(1.0, 0.9, -0.7, -0.1, 0.1, -0.1)
                .nitroExit(2.0, 0.5, 0.0, 0.15, 0.02, 0)
                .build();
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public double getMountedYOffset() {
        return -0.05;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.sputnik2000L;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return 0.1;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.4 : 0.4;
    }
}
