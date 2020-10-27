package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.EnumVehicleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleStandart extends EntityVehicle {

    public EntityVehicleStandart(World world) {
        super(world);
    }

    public EntityVehicleStandart(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.STANDART;
    }
}
