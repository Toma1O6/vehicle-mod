package dev.toma.vehiclemod.racing;

import net.minecraft.util.math.BlockPos;

public class Point {

    final BlockPos pos;

    public Point(BlockPos pos) {
        this.pos = pos;
    }

    public BlockPos getPos() {
        return pos;
    }
}
