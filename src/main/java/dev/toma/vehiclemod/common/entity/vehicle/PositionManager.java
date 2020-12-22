package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.particle.Particles;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class PositionManager {

    private final Vec3d engine;
    private final Vec3d[] exhausts;
    private final Vec3d neonFront;
    private final Vec3d neonBack;
    private final Vec3d neonRight;
    private final Vec3d neonLeft;
    private final boolean neonsDisabled;
    private final Map<NeonHandler.Direction, Double> directionDoubleMap;

    public PositionManager(Builder builder) {
        this.engine = builder.engine;
        this.exhausts = builder.exhausts;
        this.neonFront = builder.neonFront;
        this.neonBack = builder.neonBack;
        this.neonRight = builder.neonRight;
        this.neonLeft = builder.neonLeft;
        this.neonsDisabled = builder.neonsDisabled;
        this.directionDoubleMap = builder.map;
    }

    public boolean hasCustomLength(NeonHandler.Direction direction) {
        return directionDoubleMap.containsKey(direction);
    }

    public double getLength(NeonHandler.Direction direction) {
        return DevUtil.getSafe(directionDoubleMap, direction, 0.0D);
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
                VehicleMod.proxy.spawnParticle(Particles.NITRO_CLOUD, world, x + ex.x, y + ex.y, z + ex.z, 0, 0.1, 0, 0xFFFF);
                if(nitro)
                    VehicleMod.proxy.spawnParticle(Particles.NITRO_FLAME, world, x + ex.x, y + ex.y, z + ex.z, 0, 0, 0, 1);
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

    public boolean areNeonsDisabled() {
        return neonsDisabled;
    }

    public static class Builder {

        private Vec3d engine;
        private Vec3d[] exhausts;
        private Vec3d neonFront;
        private Vec3d neonBack;
        private Vec3d neonRight;
        private Vec3d neonLeft;
        private boolean neonsDisabled;
        private Map<NeonHandler.Direction, Double> map = new HashMap<>();

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
            this.neonFront = new Vec3d(0, 0, n);
            return this;
        }

        public Builder backNeon(double n) {
            this.neonBack = new Vec3d(0, 0, -n);
            return this;
        }

        public Builder rightNeon(double n) {
            this.neonRight = new Vec3d(n, 0, 0);
            return this;
        }

        public Builder rightNeon(double x, double z) {
            this.neonRight = new Vec3d(x, 0, z);
            return this;
        }

        public Builder leftNeon(double n) {
            this.neonLeft = new Vec3d(-n, 0, 0);
            return this;
        }

        public Builder leftNeon(double x, double z) {
            this.neonLeft = new Vec3d(-x, 0, z);
            return this;
        }

        public Builder sideNeons(double n) {
            rightNeon(n);
            leftNeon(n);
            return this;
        }

        public Builder sideNeons(double x, double z) {
            rightNeon(x, z);
            leftNeon(x, z);
            return this;
        }

        public Builder frontLength(double length) {
            return this.length(NeonHandler.Direction.FRONT, length);
        }

        public Builder backLength(double length) {
            return this.length(NeonHandler.Direction.BACK, length);
        }

        public Builder sideLength(double length) {
            length(NeonHandler.Direction.RIGHT, length);
            length(NeonHandler.Direction.LEFT, length);
            return this;
        }

        public Builder length(NeonHandler.Direction direction, double length) {
            map.put(direction, length);
            return this;
        }

        public Builder disable() {
            this.neonsDisabled = true;
            return this;
        }

        public PositionManager build() {
            return new PositionManager(this);
        }
    }
}