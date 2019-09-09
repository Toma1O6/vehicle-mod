package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.util.IVehicleAccessory;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemFuelCan extends VMItem implements IVehicleAccessory {
	
	public ItemFuelCan(String name) {
		super(name);
		setMaxDamage(4);
		setMaxStackSize(1);
	}


	@Override
	public void applyOnVehicle(EntityVehicle vehicle, World world, EntityPlayer player) {
		ItemStack stack = player.getHeldItemMainhand();
		if(stack.getItemDamage() < stack.getMaxDamage()) {
			vehicle.refillFuel();
			if(!player.isCreative()) {
				stack.damageItem(1, player);
			}
		}
	}
}
