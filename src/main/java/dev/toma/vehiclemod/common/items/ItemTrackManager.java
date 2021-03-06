package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import dev.toma.vehiclemod.racing.Checkpoint;
import dev.toma.vehiclemod.racing.Point;
import dev.toma.vehiclemod.racing.RaceTrack;
import dev.toma.vehiclemod.racing.StartPoint;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ItemTrackManager<T extends Point> extends VMItem {

    final Action<T> action;

    public ItemTrackManager(String name, Action<T> action) {
        super(name);
        this.action = action;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        BlockPos up = pos.up();
        RacingData data = RacingDataImpl.get(worldIn);
        trackItr:
        for (RaceTrack track : data.getTracks()) {
            List<T> list = action.getCollection(track);
            for (T t : list) {
                if(t.getPos().equals(up)) {
                    action.interactWithPoint(player, t, track);
                    break trackItr;
                }
            }
        }
        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    public interface Action<T extends Point> {

        List<T> getCollection(RaceTrack track);

        void interactWithPoint(EntityPlayer player, T point, RaceTrack track);
    }

    public static class RadiusChangeAction implements Action<Checkpoint> {

        final int value;

        public RadiusChangeAction(int value) {
            this.value = value;
        }

        @Override
        public List<Checkpoint> getCollection(RaceTrack track) {
            return track.getCheckpoints();
        }

        @Override
        public void interactWithPoint(EntityPlayer player, Checkpoint point, RaceTrack track) {
            point.setRadius(point.getRadius() + value);
        }
    }

    public static class RotateStartingPoint implements Action<StartPoint> {

        @Override
        public List<StartPoint> getCollection(RaceTrack track) {
            return track.getPoints();
        }

        @Override
        public void interactWithPoint(EntityPlayer player, StartPoint point, RaceTrack track) {
            point.rotate();
        }
    }

    public static class DeleteStartingPoint implements Action<StartPoint> {
        @Override
        public List<StartPoint> getCollection(RaceTrack track) {
            return track.getPoints();
        }

        @Override
        public void interactWithPoint(EntityPlayer player, StartPoint point, RaceTrack track) {
            track.getPoints().remove(point);
        }
    }

    public static class DeleteCheckpoint implements Action<Checkpoint> {
        @Override
        public List<Checkpoint> getCollection(RaceTrack track) {
            return track.getCheckpoints();
        }

        @Override
        public void interactWithPoint(EntityPlayer player, Checkpoint point, RaceTrack track) {
            track.getCheckpoints().remove(point);
        }
    }
}
