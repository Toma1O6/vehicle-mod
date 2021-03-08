package dev.toma.vehiclemod.racing;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;

public class StartPoint extends Point {

    private float yaw;

    public StartPoint(BlockPos pos) {
        super(pos);
    }

    public StartPoint(NBTTagCompound nbt) {
        super(nbt);
    }

    public BlockPos getPos() {
        return pos;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public void rotate() {
        float newYaw = yaw + 45.0F;
        if(newYaw >= 360) {
            newYaw = 0;
        }
        this.yaw = newYaw;
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
