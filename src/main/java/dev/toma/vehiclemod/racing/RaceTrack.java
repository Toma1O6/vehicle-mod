package dev.toma.vehiclemod.racing;

import com.google.common.base.Preconditions;
import dev.toma.vehiclemod.racing.points.Checkpoint;
import dev.toma.vehiclemod.racing.points.Point;
import dev.toma.vehiclemod.racing.points.RotatedPoint;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RaceTrack {

    final String name;
    final List<Checkpoint> checkpoints = new ArrayList<>();
    final List<RotatedPoint> points = new ArrayList<>();
    boolean isLoop;

    public RaceTrack(String name) {
        this.name = name;
    }

    public RaceTrack(NBTTagCompound nbt) {
        name = nbt.getString("name");
        isLoop = nbt.getBoolean("isLoop");
        fillList(nbt.getTagList("checkpoints", Constants.NBT.TAG_COMPOUND), checkpoints, Checkpoint::new);
        fillList(nbt.getTagList("startpoints", Constants.NBT.TAG_COMPOUND), points, RotatedPoint::new);
        Preconditions.checkState(name != null && !name.isEmpty(), "Invalid track name");
    }

    public int getNextCheckpoint(int last) {
        int next = last + 1;
        if(next >= checkpoints.size()) {
            next = isLoop ? 0 : -1;
        }
        return next;
    }

    public Checkpoint getCheckpoint(int index) {
        return checkpoints.get(index);
    }

    public void toggleLoop() {
        isLoop = !isLoop;
    }

    public int supportedPlayerCount() {
        return points.size();
    }

    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

    public List<RotatedPoint> getPoints() {
        return points;
    }

    public String id() {
        return name;
    }

    public NBTTagCompound writeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setString("name", name);
        nbt.setBoolean("isLoop", isLoop);
        nbt.setTag("checkpoints", createList(checkpoints));
        nbt.setTag("startpoints", createList(points));
        return nbt;
    }

    <P extends Point> NBTTagList createList(List<P> points) {
        NBTTagList list = new NBTTagList();
        for (P point : points) {
            list.appendTag(point.writeNBT());
        }
        return list;
    }

    <P extends Point> void fillList(NBTTagList nbt, List<P> list, Function<NBTTagCompound, P> factory) {
        list.clear();
        for (int i = 0; i < nbt.tagCount(); i++) {
            NBTTagCompound nbtc = nbt.getCompoundTagAt(i);
            P p = factory.apply(nbtc);
            list.add(p);
        }
    }
}
