package dev.toma.vehiclemod.common.entity.vehicle.muscles;

import dev.toma.vehiclemod.common.entity.vehicle.internals.EnumVehicleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleMuscles extends EntityVehicle {

    EntityVehicleMuscles(World world) {
        super(world);
    }

    EntityVehicleMuscles(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.MUSCLE;
    }
}
