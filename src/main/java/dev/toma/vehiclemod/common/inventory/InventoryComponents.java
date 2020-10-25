package dev.toma.vehiclemod.common.inventory;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

public class InventoryComponents extends InventoryBasic {

    private VehicleUpgrades upgrades;
    final EntityPlayer player;

    public InventoryComponents(EntityPlayer player) {
        super(new TextComponentString("ComponentInventory"), 8);
        if(player.getRidingEntity() instanceof EntityVehicle) {
            this.upgrades = ((EntityVehicle) player.getRidingEntity()).getUpgrades();
        }
        this.player = player;
    }

    public VehicleUpgrades getUpgrades() {
        return upgrades;
    }

    @Override
    public void markDirty() {
        for (int i = 0; i < getSizeInventory(); i++) {
            ItemStack stack = getStackInSlot(i);
            if(!stack.isEmpty()) {
                if(stack.getItem() instanceof ItemVehicleUpgrade) {
                    ItemVehicleUpgrade upgrade = (ItemVehicleUpgrade) stack.getItem();
                    upgrades.upgrade(upgrade, player);
                    stack.setCount(0);
                }
            }
        }
        super.markDirty();
    }
}
