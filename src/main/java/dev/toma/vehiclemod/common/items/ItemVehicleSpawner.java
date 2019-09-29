package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemVehicleSpawner extends Item {

	private final IClickAction action;

	public ItemVehicleSpawner(String name, IClickAction action) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(VehicleMod.TAB);
		this.action = action;
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
			if(!player.capabilities.isCreativeMode) {
				player.getHeldItem(hand).shrink(1);
			}
			action.click(worldIn, pos);
		}
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}

	@FunctionalInterface
	public interface IClickAction {
		void click(World world, BlockPos pos);
	}
}
