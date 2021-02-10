package dev.toma.vehiclemod.common.entity.vehicle.suv;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleTracerOutlander extends EntityVehicleSUV {

    public VehicleTracerOutlander(World world) {
        super(world);
    }

    public VehicleTracerOutlander(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleStats getConfigStats() {
        return VMConfig.tracerOutlander;
    }

    @Override
    public int maximumAmountOfPassengers() {
        return 2;
    }

    @Override
    public VehicleSoundPack createSoundPack() {
        return null;
    }

    @Override
    public VehicleContainer createInvetory() {
        return new VehicleContainer(this, 18);
    }

    @Override
    public PositionManager getVehiclePositions() {
        return PositionManager.Builder.create()
                .engine(0, 0, 0)
                .exhaust(0, 0, 0)
                .build();
    }
}
