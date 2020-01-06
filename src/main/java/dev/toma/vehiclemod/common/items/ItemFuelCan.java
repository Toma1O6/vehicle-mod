package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemFuelCan extends ItemVehicleAccessory {
	
	public ItemFuelCan(String name) {
		super(name, 15);
		setMaxDamage(4);
		setMaxStackSize(1);
	}

	@Override
	public String getActionMessage() {
		return "Refueling";
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		if(entityLiving instanceof EntityPlayer && entityLiving.isRiding() && entityLiving.getRidingEntity() instanceof EntityVehicle) {
			EntityVehicle vehicle = (EntityVehicle) entityLiving.getRidingEntity();
			if(stack.getItemDamage() < stack.getMaxDamage()) {
				vehicle.refillFuel();
				if(!((EntityPlayer)entityLiving).isCreative()) {
					stack.damageItem(1, entityLiving);
				}
			}
		}
		return stack;
	}
}
