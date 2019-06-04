package dev.toma.vehiclemod.common;

import java.util.HashSet;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public final class FuelHandler {

	public static final HashSet<Item> FUELS = new HashSet<>();
	private static final FuelHandler INSTANCE = new FuelHandler();
	
	public static FuelHandler instance() {
		return INSTANCE;
	}
	
	public void readAndInitFuels(String[] array) {
		FUELS.clear();
		if(array != null && array.length > 0) {
			IForgeRegistry<Item> items = ForgeRegistries.ITEMS;
			
			for(String s : array) {
				ResourceLocation rl = new ResourceLocation(s);
				Item item = items.getValue(rl);
				if(item != Items.AIR && item != null) {
					FUELS.add(items.getValue(rl));
				} else {
					VehicleMod.logger.error("Couldn't get item from {}, skipping fuel..", rl.toString());
				}
			}

			VehicleMod.logger.info("Initialized fuels: {}", FUELS);
		}
	}
	
	public boolean isFuel(ItemStack stack) {
		Item item = stack.getItem();
		for(Item fuel : FUELS) {
			if(item == fuel) {
				return true;
			}
		}
		return false;
	}
}
