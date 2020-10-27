package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.EnumVehicleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleSport extends EntityVehicle {

    public EntityVehicleSport(World world) {
        super(world);
    }

    public EntityVehicleSport(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.SPORT;
    }
}
