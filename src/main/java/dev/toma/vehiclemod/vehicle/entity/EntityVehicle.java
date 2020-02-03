package dev.toma.vehiclemod.vehicle.entity;

import com.google.common.base.Predicate;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.items.ItemSprayCan;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketVehicleData;
import dev.toma.vehiclemod.vehicle.VMTickableSound;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.vecmath.Vector3f;
import java.util.ArrayList;
import java.util.List;

public abstract class EntityVehicle extends Entity implements IEntityAdditionalSpawnData {

    public static final String[] DEF_COLORS = {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};
    private static final Predicate<Entity> TARGET = entity -> EntitySelectors.NOT_SPECTATING.apply(entity) && EntitySelectors.IS_ALIVE.apply(entity) && entity.canBeCollidedWith();

    public float health;
    public float currentSpeed, prevSpeed;
    public float turnModifier;
    public float fuel;
    public EnumVehicleState prevState, currentState;
    public List<ResourceLocation> locations = new ArrayList<>();
    private int variantType;
    private double distanceTraveled = 0;
    private boolean isStarted = false;

    @SideOnly(Side.CLIENT)
    public VMTickableSound currentSound;

    private boolean inputForward, inputBack, inputRight, inputLeft;

    public EntityVehicle(World world) {
        super(world);
        setSize(2f, 1.5f);
        stepHeight = 1f;
        preventEntitySpawning = true;
        variantType = VehicleMod.getRNG().nextInt(this.getVariants().length);
        this.health = this.getStats().maxHealth;
        this.setFuel();
        if (locations.isEmpty()) {
            for (int i = 0; i < this.getVariants().length; i++) {
                String s = this.getVariants()[i];
                ResourceLocation location = new ResourceLocation(VehicleMod.Constants.ID + ":textures/vehicle/" + s + ".png");
                locations.add(location);
            }
        }
    }

    public EntityVehicle(World world, BlockPos pos) {
        this(world);
        setPosition(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
    }

    public static double getMovementSpeed(EntityVehicle vehicle) {
        return Math.sqrt(vehicle.motionX * vehicle.motionX + vehicle.motionZ * vehicle.motionZ);
    }

    public abstract String[] getVariants();

    /**
     * 0 = engine, 1 = exhaust
     **/
    public abstract Vector3f[] getPartVecs();

    public abstract VehicleStats getStats();

    public abstract int maximumAmountOfPassengers();

    public abstract VehicleSounds getSounds();

    public abstract SoundEvent getStartSound();

    public abstract void initSounds();

    public void setVariant(int color) {
        this.variantType = color;
    }

    public void updateVehicle() {
        if (!this.isBeingRidden() && (!noAccelerationInput() || !noTurningInput() || !hasFuel())) {
            inputForward = false;
            inputBack = false;
            inputRight = false;
            inputLeft = false;
        }

        updateMotion();
        handleEntityCollisions();
        checkState();

        if (collidedHorizontally) {
            currentSpeed *= 0.6;
        }

        if (!world.isRemote) {
            VMNetworkManager.instance().sendToAllAround(new CPacketVehicleData(this), new TargetPoint(dimension, posX, posY, posZ, 256));
        }

        spawnParticles();
        move(MoverType.SELF, motionX, motionY, motionZ);

        if (collidedHorizontally && getMovementSpeed(this) > 0.2) {
            currentSpeed = 0f;
            health -= getMovementSpeed(this) * 50f;
            for (Entity e : this.getPassengers()) {
                if (!e.getIsInvulnerable()) {
                    e.attackEntityFrom(DamageSource.FALL, (float) getMovementSpeed(this) * 3f);
                }
            }
        }
    }

    public void updateMotion() {
        Vec3d lookVec = this.getLookVec();
        VehicleStats stats = this.getStats();
        float modifier = this.health / stats.maxHealth < 0.33F ? this.health / stats.maxHealth : 1.0F;
        if (hasFuel()) {
            if (inputForward && !inputBack) {
                float acceleration = stats.acceleration * modifier;
                burnFuel();
                currentSpeed = currentSpeed < stats.maxSpeed ? currentSpeed + acceleration : stats.maxSpeed;
            }
            if (!inputForward && inputBack) {
                burnFuel();
                currentSpeed = currentSpeed > 0 ? currentSpeed - stats.brakeSpeed : currentSpeed > (-stats.maxSpeed * 0.3f) ? currentSpeed - (stats.acceleration * modifier) : -stats.maxSpeed * 0.3f;
            }
        }

        if (inputRight && !inputLeft) {
            turnModifier = turnModifier < stats.maxTurningAngle ? turnModifier + stats.turnSpeed : stats.maxTurningAngle;
        }
        if (inputLeft && !inputRight) {
            turnModifier = turnModifier > -stats.maxTurningAngle ? turnModifier - stats.turnSpeed : -stats.maxTurningAngle;
        }

        if (noAccelerationInput() || health < 0 || !hasFuel()) {
            if (Math.abs(currentSpeed) < 0.01)
                currentSpeed = 0f;

            if (currentSpeed != 0) {
                currentSpeed = currentSpeed > 0 ? currentSpeed - 0.008f : currentSpeed + 0.008f;
            }
        }

        if (noTurningInput()) {
            if (Math.abs(turnModifier) < 0.1f)
                turnModifier = 0f;

            if (turnModifier != 0) {
                turnModifier = turnModifier > 0 ? turnModifier - 0.3f : turnModifier + 0.3f;
            }
        }

        motionX = lookVec.x * currentSpeed;
        motionZ = lookVec.z * currentSpeed;

        if (currentSpeed != 0) {
            rotationYaw += currentSpeed > 0 ? turnModifier : -turnModifier;
        }
        if (!onGround) {
            motionY -= 0.1d;
        }
    }

    public void checkState() {
        if (this.isInWater() || world.getBlockState(getPosition().up()).getMaterial().isLiquid()) {
            if(this.health > 0) {
                this.health -= 2.5;
            }
            motionX *= 0.4d;
            motionZ *= 0.4d;
            motionY = -0.15d;
        }

        if (health < 0) {
            this.health = 0;
        }

        if (isInLava()) {
            this.explode();
        }
        currentState = this.getVehicleState();
    }

    @Override
    public void onUpdate() {
        updateVehicle();
        super.onUpdate();
        distanceTraveled += Math.sqrt(motionX * motionX + motionZ * motionZ) / 1000.0D;
        if (world.isRemote) {
            if (getSounds() == null) {
                initSounds();
            }
        }
        if(world.isRemote && prevState != currentState && isStarted) {
            this.vehicleStateChanged();
        }
        prevSpeed = currentSpeed;
        prevState = currentState;
    }

    public void vehicleStateChanged() {
        VehicleMod.proxy.playSoundAt(this);
    }

    public void updateInput(boolean forward, boolean back, boolean right, boolean left, EntityPlayer player) {
        if (this.getControllingPassenger() == player) {
            this.rotationYaw = rotationYaw < 0f ? rotationYaw + 360f : rotationYaw > 360f ? rotationYaw - 360f : rotationYaw;
            if (hasFuel()) {
                this.inputForward = forward;
                this.inputBack = back;
            }
            this.inputRight = right;
            this.inputLeft = left;
        }
    }

    @Override
    public Entity getControllingPassenger() {
        if (this.getPassengers().size() > 0) {
            if (this.getPassengers().get(0) instanceof EntityPlayer) {
                return this.getPassengers().get(0);
            }
        }
        return null;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (!this.getPassengers().contains(source.getTrueSource())) {
            this.health -= amount;
        }
        return true;
    }

    @Override
    public boolean isInRangeToRenderDist(double distance) {
        return true;
    }

    @Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
        if (!player.isSneaking()) {
            if (!world.isRemote && canBeRidden(player) && canFitPassenger(player) && player.getRidingEntity() == null) {
                player.startRiding(this);
                return true;
            }
        } else if (player.getHeldItemMainhand().getItem() instanceof ItemSprayCan) {
            ((ItemSprayCan)player.getHeldItemMainhand().getItem()).applyOnVehicle(this, world, player);
        }
        return false;
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    public void writeSpawnData(ByteBuf buf) {
        buf.writeFloat(health);
        buf.writeFloat(fuel);
        buf.writeInt(variantType);
        buf.writeDouble(distanceTraveled);
    }

    @Override
    public void readSpawnData(ByteBuf buf) {
        health = buf.readFloat();
        fuel = buf.readFloat();
        variantType = buf.readInt();
        distanceTraveled = buf.readDouble();
    }

    public VMTickableSound getVehicleSound() {
        VehicleSounds sounds = this.getSounds();
        switch (currentState) {
            case BRAKING: return sounds.getBrakeSound();
            case ACCELERATING: return sounds.getAccelerateSound();
            case KEEPING_SPEED: return sounds.getGasReleaseSound();
            case IDLE: default: return sounds.idle;

        }
    }

    public void refillFuel() {
        fuel += 25f;
        if (fuel > 100f) {
            fuel = 100f;
        }
    }

    public void repair(int amount) {
        this.health = this.health + amount > this.getStats().maxHealth ? this.getStats().maxHealth : this.health + amount;
    }

    @Override
    protected void addPassenger(Entity passenger) {
        if(this.getPassengers().isEmpty() && !isStarted) {
            world.playSound(null, posX, posY, posZ, this.getStartSound(), SoundCategory.MASTER, 1.0F, 1.0F);
            isStarted = true;
        }
        super.addPassenger(passenger);
    }

    @Override
    protected void removePassenger(Entity passenger) {
        super.removePassenger(passenger);
        if(this.getPassengers().size() == 0) {
            this.isStarted = false;
        }
    }

    @Override
    public void updatePassenger(Entity passenger) {
        if (this.isPassenger(passenger)) {
            int id = this.getPassengers().indexOf(passenger);
            double x = this.getPassengerOffsetX(id);
            double z = this.getPassengerOffsetZ(id);
            Vec3d vec = (new Vec3d(x, 0, z)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float) Math.PI / 2f));
            passenger.setPosition(posX + vec.x, posY + getMountedYOffset() + passenger.getYOffset(), posZ + vec.z);
        }
    }

    public int getVariantType() {
        return variantType;
    }

    public List<ResourceLocation> getTextures() {
        return locations;
    }

    public void setFuel() {
        fuel = 60 + rand.nextInt(40);
    }

    public double getTravelledDistance() {
        return distanceTraveled;
    }

    protected double getPassengerOffsetX(int id) {
        return 0;
    }

    protected double getPassengerOffsetZ(int id) {
        return 0;
    }

    protected void spawnParticles() {
        if (world.isRemote) {
            if (health / getStats().maxHealth <= 0.5f) {
                Vec3d engineVec = (new Vec3d(getPartVecs()[0].x, getPartVecs()[0].y + 0.25d, getPartVecs()[0].z)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float) Math.PI / 2F));
                world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, true, posX + engineVec.x, posY + engineVec.y, posZ + engineVec.z, 0d, 0.1d, 0d);
            }

            if (hasFuel() && !this.getPassengers().isEmpty()) {
                int i = 1;
                while (i < this.getPartVecs().length) {
                    Vec3d exhaustVec = (new Vec3d(getPartVecs()[i].x, getPartVecs()[i].y + 0.25d, getPartVecs()[i].z)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float) Math.PI / 2F));
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, true, posX + exhaustVec.x, posY + exhaustVec.y, posZ + exhaustVec.z, 0, 0.02d, 0);
                    ++i;
                }
            }
            if (health < 0) {
                Vec3d engine = (new Vec3d(getPartVecs()[0].x, getPartVecs()[0].y + 0.25d, getPartVecs()[0].z)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float) Math.PI / 2F));
                world.spawnParticle(EnumParticleTypes.CLOUD, true, posX + engine.x, posY + engine.y, posZ + engine.z, 0d, 0.05d, 0d);
            }
        }
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {
        compound.setDouble("posX", this.posX);
        compound.setDouble("posY", this.posY);
        compound.setDouble("posZ", this.posZ);
        compound.setDouble("motionX", this.motionX);
        compound.setDouble("motionY", this.motionY);
        compound.setDouble("motionZ", this.motionZ);
        compound.setFloat("health", this.health);
        compound.setFloat("fuel", this.fuel);
        compound.setFloat("speed", this.currentSpeed);
        compound.setInteger("textureid", this.variantType);
        compound.setDouble("traveledDist", this.distanceTraveled);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {
        posX = compound.getDouble("posX");
        posY = compound.getDouble("posY");
        posZ = compound.getDouble("posZ");
        motionX = compound.getDouble("motionX");
        motionY = compound.getDouble("motionY");
        motionZ = compound.getDouble("motionZ");
        health = compound.getFloat("health");
        fuel = compound.getFloat("fuel");
        currentSpeed = compound.getFloat("speed");
        variantType = compound.getInteger("textureid");
        distanceTraveled = compound.getDouble("traveledDist");
    }

    @Override
    protected boolean canFitPassenger(Entity passenger) {
        return this.getPassengers().size() < maximumAmountOfPassengers();
    }

    @Override
    protected void entityInit() {
    }

    private EnumVehicleState getVehicleState() {
        if (this.isAccelerating()) {
            return EnumVehicleState.ACCELERATING;
        } else if (this.isBraking()) {
            return EnumVehicleState.BRAKING;
        } else if ((prevState == EnumVehicleState.ACCELERATING || prevState == EnumVehicleState.KEEPING_SPEED) && currentSpeed != 0) {
            return EnumVehicleState.KEEPING_SPEED;
        }
        return EnumVehicleState.IDLE;
    }

    private void handleEntityCollisions() {
        Vec3d vec1 = new Vec3d(posX, posY, posZ);
        Vec3d vec2 = new Vec3d(vec1.x + motionX, vec1.y + motionY, vec1.z + motionZ);
        Entity e = findEntityInPath(vec1, vec2);

        if (e != null) {
            e.motionX += motionX * currentSpeed * 3;
            e.motionY += currentSpeed;
            e.motionZ += motionZ * currentSpeed * 3;
            e.attackEntityFrom(DamageSource.FALL, Math.abs(currentSpeed) * 15f);
        }
    }

    private Entity findEntityInPath(Vec3d start, Vec3d end) {
        Entity e = null;
        List<Entity> entityList = world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox().expand(motionX, motionY * 2, motionZ), TARGET);
        for (Entity ent : entityList) {
            if (ent != this && !this.getPassengers().contains(ent)) {
                AxisAlignedBB aabb = ent.getEntityBoundingBox().grow(0.3);
                RayTraceResult rayTrace = aabb.calculateIntercept(start, end);

                if (rayTrace != null) {
                    double d1 = start.squareDistanceTo(rayTrace.hitVec);
                    e = ent;
                }
            }
        }
        return e;
    }

    private boolean noAccelerationInput() {
        return !this.inputForward && !this.inputBack;
    }

    private boolean noTurningInput() {
        return !this.inputRight && !this.inputLeft;
    }

    private boolean hasFuel() {
        return fuel > 0;
    }

    private void burnFuel() {
        this.fuel -= this.getStats().fuelConsumption;
    }

    private void explode() {
        if (!world.isRemote) {
            world.createExplosion(this, posX, posY, posZ, 3.0F, false);
            setDead();
        }
    }

    private boolean isStandingStill() {
        return noAccelerationInput() && currentSpeed == prevSpeed;
    }

    private boolean isAccelerating() {
        return (currentState != EnumVehicleState.BRAKING && currentSpeed > prevSpeed) || inputForward;
    }

    private boolean isBraking() {
        return currentSpeed < prevSpeed && inputBack;
    }

    private boolean hasReleasedGas() {
        return noAccelerationInput() && currentSpeed > 0;
    }
}
