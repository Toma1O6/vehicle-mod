package dev.toma.vehiclemod.common.container;

import dev.toma.vehiclemod.common.inventory.InventoryUpgrades;
import dev.toma.vehiclemod.common.items.ItemPerk;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerVehicleComponents extends ModContainer<InventoryUpgrades> {

    public ContainerVehicleComponents(InventoryPlayer player, InventoryUpgrades upgrades) {
        super(upgrades);
        for (int x = 0; x < 9; x++) {
            addSlotToContainer(new SlotTunning(upgrades, x, 8 + x * 18, 8));
        }
        for (int y = 0; y < 3; y++) {
            addSlotToContainer(new SlotPerk(upgrades, 9 + y, 181, 19 + y * 18));
        }
        addDefaultInventory(player, 94);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack stack;
        Slot slot = inventorySlots.get(index);
        if(slot != null && slot.getHasStack() && index >= 9) {
            ItemStack stack1 = slot.getStack();
            stack = stack1.copy();
            if(!stack.isEmpty()) {
                if(stack.getItem() instanceof ItemVehicleUpgrade) {
                    ItemVehicleUpgrade.Type type = ((ItemVehicleUpgrade) stack.getItem()).getType();
                    int target = type.ordinal();
                    if(!mergeItemStack(stack1, target, target + 1, false))
                        return ItemStack.EMPTY;
                    slot.onSlotChange(stack1, stack);
                }
            }
        }
        return ItemStack.EMPTY;
    }

    static class SlotTunning extends Slot {

        private final ItemVehicleUpgrade.Type type;

        public SlotTunning(InventoryUpgrades components, int i, int x, int y) {
            super(components, i, x, y);
            this.type = ItemVehicleUpgrade.Type.values()[i];
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            if(stack.getItem() instanceof ItemVehicleUpgrade) {
                ItemVehicleUpgrade upgrade = (ItemVehicleUpgrade) stack.getItem();
                return type == upgrade.getType();
            }
            return false;
        }

        @Override
        public String getSlotTexture() {
            return null;
        }
    }

    static class SlotPerk extends Slot {

        SlotPerk(InventoryUpgrades components, int i, int x, int y) {
            super(components, i, x, y);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return stack.getItem() instanceof ItemPerk;
        }

        @Override
        public String getSlotTexture() {
            return getHasStack() ? null : "vehiclemod:items/perk_empty";
        }
    }
}
