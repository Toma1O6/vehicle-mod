package dev.toma.vehiclemod;

import java.util.Random;

import org.apache.logging.log4j.Logger;

import dev.toma.vehiclemod.common.FuelHandler;
import dev.toma.vehiclemod.common.VMTab;
import dev.toma.vehiclemod.common.tileentity.TileEntityFuelTank;
import dev.toma.vehiclemod.common.tileentity.TileEntitySecret;
import dev.toma.vehiclemod.common.tileentity.TileEntityStateCell;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.proxy.IProxy;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = VehicleMod.Constants.ID, name = VehicleMod.Constants.NAME, version = VehicleMod.Constants.VERSION)
public class VehicleMod {
	
	@Instance
	public static VehicleMod instance;
	
	@SidedProxy(clientSide = "dev.toma.vehiclemod.proxy.ClientProxy", serverSide = "dev.toma.vehiclemod.proxy.ServerProxy")
	public static IProxy proxy;
	
	public static Logger logger;
	
	public static final VMTab TAB = new VMTab();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		VMNetworkManager.init();
		proxy.preInit(e);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e) {
		GameRegistry.registerTileEntity(TileEntitySecret.class, new ResourceLocation(Constants.ID, "secret"));
		GameRegistry.registerTileEntity(TileEntityFuelTank.class, new ResourceLocation(Constants.ID, "fuel_tank"));
		GameRegistry.registerTileEntity(TileEntityStateCell.class, new ResourceLocation(Constants.ID, "state_cell"));
		proxy.init(e);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		ModelCreator.createModels();
	}
	
	@EventHandler
	public static void serverStart(FMLServerStartingEvent e) {
		FuelHandler.instance().readAndInitFuels(VMConfig.fuels);
	}
	
	public static void registerItemBlock(Block block) {
		ItemBlock ib = new ItemBlock(block);
		ib.setRegistryName(block.getRegistryName());
		Registries.Registry.ITEM_BLOCKS.add(ib);
	}
	
	public static Random getRNG() {
		return Constants.RNG;
	}
	
	public static boolean isDevEnvironment() {
		return (Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment");
	}
	
	public static final class Constants {
		
		public static final String ID = "vehiclemod";
		public static final String NAME = "Toma's Vehicle Mod";
		public static final String VERSION = "1.1.1";
		
		public static final Random RNG = new Random();
	}
}
