package dev.toma.vehiclemod.common;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.ISpecialVehicle;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayerMP;
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
                TextComponentString discordInvite = new TextComponentString(getMessageLogo() + TextFormatting.GREEN + " You can also join our Discord channel HERE");
                discordInvite.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/WEFYxwS8E3"));
                event.player.sendMessage(discordInvite);
                break;
        }
    }

    @SubscribeEvent
    public static void startTracking(net.minecraftforge.event.entity.player.PlayerEvent.StartTracking event) {
        if(event.getTarget() instanceof ISpecialVehicle) {
            ISpecialVehicle vehicle = (ISpecialVehicle) event.getTarget();
            vehicle.startTracking((EntityVehicle & ISpecialVehicle) vehicle, (EntityPlayerMP) event.getEntityPlayer());
        }
    }

    @SubscribeEvent
    public static void stopTracking(net.minecraftforge.event.entity.player.PlayerEvent.StopTracking event) {
        if(event.getTarget() instanceof ISpecialVehicle) {
            ISpecialVehicle vehicle = (ISpecialVehicle) event.getTarget();
            vehicle.stopTracking((EntityVehicle & ISpecialVehicle) vehicle, (EntityPlayerMP) event.getEntityPlayer());
        }
    }

    private static String getMessageLogo() {
        return TextFormatting.BLUE + "[" + TextFormatting.YELLOW + "VehicleMod" + TextFormatting.BLUE + "]" + TextFormatting.RESET;
    }
}
