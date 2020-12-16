package dev.toma.vehiclemod.common.container;

import dev.toma.vehiclemod.common.entity.vehicle.NitroHandler;
import dev.toma.vehiclemod.common.items.ItemNitroCan;
import dev.toma.vehiclemod.common.items.ItemNitroCloud;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerNitro extends ModContainer<InventoryBasic> {

    final NitroHandler handler;

    public ContainerNitro(InventoryPlayer player, NitroHandler handler) {
        super(handler.getInventory());
        this.handler = handler;

        for (int i = 0; i < 5; i++) {
            addSlotToContainer(new SlotNitroCan(handler.getInventory(), i, 8 + i * 18, 17));
        }

        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 3; x++) {
                addSlotToContainer(new SlotNitroCloudSpray(handler.getInventory(), 5 + y * 3 + x, 116 + x * 18, 8 + y * 18));
            }
        }

        addDefaultInventory(player, 64);
    }

    public NitroHandler getNitroHandler() {
        return handler;
    }

    static class SlotNitroCan extends Slot {

        SlotNitroCan(IInventory inventory, int id, int x, int y) {
            super(inventory, id, x, y);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return stack.getItem() instanceof ItemNitroCan;
        }

        @Override
        public String getSlotTexture() {
            return "vehiclemod:items/nitro_can_empty";
        }
    }

    static class SlotNitroCloudSpray extends Slot {

        SlotNitroCloudSpray(IInventory inventory, int id, int x, int y) {
            super(inventory, id, x, y);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return stack.getItem() instanceof ItemNitroCloud;
        }

        @Override
        public String getSlotTexture() {
            return "vehiclemod:items/nitro_cloud_spray_empty";
        }
    }
}
