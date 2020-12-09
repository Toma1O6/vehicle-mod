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

public class VehicleProtonP1Tunned extends EntityVehicleSport {

    static final PositionManager POSITIONS = PositionManager.Builder.create().engine(1.5, 0.45, 0).exhaust(new Vec3d(-2.3, 0.45, 0.75), new Vec3d(-2.3, 0.45, -0.75)).build();

    public VehicleProtonP1Tunned(World world) {
        super(world);
    }

    public VehicleProtonP1Tunned(World world, BlockPos pos) {
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
                .acc(VMSounds.PROTON_P1_TUNNED_ACC)
                .brk(VMSounds.PROTON_P1_TUNNED_BRAKE)
                .rls(VMSounds.PROTON_P1_TUNNED_GAS)
                .str(VMSounds.PROTON_P1_TUNNED_START)
                .honk(VMSounds.HORN_1)
                .starting(VMSounds.CAR_START_G)
                .build();
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.protonP1_tunned;
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
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4: 0.4;
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(getConfigStats(), fill(9, 3));
    }
}
