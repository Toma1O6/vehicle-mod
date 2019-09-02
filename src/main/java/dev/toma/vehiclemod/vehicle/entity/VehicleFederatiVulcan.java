package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleFederatiVulcan extends EntityVehicle {

    private static final Vector3f[] VECTOR_3_FS = {new Vector3f(), new Vector3f()};
    private VehicleSounds sounds;

    public VehicleFederatiVulcan(World world) {
        super(world);
    }

    public VehicleFederatiVulcan(World world, BlockPos pos) {
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
        return VMConfig.federati_vulcan;
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
        sounds = new VehicleSounds(null, null, null, null);
    }
}
