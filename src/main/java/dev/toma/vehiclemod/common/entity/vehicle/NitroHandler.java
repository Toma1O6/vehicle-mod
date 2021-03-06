package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.items.ItemNitroCan;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.INBTSerializable;

public class NitroHandler implements INBTSerializable<NBTTagList> {

    private final InventoryNitro inventory;
    private final EntityVehicle vehicle;
    private int useTicksLeft;
    private int startDelay;
    private int slotID;
    private boolean cloudsActive;

    public NitroHandler(EntityVehicle vehicle) {
        this.vehicle = vehicle;
        this.inventory = new InventoryNitro();
    }

    public void setCloudState(boolean state) {
        this.cloudsActive = state;
    }

    public boolean areCloudsActive() {
        return cloudsActive;
    }

    public void initiateUse(Entity entity, int slotID) {
        this.startDelay = 25;
        this.slotID = slotID;
        if(entity.world.isRemote)
            entity.playSound(VMSounds.NITRO_START, 1.0F, 1.0F);
    }

    public void tick(Entity entity) {
        if(useTicksLeft > 0) {
            --useTicksLeft;
            if(useTicksLeft == 0 && entity.world.isRemote) {
                entity.playSound(VMSounds.NITRO_END, 1.0F, 1.0F);
            }
        }
        if(startDelay > 0) {
            if(--startDelay == 0 && hasNitro(slotID)) {
                if(vehicle.world.isRemote)
                    VehicleMod.proxy.playNitroSound(vehicle);
                ItemStack stack = inventory.getStackInSlot(slotID);
                this.useTicksLeft = ((ItemNitroCan) stack.getItem()).getUseTicks();
                stack.setItemDamage(1);
            }
        }
    }

    public boolean hasNitro(int slotID) {
        ItemStack stack = inventory.getStackInSlot(slotID);
        return stack.getItem() instanceof ItemNitroCan && stack.getItemDamage() < stack.getMaxDamage();
    }

    public InventoryBasic getInventory() {
        return inventory;
    }

    public int getActiveSlot() {
        return slotID;
    }

    public boolean isNitroActive() {
        return useTicksLeft > 0;
    }

    @Override
    public NBTTagList serializeNBT() {
        return DevUtil.inventoryToNBT(inventory);
    }

    @Override
    public void deserializeNBT(NBTTagList nbt) {
        DevUtil.loadInventoryFromNBT(inventory, nbt);
    }

    public int getFirstUsableNitroSlot() {
        for (int i = 0; i < 5; i++) {
            ItemStack stack = inventory.getStackInSlot(i);
            if(!stack.isEmpty() && stack.getItem() instanceof ItemNitroCan && stack.getItemDamage() < stack.getMaxDamage()) {
                return i;
            }
        }
        return -1;
    }

    public EntityVehicle getVehicle() {
        return vehicle;
    }

    public class InventoryNitro extends InventoryBasic {

        public InventoryNitro() {
            super("inventory.nitro", false, 12);
        }

        @Override
        public int getInventoryStackLimit() {
            return 1;
        }

        @Override
        public void markDirty() {
            super.markDirty();
            EntityVehicle vehicle = NitroHandler.this.vehicle;
            if(!vehicle.world.isRemote)
                vehicle.sync();
        }
    }
}
