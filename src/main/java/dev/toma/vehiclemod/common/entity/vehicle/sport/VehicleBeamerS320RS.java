package dev.toma.vehiclemod.common.entity.vehicle.sport;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.common.entity.vehicle.sport.EntityVehicleSport;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleBeamerS320RS extends EntityVehicleSport {

    static final Vector3f[] PARTS = {new Vector3f(1.5F, 0.4F, 0.0F), new Vector3f(-2.2F, 0.3F, 0.7F), new Vector3f(-2.2f, 0.3F, -0.8F)};

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
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.BEAMERB1_ACC)
                .brk(VMSounds.BEAMERB1_BRAKE)
                .rls(VMSounds.BEAMERB1_GAS)
                .str(VMSounds.BEAMERB1_START)
                .build();
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
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
