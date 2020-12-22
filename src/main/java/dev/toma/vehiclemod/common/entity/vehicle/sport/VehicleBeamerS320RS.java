package dev.toma.vehiclemod.common.entity.vehicle.sport;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleBeamerS320RS extends EntityVehicleSport {

    private static final PositionManager POSITIONS = PositionManager.Builder.create().engine(1.5, 0.65, 0.0).exhaust(new Vec3d(-2.2, 0.55, 0.7), new Vec3d(-2.2, 0.55, -0.8)).build();

    public VehicleBeamerS320RS(World world) {
        super(world);
    }

    public VehicleBeamerS320RS(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public int getNitroCloudSpraySlotCount() {
        return 5;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.BEAMERB1_ACC)
                .brk(VMSounds.BEAMERB1_BRAKE)
                .rls(VMSounds.BEAMERB1_GAS)
                .str(VMSounds.BEAMERB1_START)
                .honk(VMSounds.HORN_13)
                .starting(VMSounds.CAR_START_C)
                .build();
    }

    @Override
    public PositionManager getVehiclePositions() {
        return PositionManager.Builder.create()
                .engine(1.5, 0.65, 0.0)
                .exhaust(new Vec3d(-2.2, 0.55, 0.7), new Vec3d(-2.2, 0.55, -0.8))
                .frontNeon(2.0)
                .backNeon(1.9)
                .frontLength(1.8)
                .sideNeons(1.0, -0.1)
                .backLength(0.9)
                .build();
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.beamers320rs;
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 4;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.15 : -0.65;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        double d = 0.4;
        return id % 2 == 0 ? -d : d;
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(getConfigStats(), fill(9, 2));
    }
}
