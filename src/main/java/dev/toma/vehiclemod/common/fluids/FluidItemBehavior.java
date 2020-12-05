package dev.toma.vehiclemod.common.fluids;

import dev.toma.vehiclemod.common.items.ItemNitroCan;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public interface FluidItemBehavior {

    @Nullable
    Item getFluidItem();

    boolean canProcess(ItemStack stack, int amount);

    void process(ItemStack stack, FluidEntry entry, int slotID, IInventory inventory);

    class Bucket implements FluidItemBehavior {

        private final Item out;

        public Bucket(Item out) {
            this.out = out;
        }

        @Override
        public Item getFluidItem() {
            return out;
        }

        @Override
        public boolean canProcess(ItemStack stack, int amount) {
            return stack.getItem() == Items.BUCKET && amount >= 10000;
        }

        @Override
        public void process(ItemStack stack, FluidEntry entry, int slotID, IInventory inventory) {
            inventory.setInventorySlotContents(slotID, new ItemStack(out));
            entry.reduce(10000);
        }
    }

    class Nitro implements FluidItemBehavior {

        @Override
        public Item getFluidItem() {
            return null;
        }

        @Override
        public boolean canProcess(ItemStack stack, int amount) {
            return stack.getItem() instanceof ItemNitroCan && stack.getItemDamage() == 1 && amount > 0;
        }

        @Override
        public void process(ItemStack stack, FluidEntry entry, int slotID, IInventory inventory) {
            stack.setItemDamage(0);
            entry.reduce(((ItemNitroCan) stack.getItem()).getCapacity());
        }
    }
}
