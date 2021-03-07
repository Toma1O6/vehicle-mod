package dev.toma.vehiclemod.racing;

import net.minecraft.nbt.NBTTagCompound;
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

    public Checkpoint(NBTTagCompound nbt) {
        super(nbt);
    }

    public void setRadius(int radius) {
        this.radius = MathHelper.clamp(radius, 1, 30);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean isInside(double x, double y, double z) {
        double px = pos.getX() + 0.5;
        double py = pos.getY();
        double pz = pos.getZ() + 0.5;
        return x >= px - radius && x <= px + radius && y >= py - radius && y >= py + radius && z >= pz - radius && z <= pz + radius;
    }

    @Override
    protected void writeAdditional(NBTTagCompound nbt) {
        nbt.setInteger("rad", radius);
    }

    @Override
    protected void readAdditional(NBTTagCompound nbt) {
        radius = nbt.getInteger("rad");
    }
}
