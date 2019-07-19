package dev.toma.vehiclemod.common.blocks;

import java.util.ArrayList;
import java.util.List;

import dev.toma.vehiclemod.common.tileentity.TileEntityMusicPlayer;
import dev.toma.vehiclemod.util.MusicEntry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMusicPlayer extends BlockBasic {
	
	public static final List<MusicEntry> SONGS = new ArrayList<>();
	public static final PropertyBool ON = PropertyBool.create("on");
	
	public BlockMusicPlayer(String name) {
		super(name, Material.IRON);
		setHardness(1.5f);
		setHarvestLevel("pickaxe", 1);
		setDefaultState(blockState.getBaseState().withProperty(ON, false));
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityMusicPlayer();
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}
	
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
		TileEntityMusicPlayer te = (TileEntityMusicPlayer)worldIn.getTileEntity(pos);
		if(!te.isPlaying()) {
			if(isPowered(worldIn, pos)) {
				te.play();
				worldIn.setBlockState(pos, state.withProperty(ON, true));
			}
		}
	}
	
	@Override
	public int getStrongPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		return blockState.getValue(ON) && side == EnumFacing.SOUTH ? 15 : 0;
	}
	
	@Override
	public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		return blockState.getValue(ON) && side == EnumFacing.SOUTH ? 15 : 0;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, ON);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return 0;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(ON, false);
	}
	
	public List<MusicEntry> getMusicList() {
		return SONGS;
	}
	
	private static boolean isPowered(World world, BlockPos pos) {
		int i = world.getRedstonePower(pos.offset(EnumFacing.NORTH), EnumFacing.NORTH);
		IBlockState st = world.getBlockState(pos.offset(EnumFacing.NORTH));
		if(i == 0 && st.getBlock() == Blocks.REDSTONE_WIRE) {
			i = st.getValue(BlockRedstoneWire.POWER).intValue();
		}
		return i > 0;
	}
}
