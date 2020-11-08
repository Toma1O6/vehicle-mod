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

public class VehicleFedorattiVulcan extends EntityVehicleSport {

    private static final Vector3f[] VECTOR_3_FS = {new Vector3f(-1.3F, 0.7F, 0), new Vector3f(-2.1F, 0.15F, -0.55F), new Vector3f(-2.1F, 0.15F, 0.55F)};

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
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return VECTOR_3_FS;
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
