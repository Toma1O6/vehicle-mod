package dev.toma.vehiclemod.common.entity.vehicle.suv;

import dev.toma.vehiclemod.common.entity.vehicle.internals.EnumVehicleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleSUV extends EntityVehicle {

    EntityVehicleSUV(World world) {
        super(world);
    }

    EntityVehicleSUV(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.SUV;
    }
}
