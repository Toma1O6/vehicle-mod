package dev.toma.vehiclemod.common.capability.world;

import dev.toma.vehiclemod.racing.Race;
import dev.toma.vehiclemod.racing.RaceTrack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.List;
import java.util.Map;

public interface RacingData extends INBTSerializable<NBTTagCompound> {

    World getAssociatedWorld();

    void createRace(Race race, NBTTagCompound data);

    Map<RaceTrack, Race> getRaces();

    List<RaceTrack> getTracks();

    void addTrack(RaceTrack track);
}
