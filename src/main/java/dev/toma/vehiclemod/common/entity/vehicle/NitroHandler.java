package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.items.ItemNitroCan;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;

public class NitroHandler {

    private final InventoryBasic inventory = new InventoryBasic("inventory.nitro", false, 5);
    private final EntityVehicle vehicle;
    private boolean state;

    public NitroHandler(EntityVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean canUseNitro(Entity entity) {
        return entity != null && vehicle.inputNitro && hasNitro();
    }

    public boolean hasNitro() {
        return getFirstUsableNitroSlot() != -1;
    }

    public void burnNitro() {
        int slotID = this.getFirstUsableNitroSlot();
        if(slotID >= 0) {
            ItemStack stack = inventory.getStackInSlot(slotID);
            int maxDamage = stack.getMaxDamage() - stack.getItemDamage();
            int damageAmount = Math.min(maxDamage, ((ItemNitroCan) stack.getItem()).getExtractAmount());
            stack.setItemDamage(stack.getItemDamage() + damageAmount);
        }
    }

    public InventoryBasic getInventory() {
        return inventory;
    }

    public void update(Entity entity, boolean using) {
        if(using) {
            burnNitro();
            if(!state) {
                // play start sound
                VehicleMod.proxy.playNitroSound(vehicle);
            }
        } else if(!using && state) {
            // play stop sound and stop nitro sound
        }
        this.state = using;
    }

    public boolean isNitroActive() {
        return vehicle.inputNitro && state;
    }

    private int getFirstUsableNitroSlot() {
        for (int i = 0; i < inventory.getSizeInventory(); i++) {
            ItemStack stack = inventory.getStackInSlot(i);
            if(!stack.isEmpty() && stack.getItem() instanceof ItemNitroCan && stack.getItemDamage() < stack.getMaxDamage()) {
                return i;
            }
        }
        return -1;
    }
}
