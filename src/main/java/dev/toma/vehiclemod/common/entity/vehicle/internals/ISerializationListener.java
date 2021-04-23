package dev.toma.vehiclemod.common.entity.vehicle.internals;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;

public interface ISerializationListener {

    /**
     * Writes data into supplied {@link NBTTagCompound}
     * @param nbt NBT tag for writing data
     */
    void onNBTWrite(NBTTagCompound nbt);

    /**
     * Reads data from supplied {@link NBTTagCompound}
     * @param nbt NBT tag containing all saved data
     */
    void onNBTRead(NBTTagCompound nbt);

    /**
     * Writes data into supplied {@link ByteBuf}
     * <br>Called <b>SERVER-SIDE</b> when client requests data sync
     * <br><b>Data writing and reading must be done in same order!</b>
     * @param buf Byte buffer for writing data
     */
    void onBytesWrite(ByteBuf buf);

    /**
     * Reads data from supplied {@link ByteBuf}
     * <br>Called <b>CLIENT-SIDE</b> when client receives entity data from server
     * <br><b>Data writing and reading must be done in same order!</b>
     * @param buf Byte buffer for reading data
     */
    void onBytesRead(ByteBuf buf);
}
