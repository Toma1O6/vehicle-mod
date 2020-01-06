package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.List;

public class TileEntityPetrolPump extends TileEntity {

    public float storedAmount;
    @Nullable
    public EntityVehicle pairedVehicle;

    @Nullable
    public EntityVehicle pair(EnumFacing facing) {
        BlockPos pos = this.getPos().offset(facing, 2);
        this.pairedVehicle = this.nearestVehicle(pos);
        return this.pairedVehicle;
    }

    @Nullable
    private EntityVehicle nearestVehicle(BlockPos pos) {
        List<EntityVehicle> list = this.getWorld().getEntitiesWithinAABB(EntityVehicle.class, Block.FULL_BLOCK_AABB.offset(pos).grow(2));
        double latest = Double.MAX_VALUE;
        EntityVehicle vehicle = null;
        for(EntityVehicle v : list) {
            double d = this.distanceTo(v, pos);
            if(d < latest) {
                latest = d;
                vehicle = v;
            }
        }
        return vehicle;
    }

    private double distanceTo(Entity entity, BlockPos pos) {
        return Math.sqrt(sqr(entity.posX - pos.getX() + 0.5) + sqr(entity.posZ - pos.getZ() + 0.5));
    }

    private double sqr(double val) {
        return val * val;
    }
}
