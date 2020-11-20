package dev.toma.vehiclemod.common.entity.vehicle.standart;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleProtonP1 extends EntityVehicleStandart {

    static final Vector3f[] PARTS = {new Vector3f(1.5f, 0.2f, 0.0f), new Vector3f(-2.3f, 0.2f, 0.6f)};

    public VehicleProtonP1(World world) {
        super(world);
    }

    public VehicleProtonP1(World world, BlockPos pos) {
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
                .acc(VMSounds.PROTON_P1_ACC)
                .brk(VMSounds.PROTON_P1_BRAKE)
                .rls(VMSounds.PROTON_P1_GAS)
                .str(VMSounds.PROTON_P1_START)
                .honk(VMSounds.HORN_1)
                .build();
    }

    @Override
    public double getMountedYOffset() {
        return -0.2;
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.protonP1;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return PARTS;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4: 0.4;
    }
}
