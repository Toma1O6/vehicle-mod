package dev.toma.vehiclemod.racing;

import dev.toma.vehiclemod.racing.argument.ArgumentMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

import java.util.*;

public abstract class Race {

    public final RaceType<?> type;
    public final RaceTrack track;
    protected final List<EntityPlayer> players = new ArrayList<>();
    protected final Map<UUID, IRaceData> playerDataMap = new TreeMap<>();
    protected ArgumentMap arguments;
    protected long time;

    public Race(RaceType<?> type, RaceTrack track) {
        this.type = type;
        this.track = track;
        arguments = type.map.copy();
    }

    public abstract IRaceData createData(EntityPlayer player);

    public void tick(World world) {
        for (Map.Entry<UUID, IRaceData> entry : playerDataMap.entrySet()) {
            EntityPlayer player = world.getPlayerEntityByUUID(entry.getKey());
            if(player == null)
                continue;
            IRaceData data = entry.getValue();
            if(!data.hasFinished()) {
                int lastCheckpoint = data.lastCheckpoint();
                int nextCheckpoint = track.getNextCheckpoint(lastCheckpoint);
                if(nextCheckpoint == -1) {
                    // finish race
                    data.setFinished(time);
                    continue;
                }
                Checkpoint checkpoint = track.getCheckpoint(nextCheckpoint);
                if(checkpoint.isInside(player.posX, player.posY, player.posZ)) {
                    if(nextCheckpoint == 0) {
                        data.onLapFinish(player, time);
                    }
                    if(!data.hasFinished()) {
                        data.claimCheckpoint(nextCheckpoint);
                    }
                }
            }
        }
    }

    public void join(EntityPlayer player) {
        players.add(player);
        playerDataMap.put(player.getUniqueID(), createData(player));
    }

    public final void loadArguments(NBTTagCompound nbtTagCompound) {
        arguments.load(nbtTagCompound, this);
    }

    public RaceTrack getTrack() {
        return track;
    }

    public RaceType<?> getType() {
        return type;
    }

    public List<IRaceData> getSortedData() {
        List<IRaceData> list = new ArrayList<>(playerDataMap.values());
        list.sort(null);
        return list;
    }

    public NBTTagCompound writeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setLong("time", time);
        NBTTagList list = new NBTTagList();
        for (Map.Entry<UUID, IRaceData> entry : playerDataMap.entrySet()) {
            UUID uuid = entry.getKey();
            IRaceData data = entry.getValue();
            NBTTagCompound compound = new NBTTagCompound();
            compound.setUniqueId("UUID", uuid);
            NBTTagCompound raceData = new NBTTagCompound();
            data.writeToNBT(raceData);
            compound.setTag("data", raceData);
            list.appendTag(compound);
        }
        nbt.setTag("data", list);
        return nbt;
    }

    public void readNBT(NBTTagCompound nbt, World world) {
        playerDataMap.clear();
        players.clear();
        time = nbt.getLong("time");
        NBTTagList list = nbt.getTagList("data", Constants.NBT.TAG_COMPOUND);
        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound compound = list.getCompoundTagAt(i);
            UUID uuid = compound.getUniqueId("UUID");
            EntityPlayer player = world.getPlayerEntityByUUID(uuid);
            if(player == null)
                continue;
            IRaceData raceData = this.createData(player);
            raceData.readFromNBT(compound.getCompoundTag("data"));
            playerDataMap.put(uuid, raceData);
            players.add(player);
        }
    }

    public enum RaceState {
        SCHEDULED,
        WAITING,
        RUNNING,
        FINISHED,
        ARCHIVED
    }

    public static class RaceSchedule {

    }
}
