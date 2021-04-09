package dev.toma.vehiclemod.racing.points;

import com.google.common.base.Preconditions;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.math.BlockPos;

public class Point {

    final BlockPos pos;

    public Point(BlockPos pos) {
        this.pos = pos;
    }

    public Point(NBTTagCompound nbt) {
        this.pos = NBTUtil.getPosFromTag(nbt.getCompoundTag("pos"));
        this.readAdditional(nbt);
        Preconditions.checkState(pos.getY() > 0, "Invalid point position");
    }

    public BlockPos getPos() {
        return pos;
    }

    public boolean isInside(double x, double y, double z) {
        int px = pos.getX();
        int py = pos.getY();
        int pz = pos.getZ();
        return x >= px && x <= px + 1 && y >= py && y <= py + 1 && z >= pz && z <= pz + 1;
    }

    public double getDistanceSq(double x, double y, double z) {
        double dx = (pos.getX() + 0.5) - x;
        double dy = (pos.getY() + 0.5) - y;
        double dz = (pos.getZ() + 0.5) - z;
        return dx * dx + dy * dy + dz * dz;
    }

    public double getDistance(double x, double y, double z) {
        return Math.sqrt(this.getDistanceSq(x, y, z));
    }

    public void rotate() {
    }

    public float getRotation() {
        return 0.0F;
    }

    public final NBTTagCompound writeNBT() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setTag("pos", NBTUtil.createPosTag(pos));
        writeAdditional(nbt);
        return nbt;
    }

    protected void writeAdditional(NBTTagCompound nbt) {}

    protected void readAdditional(NBTTagCompound nbt) {}
}
