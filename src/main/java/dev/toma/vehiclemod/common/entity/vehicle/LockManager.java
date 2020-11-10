package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.ILockpickable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.UUID;
import java.util.function.Predicate;

public class LockManager implements Predicate<UUID>, INBTSerializable<NBTTagCompound> {

    protected EnumCarLockType carLockType;
    protected UUID linkedUUID;
    private boolean unlocked;
    private int[] combinations;

    public LockManager(EnumCarLockType carLockType) {
        this.setCarLockType(carLockType);
        this.linkedUUID = UUID.randomUUID();
    }

    public void refresh(EntityVehicle vehicle) {
        this.linkedUUID = vehicle.getPersistentID();
    }

    public int[] getCombinations() {
        return combinations;
    }

    public void handleUnlock() {
        setUnlocked(true);
        this.linkedUUID = UUID.randomUUID();
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setByte("lockType", (byte) carLockType.ordinal());
        nbt.setBoolean("unlocked", unlocked);
        nbt.setUniqueId("key", linkedUUID);
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        carLockType = EnumCarLockType.values()[nbt.getByte("lockType")];
        unlocked = nbt.getBoolean("unlocked");
        linkedUUID = nbt.getUniqueId("key");
    }

    @Override
    public boolean test(UUID uuid) {
        return linkedUUID.equals(uuid);
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
        ILockpickable.shuffle(combinations);
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setCarLockType(EnumCarLockType carLockType) {
        this.carLockType = carLockType;
        this.combinations = new int[carLockType.getPinCount()];
        for (int i = 0; i < combinations.length; i++) {
            combinations[i] = i;
        }
        ILockpickable.shuffle(combinations);
    }

    public EnumCarLockType getCarLockType() {
        return carLockType;
    }

    public UUID getLinkedUUID() {
        return linkedUUID;
    }
}
