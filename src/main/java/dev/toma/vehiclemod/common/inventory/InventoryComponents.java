package dev.toma.vehiclemod.common.inventory;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;
import dev.toma.vehiclemod.common.items.ItemPerk;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;

public class InventoryComponents extends InventoryBasic {

    private EntityVehicle vehicle;
    private VehicleUpgrades upgrades;
    final EntityPlayer player;

    public InventoryComponents(EntityPlayer player) {
        super(new TextComponentString("ComponentInventory"), 12);
        if(player.getRidingEntity() instanceof EntityVehicle) {
            this.vehicle = (EntityVehicle) player.getRidingEntity();
            this.upgrades = vehicle.getUpgrades();
        }
        this.player = player;
    }

    public VehicleUpgrades getUpgrades() {
        return upgrades;
    }

    public EntityVehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void markDirty() {
        for (int i = 0; i < 9; i++) {
            ItemStack stack = getStackInSlot(i);
            if(!stack.isEmpty()) {
                if(stack.getItem() instanceof ItemVehicleUpgrade) {
                    ItemVehicleUpgrade upgrade = (ItemVehicleUpgrade) stack.getItem();
                    upgrades.upgrade(upgrade, player);
                    stack.setCount(0);
                }
            }
        }
        for (int i = 9; i < getSizeInventory(); i++) {
            ItemStack stack = getStackInSlot(i);
            if(!stack.isEmpty() && stack.getItem() instanceof ItemPerk) {
                int index = i - 9;
                upgrades.setPerk(index, (ItemPerk) stack.getItem());
                stack.setCount(0);
            }
        }
        super.markDirty();
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }
}
