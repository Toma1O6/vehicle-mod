package dev.toma.vehiclemod.common.entity.vehicle.supersport;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.EnumVehicleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleSuperSport extends EntityVehicle {

    EntityVehicleSuperSport(World world) {
        super(world);
    }

    EntityVehicleSuperSport(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.SUPER;
    }
}
