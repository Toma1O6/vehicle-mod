package dev.toma.vehiclemod;

import javax.vecmath.Vector3f;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RequiresWorldRestart;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = VehicleMod.Constants.ID, name = VehicleMod.Constants.NAME + " Config")
public class VMConfig {
	
	@Name("Simple Vehicle Control")
	public static boolean simpleVehicleControls = true;
	
	@Name("Fuels")
	@RequiresWorldRestart
	public static String[] fuels = {"modid:item_name"};
	
	@Mod.EventBusSubscriber(modid = VehicleMod.Constants.ID)
	public static class Event {
		
		@SubscribeEvent
		public static void configChanged(ConfigChangedEvent e) {
			if(e.getModID().equals(VehicleMod.Constants.ID)) {
				ConfigManager.sync(VehicleMod.Constants.ID, Type.INSTANCE);
			}
		}
	}
}
