package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.common.blocks.BlockStateCell;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityStateCell extends TileEntity implements ITickable {
	
	private int totalDelay = 20;
	private int delay;
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setInteger("delayTotal", totalDelay);
		compound.setInteger("delay", delay);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		totalDelay = compound.getInteger("delayTotal");
		delay = compound.getInteger("delay");
	}
	
	public void cycleForward() {
		totalDelay += VMConfig.cellTimerModifier;
	}
	
	public void cycleBackward() {
		totalDelay = totalDelay > VMConfig.cellTimerModifier ? totalDelay - VMConfig.cellTimerModifier : 0;
	}
	
	public int getDelay() {
		return totalDelay;
	}
	
	public void setDelay() {
		delay = totalDelay;
	}
	
	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
		return false;
	}
	
	@Override
	public void update() {
		if(delay > 0 && !world.isRemote) {
			--delay;
			if(delay == 0) {
				IBlockState state = world.getBlockState(pos);
				if(state.getValue(BlockStateCell.ON)) {
					world.setBlockState(pos, state.withProperty(BlockStateCell.ON, false), 3);
					world.notifyNeighborsOfStateChange(pos, blockType, false);
				}
			}
		}
	}
}
