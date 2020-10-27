package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleBeamerPickup extends EntityVehicleSpecial {

    static final Vector3f[] PARTS = {new Vector3f(1.8f, 0.3f, 0), new Vector3f(-1.8f, 0f, 0f)};

    public VehicleBeamerPickup(World world) {
        super(world);
    }

    public VehicleBeamerPickup(World world, BlockPos pos) {
        super(world, pos);
        setSize(1.5f, 2.0f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 36);
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return VehicleSoundPack.Builder.create(this)
                .acc(VMSounds.BEAMERPICKUP_ACC)
                .brk(VMSounds.BEAMERPICKUP_BRAKE)
                .rls(VMSounds.BEAMERPICKUP_GAS)
                .str(VMSounds.BEAMERPICKUP_START)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return 0.3;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.beamerPickup;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return 1.4;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.35 : 0.35;
    }
}
