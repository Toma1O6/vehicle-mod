package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.EnumCarLockType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCarLock extends VMItem implements IVehicleAction {

    private final EnumCarLockType carLockType;

    public ItemCarLock(String name, EnumCarLockType carLockType) {
        super(name);
        this.carLockType = carLockType;
    }

    @Override
    public void apply(EntityPlayer player, World world, ItemStack stack, EntityVehicle vehicle) {

    }
}
