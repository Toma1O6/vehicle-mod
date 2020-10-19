package dev.toma.vehiclemod.common.capability.chunks;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public interface ChunkData extends INBTSerializable<NBTTagCompound> {

    boolean isMarked();

    void mark();
}
