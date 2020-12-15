package dev.toma.vehiclemod.common.entity.vehicle.supersport;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleFedorattiNightStalker extends EntityVehicleSuperSport {

    static final PositionManager POSITIONS = PositionManager.Builder.create()
            .engine(-1.5, 0.65, 0)
            .exhaust(-2.25, 0.45, 0)
            .frontNeon(2.75)
            .backNeon(2.3)
            .sideNeons(1.0)
            .length(2.5)
            .build();

    public VehicleFedorattiNightStalker(World world) {
        super(world);
    }

    public VehicleFedorattiNightStalker(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.5f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 5);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.FEDORATTI_NIGHTSTALKER_ACC)
                .brk(VMSounds.FEDORATTI_NIGHTSTALKER_BRAKE)
                .rls(VMSounds.FEDORATTI_NIGHTSTALKER_GAS)
                .str(VMSounds.FEDORATTI_NIGHTSTALKER_START)
                .honk(VMSounds.HORN_5)
                .starting(VMSounds.CAR_START_B)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.2;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.fedorattiNightStalker;
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
        return 0.2;
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
