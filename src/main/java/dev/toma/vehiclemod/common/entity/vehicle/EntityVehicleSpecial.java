package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.EnumVehicleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleSpecial extends EntityVehicle {

    public EntityVehicleSpecial(World world) {
        super(world);
    }

    public EntityVehicleSpecial(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.SPECIAL;
    }
}
