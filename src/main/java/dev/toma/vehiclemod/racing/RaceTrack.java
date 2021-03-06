package dev.toma.vehiclemod.racing;

import java.util.ArrayList;
import java.util.List;

public class RaceTrack {

    final String name;
    final List<Checkpoint> checkpoints = new ArrayList<>();
    final List<StartPoint> points = new ArrayList<>();
    boolean isLoop;

    public RaceTrack(String name) {
        this.name = name;
    }

    public Checkpoint getNextPoint(int index) {
        if(index >= checkpoints.size()) {
            return checkpoints.get(0);
        }
        return checkpoints.get(index + 1);
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

    public List<StartPoint> getPoints() {
        return points;
    }

    public String id() {
        return name;
    }
}
