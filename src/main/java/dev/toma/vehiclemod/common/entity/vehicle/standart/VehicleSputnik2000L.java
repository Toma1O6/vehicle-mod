package dev.toma.vehiclemod.common.entity.vehicle.standart;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.standart.EntityVehicleStandart;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleSputnik2000L extends EntityVehicleStandart {

    private static final Vector3f[] PARTS = {new Vector3f(1.7F, 0.5F, 0.0F), new Vector3f(-1.95F, 0.15F, 0.3F)};

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
    public Vector3f[] getPartVecs() {
        return PARTS;
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
