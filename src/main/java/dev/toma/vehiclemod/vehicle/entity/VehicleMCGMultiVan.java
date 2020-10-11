package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleMCGMultiVan extends EntityVehicle {

    static final Vector3f[] PARTS = {new Vector3f(2.2F, 0.2f, 0), new Vector3f(-3, 0.3f, 0)};
    VehicleSounds sounds;

    public VehicleMCGMultiVan(World world) {
        super(world);
        setSize(1.5f, 2.0f);
    }

    public VehicleMCGMultiVan(World world, BlockPos pos) {
        super(world, pos);
        setSize(1.5f, 2.0f);
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 54);
    }

    @Override
    public double getMountedYOffset() {
        return 0.22;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.mcgMultiVan;
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
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.MCGMV_ACC)
                .withBrakeSound(Registries.VMSounds.MCGMV_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.MCGMV_GAS)
                .build(this);
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.MCGMV_START;
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return 1.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id == 0 ? -0.3 : 0.3;
    }
}
