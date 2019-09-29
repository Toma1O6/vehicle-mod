package dev.toma.vehiclemod.common.ai;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityAIAttackClosestTarget extends EntityAINearestAttackableTarget<EntityPlayer> {

    public EntityAIAttackClosestTarget(EntityCreature entity, boolean inSight) {
        super(entity, EntityPlayer.class, inSight, false);
    }

    @Override
    public boolean shouldExecute() {
        if (VehicleMod.getRNG().nextInt(10) != 0) {
            return false;
        } else {
            this.targetEntity = this.getNearestEntity(taskOwner.world);
            return this.targetEntity != null;
        }
    }

    public EntityPlayer getNearestEntity(World world) {
        double d0 = 1000000;
        EntityPlayer closest = null;
        for(EntityPlayer player : world.playerEntities) {
            double d1 = this.distanceTo(player);
            boolean b = !player.isCreative() && !(player.getRidingEntity() instanceof EntityVehicle) && !(player.getRidingEntity() instanceof EntityMinecart);
            if(d1 < d0 && b) {
                d0 = d1;
                closest = player;
            }
        }
        return closest;
    }

    private double distanceTo(EntityLivingBase player) {
        return Math.sqrt(sqr(Math.sqrt(sqr(Math.abs(taskOwner.posX - player.posX)) + sqr(Math.abs(taskOwner.posZ - player.posZ)))) + sqr(Math.abs(taskOwner.posY - player.posY)));
    }

    private static double sqr(double d) {
        return d*d;
    }
}
