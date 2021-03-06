package dev.toma.vehiclemod.common.capability;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;

public class StorageImpl<T extends INBTSerializable<NBTTagCompound>> implements Capability.IStorage<T> {

    @Override
    public NBTBase writeNBT(Capability<T> capability, T instance, EnumFacing side) {
        return instance.serializeNBT();
    }

    @Override
    public void readNBT(Capability<T> capability, T instance, EnumFacing side, NBTBase nbt) {
        instance.deserializeNBT(nbt instanceof NBTTagCompound ? (NBTTagCompound) nbt : new NBTTagCompound());
    }
}
