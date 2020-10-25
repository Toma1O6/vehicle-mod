package dev.toma.vehiclemod.common.container;

import dev.toma.vehiclemod.common.inventory.InventoryComponents;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerVehicleComponents extends ModContainer<InventoryComponents> {

    public ContainerVehicleComponents(InventoryPlayer player, InventoryComponents components) {
        super(components);
        for (int x = 0; x < 8; x++) {
            addSlotToContainer(new SlotInput(components, x, 26 + x * 18, 8));
        }
        addDefaultInventory(player, 56);
    }

    static class SlotInput extends Slot {

        private final ItemVehicleUpgrade.Type type;
        final String texture;

        public SlotInput(InventoryComponents components, int i, int x, int y) {
            super(components, i, x, y);
            this.type = ItemVehicleUpgrade.Type.values()[i];
            this.texture = "vehiclemod:items/" + type.name().toLowerCase();
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            if(stack.getItem() instanceof ItemVehicleUpgrade) {
                ItemVehicleUpgrade upgrade = (ItemVehicleUpgrade) stack.getItem();
                return type == upgrade.getType() && ((InventoryComponents) inventory).getUpgrades().canUpgradeWith(upgrade);
            }
            return false;
        }

        @Override
        public String getSlotTexture() {
            return texture;
        }
    }
}
