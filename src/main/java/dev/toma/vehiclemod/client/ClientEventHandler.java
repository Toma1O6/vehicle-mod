package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.FuelHandler;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ClientEventHandler {
	
	public static void clientTick(TickEvent.ClientTickEvent e) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.player;
		SoundHandler sound = mc.getSoundHandler();
		if(player != null) {
			if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle) {
				EntityVehicle vehicle = (EntityVehicle)player.getRidingEntity();
				VehicleMod.proxy.playSoundAt(vehicle);
			}
		}
	}
	
	@SubscribeEvent
	public static void renderTooltip(ItemTooltipEvent e) {
		if(FuelHandler.instance().isFuel(e.getItemStack())) {
			String name = e.getItemStack().getItem().getRegistryName().getResourcePath();
			float f = name.contains("bottle") ? VMConfig.values.bottle : name.contains("bucket") ? VMConfig.values.bucket : VMConfig.values.other;
			e.getToolTip().add("Fuel: " + f + "l");
		}
	}
}
