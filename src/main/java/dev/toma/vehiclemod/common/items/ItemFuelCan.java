package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemFuelCan extends Item {
	
	public ItemFuelCan(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(VehicleMod.TAB);
		setMaxDamage(4);
		setMaxStackSize(1);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack stack = playerIn.getHeldItem(handIn);
		if(playerIn.isRiding() && playerIn.getRidingEntity() instanceof EntityVehicle) {
			EntityVehicle car = (EntityVehicle)playerIn.getRidingEntity();
			if(car.fuel < 100f && stack.getItemDamage() < stack.getMaxDamage()) {
				if(!playerIn.capabilities.isCreativeMode) {
					stack.damageItem(1, playerIn);
				}
				car.refillFuel();
			}
		}
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);
	}
}
