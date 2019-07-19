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
	
	@Nullable
	public MusicEntry currentEntry;
	public long expectedSongEnd;
	private boolean playing = false;
	private int selectedIndex;
	
	public void play() {
		if(BlockMusicPlayer.SONGS.isEmpty() || selectedIndex >= BlockMusicPlayer.SONGS.size()) {
			return;
		}
		
		MusicEntry entry = BlockMusicPlayer.SONGS.get(selectedIndex);
		if(!playing) {
			update(entry);
			this.world.playSound(this.getPos().getX() + 0.5, this.getPos().getY() + 0.5, this.getPos().getZ()+0.5, entry.music, SoundCategory.MASTER, 8f, 1f, false);
		}
	}
	
	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
		return false;
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setInteger("index", selectedIndex);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		selectedIndex = compound.getInteger("index");
	}
	
	public boolean isPlaying() {
		return playing;
	}
	
	private void update(MusicEntry entry) {
		if(entry.music == null) {
			return;
		}
		currentEntry = entry;
		world.setBlockState(pos, VMBlocks.MUSIC_PLAYER.getDefaultState().withProperty(BlockMusicPlayer.ON, true), 3);
		world.scheduleBlockUpdate(pos, blockType, entry.recordTime, 0);
	}
}
