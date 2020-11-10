package dev.toma.vehiclemod.common.entity.vehicle;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.UUID;
import java.util.function.Predicate;

public class LockManager implements Predicate<UUID>, INBTSerializable<NBTTagCompound> {

    protected final EnumCarLockType carLockType;
    protected UUID linkedUUID;
    private boolean isLocked = true;
    private int[] combinations;

    public LockManager(EnumCarLockType carLockType, UUID vehicleUUID) {
        this.carLockType = carLockType;
        this.linkedUUID = vehicleUUID;
    }

    public void refresh(EntityVehicle vehicle) {
        this.linkedUUID = vehicle.getPersistentID();
    }

    public int[] getCombinations() {
        return combinations;
    }

    public void handleUnlock() {

    }

    @Override
    public boolean test(UUID uuid) {
        return linkedUUID.equals(uuid);
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setBoolean("locked", isLocked);
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        isLocked = nbt.getBoolean("locked");
    }
}
