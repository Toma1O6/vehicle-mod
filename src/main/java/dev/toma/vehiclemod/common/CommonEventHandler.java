package dev.toma.vehiclemod.common;

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
            EntityAINearestAttackableTarget<?> ai = getTaskToBeRemoved(livingEntity);
            EntityAITasks.EntityAITaskEntry[] entries = ((EntityCreature) e.getEntity()).targetTasks.taskEntries.toArray(new EntityAITasks.EntityAITaskEntry[0]);
            for (EntityAITasks.EntityAITaskEntry entry : entries) {
                if (entry.action instanceof EntityAINearestAttackableTarget<?>) {
                    livingEntity.targetTasks.removeTask(entry.action);
                    livingEntity.targetTasks.addTask(3, entry.action);
                }
            }
            livingEntity.tasks.addTask(0, new EntityAIAvoidEntity<>(livingEntity, EntityVehicle.class, 20.0F, 1.5D, 1.2D));
            livingEntity.tasks.addTask(0, new EntityAIAvoidEntity<>(livingEntity, EntityMinecart.class, 20.0F, 1.5D, 1.2D));
        }
    }

    public static EntityAINearestAttackableTarget<?> getTaskToBeRemoved(EntityCreature e) {
        for(EntityAITasks.EntityAITaskEntry ai : e.targetTasks.taskEntries) {
            if(ai.action.getClass() == EntityAINearestAttackableTarget.class) {
                return (EntityAINearestAttackableTarget<?>) ai.action;
            }
        }
        return null;
    }
}
