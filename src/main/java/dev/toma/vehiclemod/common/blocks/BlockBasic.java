package dev.toma.vehiclemod.common.blocks;

import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBasic extends Block {
	
	public BlockBasic(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(VehicleMod.TAB);
		VehicleMod.registerItemBlock(this);
	}
}
