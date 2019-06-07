package dev.toma.vehiclemod.common.blocks;

import dev.toma.vehiclemod.Registries.VMItems;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.FuelHandler;
import dev.toma.vehiclemod.common.tileentity.TileEntityFuelTank;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
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
import net.minecraft.world.World;

public class BlockFuelTank extends Block {
	
	public static final PropertyInteger STATE = PropertyInteger.create("state", 0, 7);
	
	public BlockFuelTank(String name) {
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(VehicleMod.TAB);
		setDefaultState(blockState.getBaseState().withProperty(STATE, 0));
		VehicleMod.registerItemBlock(this);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack stack = player.getHeldItem(hand);
		TileEntityFuelTank te = (TileEntityFuelTank)world.getTileEntity(pos);
		if(stack.isEmpty()) {
			if(!player.isSneaking() && !world.isRemote) {
				player.sendStatusMessage(new TextComponentString("Fuel: " + te.fuelLevel + "l"), true);
			}
		}
		if(stack.getItem() == VMItems.FUEL_CAN) {
			if(stack.getItemDamage() > 0 && te.fuelLevel > 25) {
				stack.setItemDamage(stack.getItemDamage() - 1);
				te.onFuelUpdate(world, state, -25);
			}
		}
		if(stack.getItem() != VMItems.FUEL_CAN) {
			if(FuelHandler.instance().isFuel(stack)) {
				String name = stack.getItem().getRegistryName().getResourcePath();
				float fuelValue = name.contains("bottle") ? VMConfig.values.bottle : name.contains("bucket") ? VMConfig.values.bucket : VMConfig.values.other;
				if(!player.isSneaking() && te.fuelLevel < te.MAX_FUEL_LEVEL) {
					te.onFuelUpdate(world, state, fuelValue);
					if(!player.capabilities.isCreativeMode) {
						stack.shrink(1);
						if(name.contains("bottle")) {
							player.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
						} else if(name.contains("bucket")) {
							player.addItemStackToInventory(new ItemStack(Items.BUCKET));
						}
					}
				}
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
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityFuelTank();
	}
}
