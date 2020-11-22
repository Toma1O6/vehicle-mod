package dev.toma.vehiclemod.common.container;

import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.fluids.IFilter;
import dev.toma.vehiclemod.common.fluids.IFuelMakerItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerFuelMaker extends ModContainer<TileEntityFuelMaker> {

    static final String FILTER_TEXTURE = "vehiclemod:items/filter_empty";
    static final String BUCKET_TEXTURE = "vehiclemod:items/bucket_empty";

    public ContainerFuelMaker(InventoryPlayer player, TileEntityFuelMaker tileEntityFuelMaker) {
        super(tileEntityFuelMaker);

        addSlotToContainer(new SlotInput(tileEntityFuelMaker, 0, 8, 8));
        addSlotToContainer(new SlotOutput(tileEntityFuelMaker, 1, 26, 124));
        addSlotToContainer(new SlotOutput(tileEntityFuelMaker, 2, 134, 124));
        for (int x = 0; x < 3; x++) {
            addSlotToContainer(new SlotFilter(tileEntityFuelMaker, x + 3, 62 + x * 18, 84));
            addSlotToContainer(new SlotBucket(tileEntityFuelMaker, x + 6, 62 + x * 18, 124));
        }

        addDefaultInventory(player, 148);
    }

    static class SlotInput extends Slot {

        public SlotInput(IInventory inventory, int id, int x, int y) {
            super(inventory, id, x, y);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return stack.getItem() instanceof IFuelMakerItem;
        }

        @Override
        public String getSlotTexture() {
            return BUCKET_TEXTURE;
        }
    }

    static class SlotOutput extends Slot {

        public SlotOutput(IInventory inventory, int id, int x, int y) {
            super(inventory, id, x, y);
        }

        @Override
        public int getSlotStackLimit() {
            return 1;
        }

        @Override
        public String getSlotTexture() {
            return BUCKET_TEXTURE;
        }
    }

    static class SlotFilter extends Slot {

        public SlotFilter(IInventory inventory, int id, int x, int y) {
            super(inventory, id, x, y);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return stack.getItem() instanceof IFilter;
        }

        @Override
        public String getSlotTexture() {
            return FILTER_TEXTURE;
        }
    }

    static class SlotBucket extends Slot {

        public SlotBucket(IInventory inventory, int id, int x, int y) {
            super(inventory, id, x, y);
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            return stack.getItem() == Items.BUCKET;
        }

        @Override
        public String getSlotTexture() {
            return BUCKET_TEXTURE;
        }
    }
}
