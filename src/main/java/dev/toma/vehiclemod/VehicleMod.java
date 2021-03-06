package dev.toma.vehiclemod;

import dev.toma.vehiclemod.client.command.CommandRace;
import dev.toma.vehiclemod.common.VMTab;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.capability.StorageImpl;
import dev.toma.vehiclemod.common.capability.chunks.ChunkData;
import dev.toma.vehiclemod.common.capability.chunks.ChunkDataFactory;
import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import dev.toma.vehiclemod.common.command.CommandTrack;
import dev.toma.vehiclemod.common.tileentity.TileEntityMechanicPackage;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import dev.toma.vehiclemod.common.tileentity.TileEntitySecret;
import dev.toma.vehiclemod.common.tileentity.TileEntityTunerPackage;
import dev.toma.vehiclemod.common.world.PackageGenerator;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.proxy.CommonProxy;
import dev.toma.vehiclemod.util.GuiHandler;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

import java.util.Random;

@Mod(modid = VehicleMod.MODID, name = "Vehicle mod", version = "1.1.2", updateJSON = "https://raw.githubusercontent.com/Toma1O6/vehicle-mod/master/updatechecker.json")
public class VehicleMod {

	public static final String MODID = "vehiclemod";
	@Instance
	public static VehicleMod instance;
	@SidedProxy(clientSide = "dev.toma.vehiclemod.proxy.ClientProxy", serverSide = "dev.toma.vehiclemod.proxy.ServerProxy")
	public static CommonProxy proxy;
	public static Logger logger;
	public static final Random random = new Random();
	
	public static final VMTab TAB = new VMTab();
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		VMNetworkManager.init();
		proxy.preInit(e);
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		CapabilityManager.INSTANCE.register(ChunkData.class, new StorageImpl<>(), ChunkDataFactory::new);
		CapabilityManager.INSTANCE.register(RacingData.class, new StorageImpl<>(), RacingDataImpl::new);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e) {
		GameRegistry.registerTileEntity(TileEntityPetrolPump.class, getResource("petrol_pump"));
		GameRegistry.registerTileEntity(TileEntityFuelMaker.class, getResource("fuel_maker"));
		GameRegistry.registerTileEntity(TileEntityMechanicPackage.class, getResource("mechanic_package"));
		GameRegistry.registerTileEntity(TileEntityTunerPackage.class, getResource("tuner_package"));
		GameRegistry.registerTileEntity(TileEntitySecret.class, getResource("secret"));
		GameRegistry.registerWorldGenerator(new PackageGenerator(), 0);
		proxy.init(e);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		VehicleStats.initiateValueRefresh();
	}

	@EventHandler
	public static void serverStarting(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandTrack());
		event.registerServerCommand(new CommandRace());
	}
	
	public static void registerItemBlock(Block block) {
		ItemBlock ib = new ItemBlock(block);
		ib.setRegistryName(block.getRegistryName());
		Registries.Registry.ITEM_BLOCKS.add(ib);
	}

	public static ResourceLocation getResource(String path) {
		return new ResourceLocation(MODID, path);
	}
	
	public static boolean isDevEnvironment() {
		return (Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment");
	}
}
