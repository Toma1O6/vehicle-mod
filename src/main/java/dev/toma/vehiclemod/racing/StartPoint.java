package dev.toma.vehiclemod.racing;

import net.minecraft.util.math.BlockPos;

public class StartPoint extends Point {

    private float yaw;

    public StartPoint(BlockPos pos) {
        super(pos);
    }

    public BlockPos getPos() {
        return pos;
    }

    public float getYaw() {
        return yaw;
    }

    public void rotate() {
        float newYaw = yaw + 45.0F;
        if(newYaw >= 360) {
            newYaw = 0;
        }
        this.yaw = newYaw;
    }
}
