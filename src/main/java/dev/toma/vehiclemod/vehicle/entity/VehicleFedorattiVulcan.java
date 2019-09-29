package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VMTickableSound;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleFedorattiVulcan extends EntityVehicle {

    private static final Vector3f[] VECTOR_3_FS = {new Vector3f(-1.8F, 1.3F, 0), new Vector3f(-2.9F, 0.3F, -0.8F), new Vector3f(-2.9F, 0.3F, 0.8F)};
    private VehicleSounds sounds;

    public VehicleFedorattiVulcan(World world) {
        super(world);
        setSize(2, 1.5F);
    }

    public VehicleFedorattiVulcan(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public String[] getVariants() {
        return DEF_COLORS;
    }

    @Override
    public Vector3f[] getPartVecs() {
        return VECTOR_3_FS;
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.fedoratti_vulcan;
    }

    @Override
    public SoundEvent getStartSound() {
        return Registries.VMSounds.FEDORATTI_START;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 5;
    }

    @Override
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        sounds = new VehicleSounds(
                new VMTickableSound(Registries.VMSounds.VEHICLE_IDLE, this),
                new VMTickableSound(Registries.VMSounds.FEDORATTI_ACC, this),
                new VMTickableSound(Registries.VMSounds.FEDORATTI_BRAKE, this),
                new VMTickableSound(Registries.VMSounds.FEDORATTI_GAS, this),
                new VMTickableSound(Registries.VMSounds.FEDORATTI_TOP_SPEED, this)
        );
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.6 : -0.3;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.5 : 0.65;
    }
}
