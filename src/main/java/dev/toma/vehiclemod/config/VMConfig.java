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

	@Name("Speed display unit")
	public static SpeedDisplayUnit speedUnit = SpeedDisplayUnit.KILOMETRES_PER_HOUR;
	
	@Name("Beamer S120")
	public static VehicleStats beamer_s120 = new VehicleStats(250F, 1.23F, 0.005F, 0.017F, 0.15F, 2.2F, 0.0033f, 50, new VehicleStats.Vector3i(0, 0, -1)).track();

	@Name("Fedoratti Vulcan")
	public static VehicleStats fedoratti_vulcan = new VehicleStats(220F, 1.72F, 0.007F, 0.023F, 0.25F, 2.5F, 0.0062F, 70, new VehicleStats.Vector3i(0, 0, -1)).track();

	@Name("Tracer T1")
	public static VehicleStats tracer_t1 = new VehicleStats(250F, 1.29F, 0.0065F, 0.015F, 0.16F, 2.2F, 0.004F, 50).track();

	@Name("Sputnik 2000L")
	public static VehicleStats sputnik2000L = new VehicleStats(200F, 1.12F, 0.0039F, 0.015F, 0.13F, 2.2F, 0.004F, 30).track();

	@Name("Beamer S320 RS")
	public static VehicleStats beamers320rs = new VehicleStats(250F, 1.39F, 0.0062F, 0.022F, 0.3F, 2.7F, 0.0044f, 50, new VehicleStats.Vector3i(0, 0, -1)).track();

	@Name("MCG MultiVan")
	public static VehicleStats mcgMultiVan = new VehicleStats(400F, 1.07F, 0.0036F, 0.014F, 0.12F, 1.9F, 0.0069f, 120, new VehicleStats.Vector3i(0, 0, -3)).track();

	@Name("Beamer Pickup")
	public static VehicleStats beamerPickup = new VehicleStats(280F, 0.8F, 0.0032F, 0.012F, 0.1F, 1.8F, 0.0058F, 60, new VehicleStats.Vector3i(0, 0, -2)).track();

	@Name("Sputnik 3000L")
	public static VehicleStats sputnik3000L = new VehicleStats(250F, 1.3F, 0.0048F, 0.019F, 0.2F, 2.4F, 0.0031F, 50, new VehicleStats.Vector3i(0, 0, -1)).track();

	@Name("Sputnik 3000L Enforcer")
	public static VehicleStats sputnik3000LEnf = new VehicleStats(300F, 1.33F, 0.0051F, 0.020F, 0.21F, 2.4F, 0.0034F, 50, new VehicleStats.Vector3i(0, 0, -1)).track();

	@Name("Sputnik Duster")
	public static VehicleStats sputnikDuster = new VehicleStats(300F, 1.26F, 0.0044F, 0.0165F, 0.18F, 2.2F, 0.0053f, 70, new VehicleStats.Vector3i(0, 0, -1)).track();

	@Name("Fedoratti NightStalker")
	public static VehicleStats fedorattiNightStalker = new VehicleStats(200F, 1.58F, 0.0074F, 0.026F, 0.28F, 2.7F, 0.0065F, 60, new VehicleStats.Vector3i(0, 0, -1)).track();

	@Name("Proton P1")
	public static VehicleStats protonP1 = new VehicleStats(250F, 1.37F, 0.0054F, 0.019F, 0.22F, 2.4F, 0.0036F, 50).track();

	@Name("Proton P3")
	public static VehicleStats protonP3 = new VehicleStats(220F, 1.4F, 0.0059F, 0.022F, 0.23F, 2.5F, 0.0041F, 50).track();

	@Name("MCG Ambulance")
	public static VehicleStats mcgAmbulance = new VehicleStats(300F, 1.14F, 0.004F, 0.016F, 0.14F, 1.9F, 0.0064F, 70, new VehicleStats.Vector3i(0, 0, -3)).track();

	@Name("MCG Firetruck")
	public static VehicleStats mcgFiretruck = new VehicleStats(500F, 1.0F, 0.0037F, 0.011F, 0.09F, 1.4F, 0.0082F, 100, new VehicleStats.Vector3i(0, 0, -5)).track();

	@Name("Tracer Jester")
	public static VehicleStats tracerJester = new VehicleStats(300F, 1.2F, 0.0045F, 0.018F, 0.22F, 2.2F, 0.004F, 65).track();

	@Name("Tracer Outlander")
	public static VehicleStats tracerOutlander = new VehicleStats(300F, 1.2F, 0.0045F, 0.018F, 0.22F, 2.2F, 0.004F, 65).track();

	@Name("Proton P9X")
	public static VehicleStats protonP9X = new VehicleStats(250F, 1.5F, 0.006F, 0.025F, 0.23F, 2.5F, 0.004F, 60).track();

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
