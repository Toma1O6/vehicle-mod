package dev.toma.vehiclemod.common.capability.world;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.racing.Race;
import dev.toma.vehiclemod.racing.RaceTrack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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

    public static RacingData get(World world) {
        return world.getCapability(RacingDataProvider.CAPABILITY, null);
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
        NBTTagCompound nbt = new NBTTagCompound();
        NBTTagList trackList = new NBTTagList();
        for (RaceTrack track : tracks) {
            trackList.appendTag(track.writeNBT());
        }
        nbt.setTag("tracks", trackList);
        return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        this.tracks.clear();
        NBTTagList tracks = nbt.getTagList("tracks", Constants.NBT.TAG_COMPOUND);
        for (int i = 0; i < tracks.tagCount(); i++) {
            NBTTagCompound trackNBT = tracks.getCompoundTagAt(i);
            try {
                this.addTrack(new RaceTrack(trackNBT));
            } catch (RuntimeException exception) {
                VehicleMod.logger.fatal("Exception occurred while loading track from NBT {}: {}", trackNBT, exception);
            }
        }
    }

    @Mod.EventBusSubscriber
    public static class EventHandler {

        @SubscribeEvent
        public static void attach(AttachCapabilitiesEvent<World> event) {
            event.addCapability(VehicleMod.getResource("racing_data"), new RacingDataProvider(event.getObject()));
        }
    }
}
