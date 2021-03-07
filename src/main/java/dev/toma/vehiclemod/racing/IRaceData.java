package dev.toma.vehiclemod.racing;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public interface IRaceData extends Comparable<IRaceData> {

    int lastCheckpoint();

    void claimCheckpoint(int checkpoint);

    long finishTime();

    boolean hasFinished();

    void setFinished(long time);

    void onLapFinish(EntityPlayer player, long time);

    Race getRace();

    EntityPlayer getPlayer();

    void writeToNBT(NBTTagCompound nbt);

    void readFromNBT(NBTTagCompound nbt);

    class BasePlayerData implements IRaceData {

        final Race race;
        final EntityPlayer player;
        int checkpoint = -1;
        long finishTime;
        boolean finished;

        public BasePlayerData(Race race, EntityPlayer player) {
            this.race = race;
            this.player = player;
        }

        @Override
        public int lastCheckpoint() {
            return checkpoint;
        }

        @Override
        public void claimCheckpoint(int checkpoint) {
            this.checkpoint = checkpoint;
        }

        @Override
        public boolean hasFinished() {
            return finished;
        }

        @Override
        public void setFinished(long time) {
            this.finishTime = time;
        }

        @Override
        public long finishTime() {
            return finishTime;
        }

        @Override
        public void onLapFinish(EntityPlayer player, long time) {

        }

        @Override
        public void writeToNBT(NBTTagCompound nbt) {
            nbt.setBoolean("finished", finished);
            nbt.setInteger("checkpoint", checkpoint);
            nbt.setLong("finishTime", finishTime);
        }

        @Override
        public void readFromNBT(NBTTagCompound nbt) {
            finished = nbt.getBoolean("finished");
            checkpoint = nbt.getInteger("checkpoint");
            finishTime = nbt.getLong("finishTime");
        }

        @Override
        public int compareTo(IRaceData other) {
            if(hasFinished()) {
                if(other.hasFinished()) {
                    return (int) (finishTime() - other.finishTime());
                } else {
                    return -1;
                }
            } else {
                if(other.hasFinished()) {
                    return 1;
                } else if(lastCheckpoint() == other.lastCheckpoint()) {
                    RaceTrack track = this.getRace().getTrack();
                    int nextCheckpointID = track.getNextCheckpoint(lastCheckpoint());
                    Checkpoint checkpoint = track.getCheckpoint(nextCheckpointID);
                    EntityPlayer player1 = this.getPlayer();
                    EntityPlayer player2 = other.getPlayer();
                    return Double.compare(checkpoint.getDistanceSq(player1.posX, player1.posY, player1.posZ), checkpoint.getDistanceSq(player2.posX, player2.posY, player2.posZ));
                } else {
                    return lastCheckpoint() - other.lastCheckpoint();
                }
            }
        }

        @Override
        public Race getRace() {
            return race;
        }

        @Override
        public EntityPlayer getPlayer() {
            return player;
        }
    }

    class LoopRaceData extends BasePlayerData {

        int currentLap;

        public LoopRaceData(Race race, EntityPlayer player) {
            super(race, player);
        }

        @Override
        public void onLapFinish(EntityPlayer player, long time) {
            ++currentLap;
        }

        @Override
        public int compareTo(IRaceData other) {
            if(hasFinished()) {
                if(other.hasFinished()) {
                    return (int) (finishTime() - other.finishTime());
                } else {
                    return -1;
                }
            } else {
                if(other.hasFinished()) {
                    return 1;
                } else if(lastCheckpoint() == other.lastCheckpoint()) {
                    RaceTrack track = this.getRace().getTrack();
                    int nextCheckpointID = track.getNextCheckpoint(lastCheckpoint());
                    Checkpoint checkpoint = track.getCheckpoint(nextCheckpointID);
                    EntityPlayer player1 = this.getPlayer();
                    EntityPlayer player2 = other.getPlayer();
                    return Double.compare(checkpoint.getDistanceSq(player1.posX, player1.posY, player1.posZ), checkpoint.getDistanceSq(player2.posX, player2.posY, player2.posZ));
                } else {
                    return lastCheckpoint() - other.lastCheckpoint();
                }
            }
        }
    }
}
