package dev.toma.vehiclemod.racing.points;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Checkpoint extends RotatedPoint {

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

    public boolean hasPassed(Entity entity) {
        Vec3d left = getLeft();
        Vec3d right = getRight();
        Vec3d current = entity.getPositionVector();
        Vec3d prev = new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ);
        double heightDiff = Math.abs(Math.abs(current.y - prev.y) - Math.abs(left.y - right.y));
        if(heightDiff > 10.0)
            return false;
        double x1 = left.x;
        double z1 = left.z;
        double x2 = right.x;
        double z2 = right.z;
        double x3 = current.x;
        double z3 = current.z;
        double x4 = prev.x;
        double z4 = prev.z;
        double det = (x2 - x1) * (z4 - z3) - (x4 - x3) * (z2 - z1);
        if (det == 0)
            return false;
        double lambda = ((z4 - z3) * (x4 - x1) + (x3 - x4) * (z4 - z1)) / det;
        double gamma = ((z1 - z2) * (x4 - x1) + (x2 - x1) * (z4 - z1)) / det;
        return (0 < lambda && lambda < 1) && (0 < gamma && gamma < 1);
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
        super.writeAdditional(nbt);
        nbt.setInteger("rad", radius);
    }

    @Override
    protected void readAdditional(NBTTagCompound nbt) {
        super.readAdditional(nbt);
        radius = nbt.getInteger("rad");
    }

    public Vec3d getLeft() {
        return new Vec3d(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5).add(new Vec3d(0, 0, -radius).rotateYaw(-this.getRotation() * 0.017453292F - ((float) Math.PI / 2f)));
    }

    public Vec3d getRight() {
        return new Vec3d(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5).add(new Vec3d(0, 0, radius).rotateYaw(-this.getRotation() * 0.017453292F - ((float) Math.PI / 2f)));
    }
}
