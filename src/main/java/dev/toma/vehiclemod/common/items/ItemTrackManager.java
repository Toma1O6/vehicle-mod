package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.capability.world.RacingData;
import dev.toma.vehiclemod.common.capability.world.RacingDataImpl;
import dev.toma.vehiclemod.racing.RaceTrack;
import dev.toma.vehiclemod.racing.points.Checkpoint;
import dev.toma.vehiclemod.racing.points.Point;
import dev.toma.vehiclemod.racing.points.RotatedPoint;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Collection;

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
        for (RaceTrack track : data.getTracks()) {
            T t = action.getPoint(track, pos);
            if(t != null) {
                action.interact(player, t, track);
            }
        }
        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    public interface Action<T extends Point> {

        T getPoint(RaceTrack track, BlockPos pos);

        void interact(EntityPlayer player, T point, RaceTrack track);

        default T filterOut(Collection<? extends T> collection, BlockPos pos) {
            for (T t : collection) {
                if(t.getPos().equals(pos.up())) {
                    return t;
                }
            }
            return null;
        }
    }

    public static class RadiusChangeAction implements Action<Checkpoint> {

        final int value;

        public RadiusChangeAction(int value) {
            this.value = value;
        }

        @Override
        public Checkpoint getPoint(RaceTrack track, BlockPos pos) {
            return filterOut(track.getCheckpoints(), pos);
        }

        @Override
        public void interact(EntityPlayer player, Checkpoint point, RaceTrack track) {
            point.setRadius(point.getRadius() + value);
        }
    }

    public static class RotatePoint implements Action<RotatedPoint> {

        @Override
        public RotatedPoint getPoint(RaceTrack track, BlockPos pos) {
            RotatedPoint point = filterOut(track.getPoints(), pos);
            if(point == null) {
                point = filterOut(track.getCheckpoints(), pos);
            }
            return point;
        }

        @Override
        public void interact(EntityPlayer player, RotatedPoint point, RaceTrack track) {
            point.rotate();
        }
    }

    public static class DeleteStartingPoint implements Action<RotatedPoint> {

        @Override
        public RotatedPoint getPoint(RaceTrack track, BlockPos pos) {
            return filterOut(track.getPoints(), pos);
        }

        @Override
        public void interact(EntityPlayer player, RotatedPoint point, RaceTrack track) {
            track.getPoints().remove(point);
        }
    }

    public static class DeleteCheckpoint implements Action<Checkpoint> {

        @Override
        public Checkpoint getPoint(RaceTrack track, BlockPos pos) {
            return filterOut(track.getCheckpoints(), pos);
        }

        @Override
        public void interact(EntityPlayer player, Checkpoint point, RaceTrack track) {
            track.getCheckpoints().remove(point);
        }
    }

    public static class ToggleLoop implements Action<Checkpoint> {

        @Override
        public Checkpoint getPoint(RaceTrack track, BlockPos pos) {
            return filterOut(track.getCheckpoints(), pos);
        }

        @Override
        public void interact(EntityPlayer player, Checkpoint point, RaceTrack track) {
            track.toggleLoop();
        }
    }
}
