package dev.toma.vehiclemod.common.tileentity;

import dev.toma.vehiclemod.common.blocks.BlockFuelTank;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityFuelTank extends TileEntity {
	
	public static final float MAX_FUEL_LEVEL = 700.0F;
	public float fuelLevel;
	
	public void onFuelUpdate(World world, IBlockState state, float fuelValue) {
		fuelLevel += fuelValue;
		if(fuelLevel > MAX_FUEL_LEVEL) 
			fuelLevel = MAX_FUEL_LEVEL;
		
		this.updateState(world, state, (int)(fuelLevel)/100);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setFloat("fuel", fuelLevel);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		fuelLevel = compound.getFloat("fuel");
	}
	
	public boolean canTakeFuel(float fuelToTake) {
		return fuelLevel >= fuelToTake;
	}
	
	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
		return false;
	}
	
	private void updateState(World world, IBlockState state, int newMeta) {
		world.setBlockState(pos, state.withProperty(BlockFuelTank.STATE, newMeta), 3);
	}
}
