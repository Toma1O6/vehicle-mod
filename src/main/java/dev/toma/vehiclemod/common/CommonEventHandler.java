package dev.toma.vehiclemod.common;

import dev.toma.vehiclemod.common.ai.EntityAIAttackClosestTarget;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonEventHandler {

    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent e) {
        if(e.getEntity() instanceof EntityCreature) {
            EntityCreature livingEntity = (EntityCreature)e.getEntity();
            EntityAINearestAttackableTarget ai = getTaskToBeRemoved(livingEntity);
            boolean f = ai != null;
            boolean g = false;
            while(f) {
                g = true;
                livingEntity.targetTasks.removeTask(getTaskToBeRemoved(livingEntity));
                f = getTaskToBeRemoved(livingEntity) != null;
            }
            if(g) {
                livingEntity.targetTasks.addTask(1, new EntityAIAttackClosestTarget(livingEntity, true));
            }
            livingEntity.tasks.addTask(0, new EntityAIAvoidEntity<>(livingEntity, EntityVehicle.class, 20.0F, 1.5D, 1.2D));
            livingEntity.tasks.addTask(0, new EntityAIAvoidEntity<>(livingEntity, EntityMinecart.class, 20.0F, 1.5D, 1.2D));
        }
    }

    public static EntityAINearestAttackableTarget getTaskToBeRemoved(EntityCreature e) {
        for(EntityAITasks.EntityAITaskEntry ai : e.targetTasks.taskEntries) {
            if(ai.action.getClass() == EntityAINearestAttackableTarget.class) {
                return (EntityAINearestAttackableTarget) ai.action;
            }
        }
        return null;
    }
}
