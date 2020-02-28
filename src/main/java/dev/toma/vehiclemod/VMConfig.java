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
	public static VehicleStats beamer_s120 = new VehicleStats(250F, 1.23F, 0.0045F, 0.024F, 0.3F, 3.0F, 0.004f, 50);

	@Name("Federati Vulcan")
	public static VehicleStats fedoratti_vulcan = new VehicleStats(220F, 2.26F, 0.0091F, 0.033F, 0.3F, 3.0F, 0.007F, 70);

	@Name("Tracer T1")
	public static VehicleStats tracer_t1 = new VehicleStats(250F, 1.62F, 0.0067F, 0.028F, 0.3F, 3.0F, 0.006F, 50);

	@Name("Sputnik 2000L")
	public static VehicleStats sputnik2000L = new VehicleStats(200F, 1.12F, 0.0035F, 0.019F, 0.3F, 3.0F, 0.0066F, 30);

	@Name("Beamer S320 RS")
	public static VehicleStats beamers320rs = new VehicleStats(250F, 1.73F, 0.0059F, 0.031F, 0.3F, 3.0F, 0.006f, 50);

	@Name("MCG MultiVan")
	public static VehicleStats mcgMultiVan = new VehicleStats(400F, 0.96F, 0.0028F, 0.014F, 0.25F, 2.5F, 0.01f, 120, new VehicleStats.Vector3i(0, 0, -3));

	@Name("Beamer Pickup")
	public static VehicleStats beamerPickup = new VehicleStats(280F, 1.12F, 0.0035F, 0.023F, 0.3F, 3.0F, 0.008F, 90, new VehicleStats.Vector3i(0, 0, -2));

	@Name("Sputnik 3000L")
	public static VehicleStats sputnik3000L = new VehicleStats(200F, 1.12F, 0.0035F, 0.019F, 0.3F, 3.0F, 0.0066F, 40);

	@Name("Sputnik 3000L Enforcer")
	public static VehicleStats sputnik3000LEnf = new VehicleStats(200F, 1.12F, 0.0035F, 0.019F, 0.3F, 3.0F, 0.0066F, 40);

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
