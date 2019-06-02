package dev.toma.vehiclemod;

import java.util.ArrayList;

import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketSyncConfig;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RequiresWorldRestart;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@Config(modid = VehicleMod.Constants.ID, name = VehicleMod.Constants.NAME + " Config")
public class VMConfig {
	
	@Name("Simple Vehicle Control")
	public static boolean simpleVehicleControls = true;
	
	@Name("Fuels")
	@RequiresWorldRestart
	public static String[] fuels = {"modid:item_name"};
	
	public static VehicleStats beamer_s120 = new VehicleStats(150F, 1.5F, 0.05F, 0.08F, 0.3F, 3.0F, 0.005f);
	
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
