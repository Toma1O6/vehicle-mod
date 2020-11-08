package dev.toma.vehiclemod.common.entity.vehicle.standart;

import dev.toma.vehiclemod.common.entity.vehicle.EnumVehicleType;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleStandart extends EntityVehicle {

    EntityVehicleStandart(World world) {
        super(world);
    }

    EntityVehicleStandart(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.STANDART;
    }
}
