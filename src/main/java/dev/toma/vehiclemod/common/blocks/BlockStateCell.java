package dev.toma.vehiclemod.common.blocks;

import java.util.Random;

import dev.toma.vehiclemod.Registries.VMBlocks;
import dev.toma.vehiclemod.common.tileentity.TileEntityStateCell;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStateCell extends BlockBasic {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	public static final PropertyBool ON = PropertyBool.create("on");
	
	public BlockStateCell(String name) {
		super(name, Material.ROCK);
		setHarvestLevel("pickaxe", 0);
		setHardness(0.4f);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(ON, false));
	}
	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}
	
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
		if(isPowered(worldIn, pos, state)) {
			if(!state.getValue(ON)) {
				TileEntityStateCell cell = (TileEntityStateCell)worldIn.getTileEntity(pos);
				cell.setDelay();
				worldIn.setBlockState(pos, state.withProperty(ON, true), 3);
			}
		}
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		TileEntity te = worldIn.getTileEntity(pos);
		if(te != null && te instanceof TileEntityStateCell && !worldIn.isRemote) {
			TileEntityStateCell cell = (TileEntityStateCell)te;
			if(playerIn.isSneaking()) {
				cell.cycleBackward();
				playerIn.sendMessage(new TextComponentString("Delay: " + cell.getDelay()/20D + "s"));
			} else {
				cell.cycleForward();
				playerIn.sendMessage(new TextComponentString("Delay: " + cell.getDelay()/20D + "s"));
			}
		}
		return true;
	}
	
	@Override
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return true;
	}
	
	@Override
	public boolean canProvidePower(IBlockState state) {
		return true;
	}
	
	@Override
	public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		boolean flag = side == this.getInputSide(blockState).getOpposite();
		return blockState.getValue(ON) && !flag ? 15 : 0;
	}
	
	@Override
	public int getStrongPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		return blockState.getValue(ON) ? 15 : 0;
	}
	
	public EnumFacing getInputSide(IBlockState state) {
		return state.getValue(FACING);
	}
	
	public EnumFacing[] getOutputs(IBlockState state) {
		EnumFacing[] arr = new EnumFacing[3];
		int id = 0;
		for(EnumFacing facing : EnumFacing.Plane.HORIZONTAL) {
			if(facing != getInputSide(state)) {
				arr[id] = facing;
				++id;
			}
		}
		return arr;
	}
	
	public boolean isPowered(World world, BlockPos pos, IBlockState state) {
		EnumFacing facing = this.getInputSide(state);
		int i = world.getRedstonePower(pos.offset(facing), facing);
		return i > 0;
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		int i = 0;
		i = i|state.getValue(FACING).getHorizontalIndex();
		if(state.getValue(ON).booleanValue()) {
			i |= 4;
		}
		return i;
	}
	
	@Override
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if(stateIn.getValue(ON)) {
			if(worldIn.isRemote) {
				worldIn.spawnParticle(EnumParticleTypes.REDSTONE, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1.0, 0, 0);
			}
		}
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta)).withProperty(ON, Boolean.valueOf((meta & 4) == 0));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, FACING, ON);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityStateCell();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(VMBlocks.STATE_CELL);
	}
	
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(VMBlocks.STATE_CELL);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}
