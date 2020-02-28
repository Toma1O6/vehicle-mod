package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleSputnik3000LEnforcer extends VehicleSputnik3000L {

    public VehicleSputnik3000LEnforcer(World world) {
        super(world);
        setSize(2.0f, 1.5f);
    }

    public VehicleSputnik3000LEnforcer(World world, BlockPos pos) {
        super(world, pos);
        setSize(2.0f, 1.5f);
    }

    @Override
    public VehicleStats getStats() {
        return VMConfig.sputnik3000LEnf;
    }

    @Override
    public boolean canRepaint() {
        return false;
    }
}
