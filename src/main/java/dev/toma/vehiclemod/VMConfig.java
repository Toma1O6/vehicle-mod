package dev.toma.vehiclemod;

import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketSyncConfig;
import dev.toma.vehiclemod.vehicle.VehicleStats;
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

@Config(modid = VehicleMod.Constants.ID, name = "Toma's Vehicle Mod Config")
public class VMConfig {

	@Name("State cell modifier")
	@Comment("Amount of ticks added or substracted/click")
	@Config.RangeInt(min = 0, max = 100)
	public static int cellTimerModifier = 20;
	
	@Name("Beamer S120")
	public static VehicleStats beamer_s120 = new VehicleStats(150F, 1.3F, 0.005400000104308128F, 0.019999999552965164F, 0.3F, 3.0F, 0.005f, 100);

	@Name("Federati Vulcan")
	public static VehicleStats fedoratti_vulcan = new VehicleStats(150F, 2.25F, 0.00900000000104308128F, 0.028999999552965164F, 0.3F, 3.0F, 0.005F, 100);

	@Name("Tracer T1")
	public static VehicleStats tracer_t1 = new VehicleStats(150F, 1.62F, 0.007000000104308128F, 0.023999999552965164F, 0.3F, 3.0F, 0.005F, 100);

	@Name("Sputnik 2000L")
	public static VehicleStats sputnik2000L = new VehicleStats(150F, 1.12F, 0.004600000104308128F, 0.019999999552965164F, 0.3F, 3.0F, 0.005F, 100);

	@Name("Beamer S320 RS")
	public static VehicleStats beamers320rs = new VehicleStats(150F, 1.3F, 0.005F, 0.02F, 0.3F, 3.0F, 0.005f, 100);

	@Name("MCG MultiVan")
	public static VehicleStats mcgMultiVan = new VehicleStats(300F, 0.8F, 0.0015F, 0.005F, 0.25F, 2.5F, 0.02f, 150, new VehicleStats.Vector3i(0, 0, -3));

	@Mod.EventBusSubscriber(modid = VehicleMod.Constants.ID)
	public static class Event {
		
		@SubscribeEvent
		public static void configChanged(ConfigChangedEvent e) {
			if(e.getModID().equals(VehicleMod.Constants.ID)) {
				ConfigManager.sync(VehicleMod.Constants.ID, Type.INSTANCE);
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
