package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLockpick extends VMItem implements IVehicleAction {

    public ItemLockpick(String name) {
        super(name);
    }

    @Override
    public void apply(EntityPlayer player, World world, ItemStack stack, EntityVehicle vehicle) {
        if(!vehicle.getLockManager().isUnlocked()) {
            VehicleMod.proxy.openLockpickUI(vehicle);
        }
    }
}
