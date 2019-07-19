package dev.toma.vehiclemod.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSpikes extends BlockBasic {
	
	public static final AxisAlignedBB[] AABBs = {new AxisAlignedBB(0, 0.0D, 0, 1, 0.2D, 1), new AxisAlignedBB(0, 0, 0, 1, 0.195D, 1)};
	
	public BlockSpikes(String name) {
		super(name, Material.ROCK);
		setBlockUnbreakable();
	}
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if(!entityIn.isSneaking() && entityIn instanceof EntityPlayer) {
			entityIn.attackEntityFrom(DamageSource.CACTUS, 20);
		}
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World worldIn, BlockPos pos) {
		return AABBs[0].offset(pos);
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return AABBs[1];
	}
}
