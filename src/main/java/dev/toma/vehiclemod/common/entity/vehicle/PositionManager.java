package dev.toma.vehiclemod.common.entity.vehicle;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PositionManager {

    private final Vec3d engine;
    private final Vec3d[] exhausts;
    private final Vec3d neonFront;
    private final Vec3d neonBack;
    private final Vec3d neonRight;
    private final Vec3d neonLeft;

    public PositionManager(Builder builder) {
        this.engine = builder.engine;
        this.exhausts = builder.exhausts;
        this.neonFront = builder.neonFront;
        this.neonBack = builder.neonBack;
        this.neonRight = builder.neonRight;
        this.neonLeft = builder.neonLeft;
    }

    public void tickParticles(World world, float healthPct, boolean engineFlag, boolean nitro, double x, double y, double z, float yaw) {
        if(healthPct <= 0.5F) {
            Vec3d eng = rotateVectorYaw(engine, yaw);
            world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, true, x + eng.x, y + eng.y, z + eng.z, 0.0D, 0.1D, 0.0D);
        }
        if(engineFlag) {
            for (Vec3d vec3d : exhausts) {
                Vec3d ex = rotateVectorYaw(vec3d, yaw);
                world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, true, x + ex.x, y + ex.y, z + ex.z, 0, 0.02d, 0);
                if(nitro)
                    world.spawnParticle(EnumParticleTypes.FLAME, true, x + ex.x, y + ex.y, y + ex.z, 0, 0, 0);
            }
        }
    }

    public Vec3d getFrontNeon() {
        return neonFront;
    }

    public Vec3d getBackNeon() {
        return neonBack;
    }

    public Vec3d getRightNeon() {
        return neonRight;
    }

    public Vec3d getLeftNeon() {
        return neonLeft;
    }

    public Vec3d rotateVectorYaw(Vec3d input, float yaw) {
        return input.rotateYaw(-yaw * 0.017453292F - ((float) Math.PI / 2.0F));
    }

    public static class Builder {

        private Vec3d engine;
        private Vec3d[] exhausts;
        private Vec3d neonFront;
        private Vec3d neonBack;
        private Vec3d neonRight;
        private Vec3d neonLeft;

        Builder() {
            
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder engine(double x, double y, double z) {
            this.engine = new Vec3d(x, y, z);
            return this;
        }

        public Builder exhaust(double x, double y, double z) {
            return this.exhaust(new Vec3d(x, y, z));
        }

        public Builder exhaust(Vec3d... vecs) {
            this.exhausts = vecs;
            return this;
        }

        public Builder frontNeon(double n) {
            this.neonFront = new Vec3d(n, 0, 0);
            return this;
        }

        public Builder backNeon(double n) {
            this.neonBack = new Vec3d(-n, 0, 0);
            return this;
        }

        public Builder rightNeon(double n) {
            this.neonRight = new Vec3d(0, 0, n);
            return this;
        }

        public Builder leftNeon(double n) {
            this.neonLeft = new Vec3d(0, 0, -n);
            return this;
        }

        public Builder sideNeons(double n) {
            rightNeon(n);
            leftNeon(n);
            return this;
        }

        public PositionManager build() {
            return new PositionManager(this);
        }
    }
}
