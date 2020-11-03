package dev.toma.vehiclemod.config;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.SpeedDisplayUnit;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketSyncConfig;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Config(modid = VehicleMod.MODID, name = "Vehicle Mod Config")
public class VMConfig {

	@Name("Client config")
	public static ClientConfig clientConfig = new ClientConfig();

	@Name("Speed display unit")
	public static SpeedDisplayUnit speedUnit = SpeedDisplayUnit.KILOMETRES_PER_HOUR;
	
	@Name("Beamer S120")
	public static VehicleStats beamer_s120 = new VehicleStats(250F, 1.23F, 0.0049F, 0.017F, 0.15F, 3.0F, 0.004f, 50).track();

	@Name("Fedoratti Vulcan")
	public static VehicleStats fedoratti_vulcan = new VehicleStats(220F, 1.72F, 0.007F, 0.023F, 0.25F, 3.5F, 0.0076F, 70).track();

	@Name("Tracer T1")
	public static VehicleStats tracer_t1 = new VehicleStats(250F, 1.41F, 0.0067F, 0.016F, 0.17F, 3.3F, 0.006F, 50).track();

	@Name("Sputnik 2000L")
	public static VehicleStats sputnik2000L = new VehicleStats(200F, 1.12F, 0.0035F, 0.019F, 0.13F, 3.0F, 0.0062F, 30).track();

	@Name("Beamer S320 RS")
	public static VehicleStats beamers320rs = new VehicleStats(250F, 1.46F, 0.0062F, 0.022F, 0.3F, 3.5F, 0.006f, 50).track();

	@Name("MCG MultiVan")
	public static VehicleStats mcgMultiVan = new VehicleStats(400F, 1.07F, 0.0028F, 0.014F, 0.12F, 2.5F, 0.01f, 120, new VehicleStats.Vector3i(0, 0, -3)).track();

	@Name("Beamer Pickup")
	public static VehicleStats beamerPickup = new VehicleStats(280F, 0.8F, 0.0025F, 0.012F, 0.1F, 2.5F, 0.0075F, 60, new VehicleStats.Vector3i(0, 0, -2)).track();

	@Name("Sputnik 3000L")
	public static VehicleStats sputnik3000L = new VehicleStats(250F, 1.26F, 0.0042F, 0.019F, 0.2F, 3.3F, 0.0041F, 50).track();

	@Name("Sputnik 3000L Enforcer")
	public static VehicleStats sputnik3000LEnf = new VehicleStats(300F, 1.28F, 0.0046F, 0.020F, 0.21F, 3.3F, 0.0046F, 50).track();

	@Name("Sputnik Duster")
	public static VehicleStats sputnikDuster = new VehicleStats(300F, 1.28F, 0.0041F, 0.0165F, 0.18F, 3.0F, 0.008f, 70).track();

	@Name("Fedoratti NightStalker")
	public static VehicleStats fedorattiNightStalker = new VehicleStats(200F, 1.58F, 0.0074F, 0.026F, 0.28F, 3.5F, 0.0076F, 60).track();

	@Name("Proton P1")
	public static VehicleStats protonP1 = new VehicleStats(250F, 1.37F, 0.0051F, 0.019F, 0.22F, 3.3F, 0.0076F, 50).track();

	@Name("Proton P1 Tunned")
	public static VehicleStats protonP1_tunned = new VehicleStats(220F, 1.4F, 0.0057F, 0.022F, 0.23F, 3.3F, 0.0076F, 50).track();

	@Mod.EventBusSubscriber(modid = VehicleMod.MODID)
	public static class Event {
		
		@SubscribeEvent
		public static void configChanged(ConfigChangedEvent e) {
			if(e.getModID().equals(VehicleMod.MODID)) {
				ConfigManager.sync(VehicleMod.MODID, Type.INSTANCE);
			}
		}
		
		@SubscribeEvent
		public static void logIn(PlayerEvent.PlayerLoggedInEvent e) {
			if(e.player instanceof EntityPlayerMP) {
				VMNetworkManager.instance().sendTo(new CPacketSyncConfig(), (EntityPlayerMP)e.player);
			}
		}
	}
}
