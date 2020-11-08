package dev.toma.vehiclemod.common.entity.vehicle.sport;

import dev.toma.vehiclemod.common.entity.vehicle.EnumVehicleType;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleSport extends EntityVehicle {

    EntityVehicleSport(World world) {
        super(world);
    }

    EntityVehicleSport(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.SPORT;
    }
}
