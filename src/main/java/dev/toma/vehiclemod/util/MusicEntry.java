package dev.toma.vehiclemod.util;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.blocks.BlockMusicPlayer;
import net.minecraft.util.SoundEvent;

public class MusicEntry {
	
	public final SoundEvent music;
	public final int recordTime;
	
	public MusicEntry(final SoundEvent music, final int recordTime) {
		this.music = music;
		this.recordTime = recordTime;
	}
	
	public static void registerMusicEntry(SoundEvent e, int time) {
		BlockMusicPlayer.SONGS.add(new MusicEntry(e, time));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MusicEntry) {
			MusicEntry e = (MusicEntry)obj;
			if(e.music.getRegistryName().equals(this.music.getRegistryName())) {
				return true;
			}
		}
		return false;
	}
}
