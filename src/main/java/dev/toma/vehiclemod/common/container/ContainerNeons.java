package dev.toma.vehiclemod.common.container;

import dev.toma.vehiclemod.common.inventory.InventoryNeons;
import dev.toma.vehiclemod.common.items.ItemNeon;
import dev.toma.vehiclemod.common.items.ItemNeonPulser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerNeons extends ModContainer<InventoryNeons> {

    public ContainerNeons(InventoryPlayer playerInventory, InventoryNeons neons) {
        super(neons);

        addSlotToContainer(new SlotPulser(neons, 0, 8, 91));
        for (int i = 0; i < 4; i++)
            addSlotToContainer(new SlotNeon(neons, 1 + i, 98 + i * 18, 91));
        addDefaultInventory(playerInventory, 114);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack stack;
        Slot slot = inventorySlots.get(index);
        if(slot != null && slot.getHasStack()) {
            ItemStack stack1 = slot.getStack();
            stack = stack1.copy();
            if(!stack.isEmpty()) {
                if(index >= 5) {
                    if(stack.getItem() instanceof ItemNeonPulser) {
                        if(!mergeItemStack(stack1, 0, 1, false))
                            return ItemStack.EMPTY;
                        slot.onSlotChange(stack1, stack);
                    } else if(stack.getItem() instanceof ItemNeon) {
                        if(!mergeItemStack(stack1, 1, 5, false))
                            return ItemStack.EMPTY;
                        slot.onSlotChange(stack1, stack);
                    }
                } else {
                    if(!mergeItemStack(stack1, 5, 41, false))
                        return ItemStack.EMPTY;
                    slot.onSlotChange(stack1, stack);
                }
            }
        }
        return ItemStack.EMPTY;
    }

    static class SlotNeon extends Slot {

        public SlotNeon(IInventory inventory, int id, int x, int y) {
            super(inventory, id, x, y);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return stack.getItem() instanceof ItemNeon;
        }

        @Override
        public int getSlotStackLimit() {
            return 1;
        }

        @Override
        public String getSlotTexture() {
            return "vehiclemod:items/neon_empty";
        }
    }

    static class SlotPulser extends Slot {

        public SlotPulser(IInventory inventory, int id, int x, int y) {
            super(inventory, id, x, y);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return stack.getItem() instanceof ItemNeonPulser;
        }

        @Override
        public int getSlotStackLimit() {
            return 1;
        }

        @Override
        public String getSlotTexture() {
            return "vehiclemod:items/neon_pulser_empty";
        }
    }
}
