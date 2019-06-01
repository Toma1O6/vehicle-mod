package dev.toma.vehiclemod;

import java.util.Random;

import org.apache.logging.log4j.Logger;

import dev.toma.vehiclemod.common.FuelHandler;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.proxy.IProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = VehicleMod.Constants.ID, name = VehicleMod.Constants.NAME, version = VehicleMod.Constants.VERSION)
public class VehicleMod {
	
	@Instance
	public static VehicleMod instance;
	
	@SidedProxy(clientSide = "dev.toma.vehiclemod.proxy.ClientProxy")
	public static IProxy proxy;
	
	public static Logger logger;
	
	public static final CreativeTabs TAB = new CreativeTabs("vehicle_mod") {
		final ItemStack ICON = new ItemStack(Items.DIAMOND);
		@Override
		public ItemStack getTabIconItem() {
			return ICON;
		}
	};
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		VMNetworkManager.init();
		proxy.preInit(e);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
	@EventHandler
	public static void serverStart(FMLServerStartingEvent e) {
		FuelHandler.instance().readAndInitFuels(VMConfig.fuels);
	}
	
	public static Random getRNG() {
		return Constants.RNG;
	}
	
	public static final class Constants {
		
		public static final String ID = "vehiclemod";
		public static final String NAME = "Toma's Vehicle Mod";
		public static final String VERSION = "1.0";
		
		public static final Random RNG = new Random();
	}
}
