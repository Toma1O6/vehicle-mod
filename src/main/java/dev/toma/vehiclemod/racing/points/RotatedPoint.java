package dev.toma.vehiclemod.racing.points;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;

public class RotatedPoint extends Point {

    private float yaw;

    public RotatedPoint(BlockPos pos) {
        super(pos);
    }

    public RotatedPoint(NBTTagCompound nbt) {
        super(nbt);
    }

    public void setRotation(float rotation) {
        this.yaw = rotation;
    }

    @Override
    public void rotate() {
        float newYaw = yaw + 45.0F;
        if(newYaw >= 360) {
            newYaw = 0;
        }
        this.yaw = newYaw;
    }

    @Override
    public float getRotation() {
        return yaw;
    }

    @Override
    protected void writeAdditional(NBTTagCompound nbt) {
        nbt.setFloat("yaw", yaw);
    }

    @Override
    protected void readAdditional(NBTTagCompound nbt) {
        yaw = nbt.getFloat("yaw");
    }
}
