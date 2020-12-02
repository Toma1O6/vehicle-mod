package dev.toma.vehiclemod.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class ModContainer<I extends IInventory> extends Container {

    public I inventory;

    public ModContainer(I inventory) {
        this.inventory = inventory;
    }

    public I getIInventory() {
        return inventory;
    }

    public void addDefaultInventory(InventoryPlayer inv, int ys) {
        this.addDefaultInventory(inv, 8, ys);
    }

    public void addDefaultInventory(InventoryPlayer inv, int xs, int ys) {
        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 9; x++) {
                addSlotToContainer(new Slot(inv, 9 + y * 9 + x, xs + x * 18, ys + y * 18));
            }
        }
        for(int x = 0; x < 9; x++) {
            addSlotToContainer(new Slot(inv, x, xs + x * 18, ys + 58));
        }
    }

    public void addSpecialSlot(IInventory inventory, int idx, int x, int y, int slotAmount, Predicate<ItemStack> predicate) {
        addSlotToContainer(new Slot(inventory, idx, x, y) {
            @Override
            public int getSlotStackLimit() {
                return slotAmount;
            }

            @Override
            public boolean isItemValid(ItemStack stack) {
                return predicate.test(stack);
            }
        });
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (index < this.inventory.getSizeInventory()) {
                if (!this.mergeItemStack(itemstack1, this.inventory.getSizeInventory(), this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, this.inventory.getSizeInventory(), false)) {
                return ItemStack.EMPTY;
            }
            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
