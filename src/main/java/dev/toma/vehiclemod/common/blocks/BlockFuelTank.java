package dev.toma.vehiclemod.common.blocks;

import dev.toma.vehiclemod.Registries.VMItems;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.FuelHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockFuelTank extends Block {
	
	public static final PropertyInteger STATE = PropertyInteger.create("state", 0, 7);
	
	public BlockFuelTank(String name) {
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(VehicleMod.TAB);
		setDefaultState(blockState.getBaseState().withProperty(STATE, 0));
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack stack = playerIn.getHeldItem(hand);
		
		if(stack.getItem() == VMItems.FUEL_CAN) {
			if(playerIn.isSneaking()) {
				if(stack.getItemDamage() < stack.getMaxDamage()) {
					stack.damageItem(1, playerIn);
					playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1f, 1f);
				}
			} else {
				if(stack.getItemDamage() > 0) {
					stack.setItemDamage(stack.getItemDamage()-1);
					playerIn.playSound(SoundEvents.ITEM_BUCKET_EMPTY, 1f, 1f);
				}
			}
		}
		
		else if(state.getValue(STATE).intValue() < 7 && FuelHandler.instance().isFuel(stack)) {
			worldIn.setBlockState(pos, state.withProperty(STATE, state.getValue(STATE).intValue() + 1), 3);
			if(!playerIn.capabilities.isCreativeMode) {
				if(stack.getItem().getRegistryName().getResourcePath().contains("bucket")) {
					playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
				}
				stack.shrink(1);	
			}
		}
		return false;
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(STATE).intValue();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(STATE, meta);
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, STATE);
	}
}
