package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleProtonP1Tunned extends EntityVehicleSport {

    static final Vector3f[] PARTS = {new Vector3f(1.5f, 0.2f, 0.0f), new Vector3f(-2.3f, 0.2f, 0.75f), new Vector3f(-2.3f, 0.2f, -0.75f)};

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
                .build();
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.protonP1_tunned;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
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
