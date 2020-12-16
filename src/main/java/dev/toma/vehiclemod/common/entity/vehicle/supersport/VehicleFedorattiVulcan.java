package dev.toma.vehiclemod.common.entity.vehicle.supersport;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class VehicleFedorattiVulcan extends EntityVehicleSuperSport {

    private static final PositionManager POSITIONS = PositionManager.Builder.create().engine(-1.3, 0.95, 0).exhaust(new Vec3d(-2.1, 0.4, -0.55), new Vec3d(-2.1, 0.4, 0.55)).build();

    public VehicleFedorattiVulcan(World world) {
        super(world);
        setSize(2, 1.5F);
    }

    public VehicleFedorattiVulcan(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 5);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.FEDORATTI_ACC)
                .brk(VMSounds.FEDORATTI_BRAKE)
                .rls(VMSounds.FEDORATTI_GAS)
                .str(VMSounds.FEDORATTI_START)
                .honk(VMSounds.HORN_2)
                .starting(VMSounds.CAR_START_F)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.2;
    }

    @Override
    public PositionManager getVehiclePositions() {
        return PositionManager.Builder.create()
                .engine(-1.3, 0.95, 0)
                .exhaust(new Vec3d(-2.1, 0.4, -0.55), new Vec3d(-2.1, 0.4, 0.55))
                .frontNeon(3.3)
                .backNeon(1.9)
                .sideNeons(0.95, 0.15)
                .backLength(1.4)
                .frontLength(1.6)
                .build();
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.fedoratti_vulcan;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 4;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.5 : -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4 : 0.4;
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(getConfigStats(), fill(9, 4));
    }
}
