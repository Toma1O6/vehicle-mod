package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.common.entity.vehicle.EnumVehicleType;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleSpecial extends EntityVehicle {

    EntityVehicleSpecial(World world) {
        super(world);
    }

    EntityVehicleSpecial(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.SPECIAL;
    }
}
