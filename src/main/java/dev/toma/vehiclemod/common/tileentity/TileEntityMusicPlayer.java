package dev.toma.vehiclemod.common.tileentity;

import javax.annotation.Nullable;

import dev.toma.vehiclemod.Registries.VMBlocks;
import dev.toma.vehiclemod.common.blocks.BlockMusicPlayer;
import dev.toma.vehiclemod.util.MusicEntry;
import dev.toma.vehiclemod.util.VMHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityMusicPlayer extends TileEntity {

	public MusicEntry currentEntry;
	public long expectedSongEnd;
	private boolean playing = false;
	private int selectedIndex;
	
	public void play() {
		if(currentEntry == null) {
			playing = false;
			return;
		}

		if(!playing) {
			this.update(currentEntry);
			this.world.playSound(null, this.getPos().getX() + 0.5, this.getPos().getY() + 0.5, this.getPos().getZ()+0.5, currentEntry.music, SoundCategory.MASTER, 10f, 1f);
		}
	}
	
	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
		return false;
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setInteger("index", currentEntry == null ? -1 : BlockMusicPlayer.SONGS.indexOf(currentEntry));
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		selectedIndex = compound.getInteger("index");
		currentEntry = selectedIndex > -1 ? BlockMusicPlayer.SONGS.get(selectedIndex) : null;
	}
	
	public boolean isPlaying() {
		return playing;
	}

	public void stopPlaying() {
		playing = false;
	}
	
	private void update(MusicEntry entry) {
		if(entry.music == null) {
			return;
		}
		currentEntry = entry;
		playing = true;
		world.setBlockState(pos, VMBlocks.MUSIC_PLAYER.getDefaultState().withProperty(BlockMusicPlayer.ON, true), 3);
	}
}
