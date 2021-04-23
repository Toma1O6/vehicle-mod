package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.items.ItemNitroCan;
import dev.toma.vehiclemod.init.VMSounds;
import dev.toma.vehiclemod.util.DevUtil;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.fml.common.network.ByteBufUtils;

public class NitroHandler implements ISerializationListener {

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

    public boolean hasNitroLED() {
        return inventory.getStackInSlot(11).getItem() == Registries.VMItems.NITRO_LED;
    }

    public boolean hasNitro(int slotID) {
        ItemStack stack = inventory.getStackInSlot(slotID);
        return stack.getItem() instanceof ItemNitroCan && stack.getItemDamage() < stack.getMaxDamage();
    }

    public ItemStack getNitroCloud(int index) {
        return inventory.getStackInSlot(5 + index);
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

    @Override
    public void onNBTWrite(NBTTagCompound nbt) {
        NBTTagList list = DevUtil.inventoryToNBT(inventory);
        nbt.setTag("nitro", list);
    }

    @Override
    public void onNBTRead(NBTTagCompound nbt) {
        if(nbt.hasKey("nitro", Constants.NBT.TAG_LIST)) {
            DevUtil.loadInventoryFromNBT(inventory, nbt.getTagList("nitro", Constants.NBT.TAG_COMPOUND));
        }
    }

    @Override
    public void onBytesWrite(ByteBuf buf) {
        NBTTagCompound data = new NBTTagCompound();
        onNBTWrite(data);
        ByteBufUtils.writeTag(buf, data);
    }

    @Override
    public void onBytesRead(ByteBuf buf) {
        NBTTagCompound data = ByteBufUtils.readTag(buf);
        onNBTRead(data);
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
