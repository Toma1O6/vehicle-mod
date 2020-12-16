package dev.toma.vehiclemod.common;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.Registries.VMBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class VMTab extends CreativeTabs {
	
	public VMTab() {
		super("vehicle_mod");
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Registries.VMItems.FUEL_CAN);
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
