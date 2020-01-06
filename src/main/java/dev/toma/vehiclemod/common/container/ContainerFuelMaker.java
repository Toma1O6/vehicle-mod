package dev.toma.vehiclemod.common.container;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerFuelMaker extends Container {

    private final TileEntityFuelMaker tileEntityFuelMaker;

    public ContainerFuelMaker(InventoryPlayer player, TileEntityFuelMaker tileEntityFuelMaker) {
        this.tileEntityFuelMaker = tileEntityFuelMaker;
        addSlotToContainer(new Slot(tileEntityFuelMaker, 0, 98, 9) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return stack.getItem() == Registries.VMItems.BUCKET_OF_ACTIVATED_FUEL_SUBSTANCE;
            }

            @Override
            public int getSlotStackLimit() {
                return 1;
            }
        });
        this.addSlotToContainer(new Slot(tileEntityFuelMaker, 4, 98, 64) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return stack.getItem() == Items.BUCKET;
            }

            @Override
            public int getSlotStackLimit() {
                return 1;
            }
        });
        for(int i = 0; i < 3; i++) {
            addSlotToContainer(new Slot(tileEntityFuelMaker, 1 + i, 8, 28 + i * 18) {
                @Override
                public boolean isItemValid(ItemStack stack) {
                    return stack.getItem() == Registries.VMItems.FUEL_FILTER;
                }

                @Override
                public int getSlotStackLimit() {
                    return 1;
                }
            });
        }
        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 9; x++) {
                addSlotToContainer(new Slot(player, x + y * 9 + 9, 8 + x * 18, 87 + y * 18));
            }
        }
        for(int x = 0; x < 9; x++) {
            addSlotToContainer(new Slot(player, x, 8 + x * 18, 145));
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < this.tileEntityFuelMaker.getSizeInventory()) {
                if (!this.mergeItemStack(itemstack1, this.tileEntityFuelMaker.getSizeInventory(), this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, this.tileEntityFuelMaker.getSizeInventory(), false)) {
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
