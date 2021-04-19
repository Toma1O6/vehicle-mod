package dev.toma.vehiclemod.common.inventory;

import net.minecraft.inventory.InventoryBasic;

public class InventoryNeons extends InventoryBasic {

    EntityVehicle vehicle;

    public InventoryNeons(EntityVehicle vehicle) {
        super("inventory.neons", false, 5);
        this.vehicle = vehicle;
    }

    public EntityVehicle getVehicle() {
        return vehicle;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public void markDirty() {
        super.markDirty();
        if(!vehicle.world.isRemote)
            vehicle.sync();
    }
}
