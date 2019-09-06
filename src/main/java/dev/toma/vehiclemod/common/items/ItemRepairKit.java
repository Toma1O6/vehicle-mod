package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.util.IVehicleAccessory;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemRepairKit extends VMItem implements IVehicleAccessory {

    public ItemRepairKit(String name) {
        super(name);
        this.setMaxStackSize(1);
    }

    @Override
    public void apply(EntityVehicle vehicle, World world, EntityPlayer player) {
        vehicle.health = vehicle.getStats().maxHealth;
        if(!player.capabilities.isCreativeMode) {
            player.getHeldItemMainhand().shrink(1);
        }
    }
}
