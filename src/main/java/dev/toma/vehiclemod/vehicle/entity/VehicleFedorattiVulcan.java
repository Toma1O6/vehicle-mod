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

    private static final Vector3f[] VECTOR_3_FS = {new Vector3f(-1.3F, 0.7F, 0), new Vector3f(-2.1F, 0.15F, -0.55F), new Vector3f(-2.1F, 0.15F, 0.55F)};
    private VehicleSounds sounds;

    public VehicleFedorattiVulcan(World world) {
        super(world);
        setSize(2, 1.5F);
    }

    public VehicleFedorattiVulcan(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public double getMountedYOffset() {
        return -0.1;
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
        return 4;
    }

    @Override
    public VehicleSounds getSounds() {
        return sounds;
    }

    @Override
    public void initSounds() {
        this.sounds = VehicleSounds.Builder.create()
                .withAccelerateSound(Registries.VMSounds.FEDORATTI_ACC)
                .withBrakeSound(Registries.VMSounds.FEDORATTI_BRAKE)
                .withGasReleaseSound(Registries.VMSounds.FEDORATTI_GAS)
                .withTopSpeedSound(Registries.VMSounds.FEDORATTI_TOP_SPEED)
                .build(this);
    }

    @Override
    protected double getPassengerOffsetX(int id) {
        return id < 2 ? 0.5 : -0.2;
    }

    @Override
    protected double getPassengerOffsetZ(int id) {
        return id % 2 == 0 ? -0.4 : 0.4;
    }
}
