package dev.toma.vehiclemod;

import dev.toma.vehiclemod.common.VMTab;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import dev.toma.vehiclemod.network.VMNetworkManager;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VehicleMod.MODID)
public class VehicleMod {

	public static final String MODID = "vehiclemod";
	public static Logger logger = LogManager.getLogger(MODID);
	public static final VMTab TAB = new VMTab();

	public VehicleMod() {

	}

	void setupClient() {
		//NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}

	void setupCommon() {
		VMNetworkManager.init();
		GameRegistry.registerTileEntity(TileEntityPetrolPump.class, getResource("petrol_pump"));
		GameRegistry.registerTileEntity(TileEntityFuelMaker.class, getResource("fuel_maker"));
	}
	
	public static void registerBlockItem(Block block) {
		BlockItem ib = new BlockItem(block, new Item.Properties().group(TAB));
		ib.setRegistryName(block.getRegistryName());
		Registries.Registry.ITEM_BLOCKS.add(ib);
	}

	public static ResourceLocation getResource(String path) {
		return new ResourceLocation(MODID, path);
	}
}
