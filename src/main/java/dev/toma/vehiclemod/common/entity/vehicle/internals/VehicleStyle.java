package dev.toma.vehiclemod.common.entity.vehicle.internals;

import com.google.common.base.Preconditions;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.particle.ParticleNitroCloud;
import dev.toma.vehiclemod.client.particle.Particles;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.items.ItemNitroCloud;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class VehicleStyle implements ISerializationListener {

    /**
     * PI constant divided by 180
     * Used in vector rotations
     */
    public static final float PI_D_180 = (float) (Math.PI / 180.0F);
    /**
     * PI constant divided by 2
     * Used in vector rotations
     */
    public static final float HALF_PI = (float) (Math.PI / 2.0F);

    private final Properties properties;
    private Texture texture;

    public VehicleStyle(Class<? extends EntityVehicle> vehicleClass) {
        this.properties = PropertyList.lookupProperty(vehicleClass);
        if(properties == null) {
            throw new IllegalStateException("Couldn't find properties for " + vehicleClass.getSimpleName());
        }
        this.texture = properties.supplyRandomTexture();
    }

    public void doParticles(World world, NitroHandler nitroHandler, double x, double y, double z, float healthStat, boolean started, float yaw) {
        if(healthStat <= 0.5F) {
            Vec3d engine = rotateVecYaw(properties.engine, yaw);
            world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, x + engine.x, y + engine.y, z + engine.z, 0.0, 0.1, 0.0);
            if(healthStat <= 0.0F) {
                Random random = world.rand;
                double dx = (random.nextDouble() - random.nextDouble()) / 8;
                double dy = Math.max(random.nextDouble() / 15, 0.05);
                double dz = (random.nextDouble() - random.nextDouble()) / 8;
                world.spawnParticle(EnumParticleTypes.CLOUD, x + engine.x, y + engine.y, z + engine.z, dx, dy, dz);
            }
        }
        if(started) {
            for (Vec3d vec3d : properties.exhausts) {
                Vec3d exhaust = rotateVecYaw(vec3d, yaw);
                world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + exhaust.x, y + exhaust.y, z + exhaust.z, 0, 0.02d, 0);
                if(nitroHandler.isNitroActive()) {
                    VehicleMod.proxy.spawnParticle(Particles.NITRO_FLAME, world, x + exhaust.x, y + exhaust.y, z + exhaust.z, 0, 0, 0, 1);
                }
            }
        }
        if(nitroHandler.areCloudsActive()) {
            boolean lighting = nitroHandler.hasNitroLED();
            for (int i = 0; i < properties.nitroSprayCount; i++) {
                ItemStack stack = nitroHandler.getNitroCloud(i);
                if(!stack.isEmpty()) {
                    ItemNitroCloud cloud = (ItemNitroCloud) stack.getItem();
                    CloudExit exit = properties.cloudExits[i];
                    Vec3d cloudPos = rotateVecYaw(exit.position, yaw);
                    Vec3d cloudMot = rotateVecYaw(exit.motion, yaw);
                    int color = cloud.getColor();
                    if(lighting)
                        color |= ParticleNitroCloud.LIGHT_FLAG << 24;
                    VehicleMod.proxy.spawnParticle(Particles.NITRO_CLOUD, world, x + cloudPos.x, y + cloudPos.y, z + cloudPos.z, cloudMot.x, cloudMot.y, cloudMot.z, color);
                }
            }
        }
    }

    public boolean canApplyTexture(Texture texture) {
        return properties.textureValidator.test(properties.textureTransformer.apply(texture));
    }

    public void repaint(Texture texture) {
        this.texture = properties.textureTransformer.apply(texture);
    }

    public Texture getTexture() {
        return texture;
    }

    public int getNitroSprayCount() {
        return properties.nitroSprayCount;
    }

    public boolean areNeonsDisabled() {
        return properties.neonsDisabled;
    }

    public boolean hasCustomNeonLength(NeonHandler.Direction direction) {
        return getCustomNeonLength(direction) > 0;
    }

    public double getCustomNeonLength(NeonHandler.Direction direction) {
        return properties.neonSizes[direction.ordinal()];
    }

    public Vec3d getNeonFront() {
        return properties.neonFront;
    }

    public Vec3d getNeonBack() {
        return properties.neonBack;
    }

    public Vec3d getNeonLeft() {
        return properties.neonLeft;
    }

    public Vec3d getNeonRight() {
        return properties.neonRight;
    }

    public boolean canFitPassenger(int currentPassengers) {
        return currentPassengers < properties.seatCount;
    }

    public double getPassengerX(int passengerIndex) {
        return properties.passengerX.getPosition(passengerIndex);
    }

    public double getPassengerY() {
        return properties.passengerY;
    }

    public double getPassengerZ(int passengerIndex) {
        return properties.passengerZ.getPosition(passengerIndex);
    }

    public static Vec3d rotateVecYaw(Vec3d in, float yaw) {
        return in.rotateYaw(-yaw * PI_D_180 - HALF_PI);
    }

    @Override
    public void onNBTWrite(NBTTagCompound nbt) {
        nbt.setByte("texture", (byte) texture.ordinal());
    }

    @Override
    public void onNBTRead(NBTTagCompound nbt) {
        texture = Texture.values()[nbt.getByte("texture")];
    }

    @Override
    public void onBytesWrite(ByteBuf buf) {
        buf.writeByte((byte) texture.ordinal());
    }

    @Override
    public void onBytesRead(ByteBuf buf) {
        texture = Texture.values()[buf.readByte()];
    }

    public static class Properties {

        private final int nitroSprayCount;
        private final boolean neonsDisabled;
        private final Vec3d neonFront;
        private final Vec3d neonBack;
        private final Vec3d neonRight;
        private final Vec3d neonLeft;
        private final double[] neonSizes;
        private final Vec3d engine;
        private final Vec3d[] exhausts;
        private final CloudExit[] cloudExits;
        private final Predicate<Texture> textureValidator;
        private final Function<Random, Texture> textureProvider;
        private final Function<Texture, Texture> textureTransformer;
        private final int seatCount;
        private final IPassengerPositionFunction passengerX;
        private final IPassengerPositionFunction passengerZ;
        private final double passengerY;

        private Properties(PropertyBuilder builder) {
            this.nitroSprayCount = builder.nitroExits;
            this.neonsDisabled = builder.neonsDisabled;
            this.neonFront = builder.frontNeon;
            this.neonBack = builder.backNeon;
            this.neonRight = builder.rightNeon;
            this.neonLeft = builder.leftNeon;
            this.neonSizes = builder.neonSizes;
            this.engine = builder.engine;
            this.exhausts = builder.exhausts.toArray(new Vec3d[0]);
            this.cloudExits = new CloudExit[nitroSprayCount];
            if(nitroSprayCount > 0) {
                System.arraycopy(builder.cloudExits, 0, cloudExits, 0, nitroSprayCount);
            }
            this.textureProvider = builder.textureProvider;
            this.textureValidator = builder.textureValidator;
            this.textureTransformer = builder.textureTransformer;
            this.seatCount = builder.seatCount;
            this.passengerX = builder.passengerX;
            this.passengerY = builder.passengerY;
            this.passengerZ = builder.passengerZ;
        }

        private Texture supplyRandomTexture() {
            return textureProvider.apply(VehicleMod.random);
        }
    }

    public static class CloudExit {

        private final Vec3d position;
        private final Vec3d motion;

        protected CloudExit(Vec3d position, Vec3d motion) {
            this.position = position;
            this.motion = motion;
        }

        public Vec3d getPosition() {
            return position;
        }

        public Vec3d getMotion() {
            return motion;
        }
    }

    public static class PropertyBuilder {

        private int nitroExitIndex;

        /* COMPONENTS */
        private Vec3d engine;
        private final List<Vec3d> exhausts;

        /* NEONS */
        private boolean neonsDisabled;
        private Vec3d frontNeon;
        private Vec3d backNeon;
        private Vec3d rightNeon;
        private Vec3d leftNeon;
        private double[] neonSizes;

        /* NITRO CLOUDS */
        private int nitroExits;
        private final CloudExit[] cloudExits;

        /* TEXTURES */
        private Predicate<Texture> textureValidator;
        private Function<Random, Texture> textureProvider;
        private Function<Texture, Texture> textureTransformer;

        /* PASSENGERS */
        private int seatCount;
        private double passengerY;
        private IPassengerPositionFunction passengerX;
        private IPassengerPositionFunction passengerZ;

        public PropertyBuilder() {
            engine = Vec3d.ZERO;
            exhausts = new ArrayList<>();
            frontNeon = Vec3d.ZERO;
            backNeon = Vec3d.ZERO;
            rightNeon = Vec3d.ZERO;
            leftNeon = Vec3d.ZERO;
            neonSizes = new double[NeonHandler.Direction.values().length];
            nitroExits = 6;
            cloudExits = new CloudExit[nitroExits];
            textureValidator = tex -> true;
            textureProvider = random -> Texture.values()[random.nextInt(16)];
            textureTransformer = Function.identity();
            seatCount = 1;
            passengerX = i -> 0;
            passengerZ = i -> 0;
        }

        public PropertyBuilder passengers(int seats, IPassengerPositionFunction passengerX, double passengerY, IPassengerPositionFunction passengerZ) {
            this.seatCount = seats;
            this.passengerX = passengerX;
            this.passengerY = passengerY;
            this.passengerZ = passengerZ;
            return this;
        }

        public PropertyBuilder textures(Function<Random, Texture> textureProvider, Predicate<Texture> textureValidator) {
            return textures(textureProvider, textureValidator, Function.identity());
        }

        public PropertyBuilder textures(Function<Random, Texture> textureProvider, Predicate<Texture> textureValidator, Function<Texture, Texture> textureTransformer) {
            this.textureProvider = textureProvider;
            this.textureValidator = textureValidator;
            this.textureTransformer = textureTransformer;
            return this;
        }

        public PropertyBuilder engine(double x, double y, double z) {
            engine = new Vec3d(x, y, z);
            return this;
        }

        public PropertyBuilder exhaust(double x, double y, double z) {
            return this.exhaust(new Vec3d(x, y, z));
        }

        public PropertyBuilder exhaust(double x1, double y1, double z1, double x2, double y2, double z2) {
            return this.exhaust(new Vec3d(x1, y1, z1), new Vec3d(x2, y2, z2));
        }

        public PropertyBuilder exhaust(Vec3d... vectors) {
            for (Vec3d vec3d : vectors)
                exhausts.add(vec3d);
            return this;
        }

        public PropertyBuilder nitroExits(int count) {
            this.nitroExits = count;
            return this;
        }

        public PropertyBuilder addNitroExitDef(double x, double y, double z, double motionX, double motionY, double motionZ) {
            cloudExits[nitroExitIndex++] = new CloudExit(new Vec3d(x, y, z), new Vec3d(motionX, motionY, motionZ));
            return this;
        }

        public PropertyBuilder disableNeons() {
            neonsDisabled = true;
            frontNeon = null;
            backNeon = null;
            rightNeon = null;
            leftNeon = null;
            neonSizes = null;
            return this;
        }

        public PropertyBuilder setFrontNeon(double n, double size) {
            this.frontNeon = new Vec3d(0, 0, n);
            return setNeonSize(NeonHandler.Direction.FRONT, size);
        }

        public PropertyBuilder setFrontNeon(double n) {
            return setFrontNeon(n, -1);
        }

        public PropertyBuilder setBackNeon(double n, double size) {
            this.backNeon = new Vec3d(0, 0, -n);
            return setNeonSize(NeonHandler.Direction.BACK, size);
        }

        public PropertyBuilder setBackNeon(double n) {
            return setBackNeon(n, -1);
        }

        public PropertyBuilder setRightNeon(double x, double z) {
            this.rightNeon = new Vec3d(x, 0, z);
            return this;
        }

        public PropertyBuilder setRightNeon(double x) {
            return setRightNeon(x, 0);
        }

        public PropertyBuilder setLeftNeon(double x, double z) {
            this.leftNeon = new Vec3d(-x, 0, z);
            return this;
        }

        public PropertyBuilder setLeftNeon(double x) {
            return setLeftNeon(x, 0);
        }

        public PropertyBuilder setSideNeons(double x, double z, double size) {
            return setRightNeon(x, z).setLeftNeon(x, z).setNeonSize(NeonHandler.Direction.RIGHT, size).setNeonSize(NeonHandler.Direction.LEFT, size);
        }

        public PropertyBuilder setSideNeons(double x, double z) {
            return setSideNeons(x, z, -1);
        }

        public PropertyBuilder setSideNeons(double x) {
            return setSideNeons(x, 0);
        }

        public PropertyBuilder setNeonSize(NeonHandler.Direction direction, double value) {
            neonSizes[direction.ordinal()] = value;
            return this;
        }

        public Properties buildProperties() {
            Preconditions.checkNotNull(engine, "Engine position cannot be null!");
            Preconditions.checkState(exhausts != null && !exhausts.isEmpty(), "Exhaust positions cannot be null/empty");
            if(!neonsDisabled) {
                Preconditions.checkNotNull(frontNeon, "Front neon cannot be null!");
                Preconditions.checkNotNull(backNeon, "Back neon cannot be null!");
                Preconditions.checkNotNull(rightNeon, "Right neon cannot be null!");
                Preconditions.checkNotNull(leftNeon, "Left neon cannot be null!");
                Preconditions.checkNotNull(neonSizes, "Neon size array cannot be null!");
            }
            Preconditions.checkNotNull(cloudExits, "Cloud exits cannot be null!");
            Preconditions.checkState(nitroExits >= 0, "Nitro exit count cannot be smaller than 0!");
            for (int i = 0; i < nitroExits; i++) {
                Preconditions.checkNotNull(cloudExits[i], String.format("Nitro cloud exit defined at %d index cannot be null!", i));
            }
            Preconditions.checkNotNull(textureValidator, "Texture validator cannot be null!");
            Preconditions.checkNotNull(textureProvider, "Texture provider cannot be null!");
            Preconditions.checkState(seatCount > 0, "Seat count must be positive!");
            return new Properties(this);
        }
    }

    public enum Texture {
        WHITE(),
        ORANGE(),
        MAGENTA(),
        LIGHT_BLUE(),
        YELLOW(),
        LIME(),
        PINK(),
        GRAY(),
        SILVER(),
        CYAN(),
        PURPLE(),
        BLUE(),
        BROWN(),
        GREEN(),
        RED(),
        BLACK(),
        BIRCH(),
        BRICK(),
        DIORITE(),
        HELL(),
        IRON(),
        LAPIS(),
        PRISMARINE(),
        RUST(),
        WOOD_DARK(),
        WOOD_LIGHT(),
        WOOD(),
        SANDSTONE(),
        RED_SANDSTONE(),
        UTILITY_YELLOW(true);

        final ResourceLocation location;
        final boolean ignored;

        Texture() {
            this(false);
        }

        Texture(boolean ignored) {
            this.location = new ResourceLocation(VehicleMod.MODID, "textures/entity/" + name().toLowerCase() + ".png");
            this.ignored = ignored;
        }

        public ResourceLocation getResource() {
            return location;
        }

        public boolean isIgnored() {
            return ignored;
        }

        public static Texture transformYellowTexture(Texture texture) {
            return texture == YELLOW ? UTILITY_YELLOW : texture;
        }
    }

    @FunctionalInterface
    public interface IPassengerPositionFunction {
        double getPosition(int passengerIndex);
    }
}
