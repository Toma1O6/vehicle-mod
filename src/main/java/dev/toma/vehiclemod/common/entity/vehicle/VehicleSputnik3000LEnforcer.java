package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
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
    public VehicleStats getConfigStats() {
        return VMConfig.sputnik3000LEnf;
    }

    @Override
    public boolean canRepaint() {
        return false;
    }
}
