package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.ILockpickable;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.Constants;

import java.util.UUID;
import java.util.function.Predicate;

public class LockManager implements Predicate<UUID>, ISerializationListener {

    protected EnumCarLockType carLockType;
    protected UUID linkedUUID;
    private boolean unlocked;
    private int[] combinations;

    public LockManager() {
        this.setCarLockType(EnumCarLockType.IRON, false);
        this.linkedUUID = UUID.randomUUID();
    }

    public int[] getCombinations() {
        return combinations;
    }

    public void handleUnlock() {
        setUnlocked(true);
        this.linkedUUID = UUID.randomUUID();
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

    public void setCarLockType(EnumCarLockType carLockType, boolean isNatural) {
        this.carLockType = carLockType;
        this.combinations = new int[carLockType.getPinCount(isNatural)];
        for (int i = 0; i < combinations.length; i++) {
            combinations[i] = i;
        }
        ILockpickable.shuffle(combinations);
        this.linkedUUID = UUID.randomUUID();
    }

    public EnumCarLockType getCarLockType() {
        return carLockType;
    }

    public UUID getLinkedUUID() {
        return linkedUUID;
    }

    @Override
    public void onNBTWrite(NBTTagCompound nbt) {
        NBTTagCompound data = new NBTTagCompound();
        data.setByte("lockType", (byte) carLockType.ordinal());
        data.setBoolean("unlocked", unlocked);
        data.setUniqueId("key", linkedUUID);
        nbt.setTag("lock", data);
    }

    @Override
    public void onNBTRead(NBTTagCompound nbt) {
        if(nbt.hasKey("lock", Constants.NBT.TAG_COMPOUND)) {
            NBTTagCompound data = nbt.getCompoundTag("lock");
            carLockType = EnumCarLockType.values()[nbt.getByte("lockType")];
            unlocked = data.getBoolean("unlocked");
            linkedUUID = data.getUniqueId("key");
        }
    }

    @Override
    public void onBytesWrite(ByteBuf buf) {
        buf.writeByte((byte) carLockType.ordinal());
        buf.writeBoolean(unlocked);
        buf.writeLong(linkedUUID.getMostSignificantBits());
        buf.writeLong(linkedUUID.getLeastSignificantBits());
    }

    @Override
    public void onBytesRead(ByteBuf buf) {
        carLockType = EnumCarLockType.values()[buf.readByte()];
        unlocked = buf.readBoolean();
        linkedUUID = new UUID(buf.readLong(), buf.readLong());
    }
}
