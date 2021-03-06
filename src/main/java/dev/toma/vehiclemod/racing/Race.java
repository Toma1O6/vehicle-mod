package dev.toma.vehiclemod.racing;

import dev.toma.vehiclemod.racing.argument.ArgumentMap;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class Race implements INBTSerializable<NBTTagCompound> {

    public final long raceID;
    public final RaceType type;
    public final RaceTrack track;
    protected ArgumentMap arguments;

    public Race(long raceID, RaceType type, RaceTrack track) {
        this.raceID = raceID;
        this.type = type;
        this.track = track;
        arguments = type.map.copy();
    }

    public final void loadArguments(NBTTagCompound nbtTagCompound) {
        arguments.load(nbtTagCompound, this);
    }

    public RaceTrack getTrack() {
        return track;
    }

    public RaceType getType() {
        return type;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {

    }
}
