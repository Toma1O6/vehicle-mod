package dev.toma.vehiclemod.common.fluids;

import dev.toma.vehiclemod.Registries;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.INBTSerializable;

public class FluidEntry implements INBTSerializable<NBTTagCompound> {

    public static final FluidEntry EMPTY = new FluidEntry((FluidType) null, 0);
    final int limit;
    FluidType type;
    int amount;

    public FluidEntry(FluidType type, int limit) {
        this.type = type;
        this.limit = limit;
    }

    public FluidEntry(NBTTagCompound nbt, int limit) {
        this.limit = limit;
        deserializeNBT(nbt);
    }

    public boolean isEmpty() {
        return this == EMPTY || type == null;
    }

    public boolean canMix(FluidType type) {
        return this.type == type && !isEmpty();
    }

    public void mix(FluidEntry entry) {
        add(entry.getAmount());
    }

    public FluidType getType() {
        return type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        if(this.amount <= 0) {
            type = null;
        }
    }

    public void add(int amount) {
        setAmount(Math.min(limit, this.amount + Math.abs(amount)));
    }

    public void reduce(int amount) {
        setAmount(Math.max(0, this.amount - Math.abs(amount)));
    }

    public int getAmount() {
        return amount;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setString("key", type.getRegistryName().toString());
        nbt.setInteger("amount", amount);
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        type = Registries.FLUID_TYPES.getValue(new ResourceLocation(nbt.getString("key")));
        amount = nbt.getInteger("amount");
    }
}
