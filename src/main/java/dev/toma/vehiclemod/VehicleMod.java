package dev.toma.vehiclemod;

import dev.toma.vehiclemod.Registries.Registry;
import dev.toma.vehiclemod.common.VMTab;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.tileentity.TileEntityMusicPlayer;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import dev.toma.vehiclemod.common.tileentity.TileEntitySecret;
import dev.toma.vehiclemod.common.tileentity.TileEntityStateCell;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.proxy.IProxy;
import dev.toma.vehiclemod.util.GuiHandler;
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
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

import java.util.Random;

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
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e) {
		GameRegistry.registerTileEntity(TileEntitySecret.class, new ResourceLocation(Constants.ID, "secret"));
		GameRegistry.registerTileEntity(TileEntityStateCell.class, new ResourceLocation(Constants.ID, "state_cell"));
		GameRegistry.registerTileEntity(TileEntityMusicPlayer.class, new ResourceLocation(Constants.ID, "music_player"));
		GameRegistry.registerTileEntity(TileEntityPetrolPump.class, new ResourceLocation(Constants.ID, "petrol_pump"));
		GameRegistry.registerTileEntity(TileEntityFuelMaker.class, getResource("fuel_maker"));
		proxy.init(e);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		Registry.registerMusicEntries();
	}
	
	public static void registerItemBlock(Block block) {
		ItemBlock ib = new ItemBlock(block);
		ib.setRegistryName(block.getRegistryName());
		Registries.Registry.ITEM_BLOCKS.add(ib);
	}

	public static ResourceLocation getResource(String path) {
		return new ResourceLocation(Constants.ID, path);
	}
	
	public static Random getRNG() {
		return Constants.RNG;
	}
	
	public static boolean isDevEnvironment() {
		return (Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment");
	}
	
	public static final class Constants {
		
		public static final String ID = "vehiclemod";
		public static final String NAME = "Vehicle Mod";
		public static final String VERSION = "1.6.0";
		
		public static final Random RNG = new Random();
	}
}
