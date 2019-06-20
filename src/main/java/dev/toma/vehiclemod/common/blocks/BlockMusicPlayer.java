package dev.toma.vehiclemod.common.blocks;

import java.util.ArrayList;
import java.util.List;

import dev.toma.vehiclemod.util.MusicEntry;
import net.minecraft.block.material.Material;

public class BlockMusicPlayer extends BlockBasic {
	
	public static final List<MusicEntry> SONGS = new ArrayList<>();
	
	public BlockMusicPlayer(String name) {
		super(name, Material.IRON);
		setHardness(1.5f);
		setHarvestLevel("pickaxe", 1);
	}
}
