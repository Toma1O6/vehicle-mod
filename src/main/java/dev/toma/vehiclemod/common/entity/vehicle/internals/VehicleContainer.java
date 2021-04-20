package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.inventory.InventoryBasic;

public class VehicleContainer extends InventoryBasic {

    public VehicleContainer(EntityVehicle entityVehicle, int slots) {
        super(entityVehicle.getDisplayName() + " container", false, slots);
    }
}
