package dev.toma.vehiclemod.common.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class TileEntityVehicleWorkbench extends TileEntity implements IInventory {
	
	private NonNullList<ItemStack> inv = NonNullList.<ItemStack>withSize(12, ItemStack.EMPTY);
	
	public void update() {
		
	}
	
	@Override
	public String getName() {
		return "Vehicle Workbench";
	}
	
	@Override
	public ITextComponent getDisplayName() {
		return new TextComponentTranslation("container.vehicle_workbench");
	}
	
	@Override
	public boolean hasCustomName() {
		return true;
	}
	
	@Override
	public boolean isEmpty() {
		for(ItemStack stack : inv) {
			if(!stack.isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public void clear() {
		this.inv.clear();
	}
	
	@Override
	public int getSizeInventory() {
		return inv.size();
	}
	
	@Override
	public void openInventory(EntityPlayer player) {}
	
	@Override
	public void closeInventory(EntityPlayer player) {}
	
	@Override
	public int getField(int id) {
		return 0;
	}
	
	@Override
	public int getFieldCount() {
		return 0;
	}
	
	@Override
	public void setField(int id, int value) {}
	
	@Override
	public boolean isUsableByPlayer(EntityPlayer player) {
		return true;
	}
	
	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return true;
	}
	
	@Override
	public ItemStack getStackInSlot(int index) {
		return index >= 0 && index < this.getSizeInventory() ? this.inv.get(index) : ItemStack.EMPTY;
	}
	
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	
	@Override
	public ItemStack decrStackSize(int index, int count) {
		ItemStack stack = ItemStackHelper.getAndSplit(inv, index, count);
		if(!stack.isEmpty()) {
			this.markDirty();
		}
		return stack;
	}
	
	@Override
	public ItemStack removeStackFromSlot(int index) {
		ItemStack stack = this.getStackInSlot(index);
		if(!stack.isEmpty()) {
			this.inv.set(index, ItemStack.EMPTY);
		}
		return stack;
	}
	
	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
        this.inv.set(index, stack);
        if(!stack.isEmpty() && stack.getCount() > this.getInventoryStackLimit())
        {
            stack.setCount(this.getInventoryStackLimit());
        }
        this.markDirty();
	}
	
	@Override
	public void markDirty() {
		super.markDirty();
		this.update();
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
	}
}
