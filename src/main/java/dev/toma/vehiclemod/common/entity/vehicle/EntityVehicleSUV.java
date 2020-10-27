package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.EnumVehicleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicleSUV extends EntityVehicle {

    public EntityVehicleSUV(World world) {
        super(world);
    }

    public EntityVehicleSUV(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public EnumVehicleType getVehicleType() {
        return EnumVehicleType.SUV;
    }
}
