package dev.toma.vehiclemod.common.blocks;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.tileentity.TileEntitySecret;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class BlockSecret extends Block {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public BlockSecret(String name) {
		super(Material.ROCK, MapColor.AIR);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(VehicleMod.TAB);
		setBlockUnbreakable();
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		VehicleMod.registerItemBlock(this);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack stack = playerIn.getHeldItem(hand);
		if(stack.getItem() == Items.NAME_TAG) {
			TileEntitySecret te = (TileEntitySecret)worldIn.getTileEntity(pos);
			te.setName(stack.getDisplayName());
			if(!worldIn.isRemote) {
				playerIn.sendMessage(new TextComponentString("You have successfully changed this object's name to " + te.getObjectName()));
			}
			if(!playerIn.capabilities.isCreativeMode) {
				stack.shrink(1);
			}
		} else if(!playerIn.isSneaking()) {
			if(!worldIn.isRemote) {
				TileEntitySecret te = (TileEntitySecret)worldIn.getTileEntity(pos);
				for(EntityPlayer player : worldIn.playerEntities) {
					if(!player.getName().equals(playerIn.getName())) {
						player.sendMessage(new TextComponentString(TextFormatting.GREEN + playerIn.getName() + " has found a secret: " + te.getObjectName() + "!"));
					} else {
						player.sendMessage(new TextComponentString(TextFormatting.GREEN + "You have just found a secret: " + te.getObjectName()));
					}
				}
			}
		}
		return true;
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntitySecret();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, FACING);
	}
}
