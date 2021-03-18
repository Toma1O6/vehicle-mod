package dev.toma.vehiclemod.config;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.SpeedDisplayUnit;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = VehicleMod.MODID, name = "Vehicle Mod Config")
public class VMConfig {

	@Name("Client config")
	public static ClientConfig clientConfig = new ClientConfig();

	@Name("World config")
	public static WorldConfig worldConfig = new WorldConfig();

	@Name("Vehicle config")
	public static VehicleConfig vehicleConfig = new VehicleConfig();

	@Name("Speed display unit")
	public static SpeedDisplayUnit speedUnit = SpeedDisplayUnit.KILOMETRES_PER_HOUR;

	@Name("Vehicle parts damage")
	public static boolean damageVehicleParts = true;

	@Mod.EventBusSubscriber(modid = VehicleMod.MODID)
	public static class Event {
		
		@SubscribeEvent
		public static void configChanged(ConfigChangedEvent e) {
			if(e.getModID().equals(VehicleMod.MODID)) {
				ConfigManager.sync(VehicleMod.MODID, Type.INSTANCE);
			}
		}
	}
}
