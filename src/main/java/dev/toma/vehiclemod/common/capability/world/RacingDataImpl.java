package dev.toma.vehiclemod.common.capability.world;

import dev.toma.vehiclemod.racing.Race;
import dev.toma.vehiclemod.racing.RaceTrack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingDataImpl implements RacingData {

    final World world;
    final Map<RaceTrack, Race> trackRaceMap;
    final List<RaceTrack> tracks;

    public RacingDataImpl() {
        this(null);
    }

    public RacingDataImpl(World world) {
        this.world = world;
        this.trackRaceMap = new HashMap<>();
        this.tracks = new ArrayList<>();
    }

    @Override
    public World getAssociatedWorld() {
        return world;
    }

    @Override
    public void createRace(Race race, NBTTagCompound data) {
        RaceTrack track = race.getTrack();
    }

    @Override
    public Map<RaceTrack, Race> getRaces() {
        return trackRaceMap;
    }

    @Override
    public List<RaceTrack> getTracks() {
        return tracks;
    }

    @Override
    public void addTrack(RaceTrack track) {
        tracks.add(track);
    }

    @Override
    public NBTTagCompound serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {

    }
}
