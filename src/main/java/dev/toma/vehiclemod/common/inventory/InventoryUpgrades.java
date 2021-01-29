package dev.toma.vehiclemod.common.inventory;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;

public class InventoryUpgrades extends InventoryBasic {

    private final EntityVehicle vehicle;

    public InventoryUpgrades(EntityVehicle vehicle) {
        super("inventory.upgrades", false, 12);
        this.vehicle = vehicle;
    }

    public int getLevel(ItemVehicleUpgrade.Type type) {
        ItemStack stack = this.getStackInSlot(type.ordinal());
        return !stack.isEmpty() && stack.getItem() instanceof ItemVehicleUpgrade ? ((ItemVehicleUpgrade) stack.getItem()).getLevel() : -1;
    }

    @Override
    public void markDirty() {
        super.markDirty();
        if(vehicle.getUpgrades() != null) {
            vehicle.getUpgrades().recalculate();
        }
    }

    public EntityVehicle getVehicle() {
        return vehicle;
    }
}
