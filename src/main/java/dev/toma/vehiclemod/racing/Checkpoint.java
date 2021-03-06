package dev.toma.vehiclemod.racing;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Checkpoint extends Point {

    int radius;

    public Checkpoint(BlockPos pos) {
        this(pos, 3);
    }

    public Checkpoint(BlockPos pos, int radius) {
        super(pos);
        this.setRadius(radius);
    }

    public void setRadius(int radius) {
        this.radius = MathHelper.clamp(radius, 1, 30);
    }

    public int getRadius() {
        return radius;
    }
}
