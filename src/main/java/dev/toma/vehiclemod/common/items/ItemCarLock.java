package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.EnumCarLockType;
import dev.toma.vehiclemod.common.entity.vehicle.LockManager;
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
        LockManager manager = vehicle.lockManager;
        if(manager.isUnlocked()) {
            manager.setCarLockType(carLockType);
            manager.setUnlocked(false);
            vehicle.sync();
            if(!world.isRemote) {
                player.addItemStackToInventory(ItemCarKey.createKeysFor(vehicle, player));
                if(!player.isCreative()) {
                    stack.shrink(1);
                }
            }
        }
    }
}
