package dev.toma.vehiclemod;

import dev.toma.vehiclemod.common.FuelEntry;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketSyncConfig;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Ignore;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RequiresWorldRestart;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Config(modid = VehicleMod.Constants.ID, name = VehicleMod.Constants.NAME + " Config")
public class VMConfig {
	
	@Ignore
	public static FuelEntry[] entries;
	
	@Name("Simple Vehicle Control")
	public static boolean simpleVehicleControls = true;
	
	@Name("Fuels")
	@RequiresWorldRestart
	public static String[] fuels = {"modid:item_name"};
	
	public static DefaultFuelValues values = new DefaultFuelValues(15, 35, 20);
	
	public static VehicleStats beamer_s120 = new VehicleStats(150F, 1.5F, 0.05F, 0.08F, 0.3F, 3.0F, 0.005f, 0.5);
	
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
	
	public static class DefaultFuelValues {
		
		@Name("Bottle")
		@Comment("Amount of fuel to fuel tank which is going to add bottle of fuel")
		public float bottle;
		
		@Name("Bucket")
		@Comment("Amount of fuel to fuel tank which is going to add bucket of fuel")
		public float bucket;
		
		@Name("Other")
		@Comment("Amount of fuel which will be added to fuel tank from regular items")
		public float other;
		
		public DefaultFuelValues(float f0, float f1, float f2) {
			this.bottle = f0;
			this.bucket = f1;
			this.other = f2;
		}
	}
}
