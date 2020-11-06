package dev.toma.vehiclemod.common;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

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

    @SubscribeEvent
    public static void logIn(PlayerEvent.PlayerLoggedInEvent event) {
        ForgeVersion.CheckResult result = ForgeVersion.getResult(Loader.instance().activeModContainer());
        switch (result.status) {
            case OUTDATED: case BETA_OUTDATED:
                TextComponentString textComponent = new TextComponentString(getMessageLogo() + TextFormatting.RED + " Your mod is " + TextFormatting.UNDERLINE + "outdated" + TextFormatting.RED + ". Click " + TextFormatting.ITALIC + "HERE" + TextFormatting.RESET.toString() + TextFormatting.RED + " to get latest update");
                String url = "https://www.curseforge.com/minecraft/mc-mods/tomanos-vehicle-mod";
                textComponent.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, url));
                event.player.sendMessage(textComponent);
                break;
            case AHEAD:
                event.player.sendMessage(new TextComponentString(getMessageLogo() + TextFormatting.GREEN + " You are using unofficial version. Expect bugs"));
                break;
            default:
                event.player.sendMessage(new TextComponentString(getMessageLogo() + TextFormatting.GREEN + " No updates available"));
                break;
        }
    }

    private static String getMessageLogo() {
        return TextFormatting.BLUE + "[" + TextFormatting.YELLOW + "VehicleMod" + TextFormatting.BLUE + "]" + TextFormatting.RESET;
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
