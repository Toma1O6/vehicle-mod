package dev.toma.vehiclemod.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class ContainerVehicleWorkbench extends Container {
	
	private InventoryPlayer playerInv;
	
	public ContainerVehicleWorkbench() {
		super();
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
		return super.transferStackInSlot(playerIn, index);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}
}
