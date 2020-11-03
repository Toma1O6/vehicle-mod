package dev.toma.vehiclemod.common.entity.vehicle;

import com.google.common.base.Predicate;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.VMTickableSound;
import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.EnumVehicleState;
import dev.toma.vehiclemod.common.EnumVehicleType;
import dev.toma.vehiclemod.common.items.ItemSprayCan;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketVehicleData;
import dev.toma.vehiclemod.util.GuiHandler;
import dev.toma.vehiclemod.util.VehicleTexture;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.vecmath.Vector3f;
import java.util.List;

@SuppressWarnings("Guava")
public abstract class EntityVehicle extends Entity implements IEntityAdditionalSpawnData {

    private static final Predicate<Entity> TARGET = entity -> EntitySelectors.NOT_SPECTATING.apply(entity) && EntitySelectors.IS_ALIVE.apply(entity) && entity.canBeCollidedWith();

    public float health;
    public float currentSpeed, prevSpeed;
    public float turnModifier;
    public float fuel;
    public EnumVehicleState prevState, currentState;

    protected VehicleContainer inventory = this.createInvetory();
    protected VehicleSoundPack soundPack;
    protected VehicleUpgrades upgrades;

    private VehicleTexture texture;
    private double distanceTraveled = 0;
    private boolean isStarted = false;

    @SideOnly(Side.CLIENT)
    public VMTickableSound currentSound;
    @SideOnly(Side.CLIENT)
    public ResourceLocation cachedLocation;

    private boolean inputForward, inputBack, inputRight, inputLeft;

    public EntityVehicle(World world) {
        super(world);
        setSize(2f, 1.5f);
        stepHeight = 1f;
        preventEntitySpawning = true;
        this.upgrades = this.createVehicleUpgrades();
        texture = VehicleTexture.values()[world.rand.nextInt(16)];
        this.health = this.upgrades.getActualStats().maxHealth;
        this.setFuel();
        ignoreFrustumCheck = true;
        this.soundPack = createSoundPack();
    }

    public EntityVehicle(World world, BlockPos pos) {
        this(world);
        setPosition(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
    }

    public static double getMovementSpeed(EntityVehicle vehicle) {
        return Math.sqrt(vehicle.motionX * vehicle.motionX + vehicle.motionZ * vehicle.motionZ);
    }

    public static int[] fill(int l, int v) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++)
            arr[i] = v;
        return arr;
    }

    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this.getConfigStats());
    }

    public abstract EnumVehicleType getVehicleType();

    public abstract Vector3f[] getPartVecs();

    public abstract VehicleStats getConfigStats();

    public abstract int maximumAmountOfPassengers();

    public abstract VehicleSoundPack createSoundPack();

    public VehicleContainer createInvetory() {
        return null;
    }

    public VehicleTexture getTexture() {
        return texture;
    }

    public void setTexture(VehicleTexture texture) {
        this.texture = texture;
    }

    public boolean hasInventory() {
        return inventory != null;
    }

    public VehicleUpgrades getUpgrades() {
        return upgrades;
    }

    public VehicleStats getActualStats() {
        return upgrades.getActualStats();
    }

    public void updateVehicle() {
        if(isFunctional()) {
            updateMotion();
        }
        if (!this.isBeingRidden() && (!noAccelerationInput() || !noTurningInput() || !hasFuel() || !isFunctional())) {
            inputForward = false;
            inputBack = false;
            inputRight = false;
            inputLeft = false;
        }

        handleEntityCollisions();
        checkState();

        if (!world.isRemote) {
            VMNetworkManager.instance().sendToAllAround(new CPacketVehicleData(this), new TargetPoint(dimension, posX, posY, posZ, 256));
        }

        spawnParticles();
        move(MoverType.SELF, motionX, motionY, motionZ);

        double d0;
        if (collidedHorizontally && (d0 = getMovementSpeed(this)) > 0.2) {
            currentSpeed = 0f;
            health -= d0 * 200f;
            for (Entity e : this.getPassengers()) {
                if (!e.getIsInvulnerable()) {
                    e.attackEntityFrom(DamageSource.FALL, (float) d0 * 50f);
                }
            }
        }
    }

    public void updateMotion() {
        Vec3d lookVec = this.getLookVec();
        VehicleStats stats = this.getActualStats();
        float accModifier = this.health / stats.maxHealth < 0.25F ? this.health / stats.maxHealth : 1.0F;
        if (inputForward && !inputBack && (hasFuel() || currentSpeed < 0)) {
            float acceleration = stats.acceleration * accModifier;
            burnFuel();
            currentSpeed = currentSpeed < stats.maxSpeed ? currentSpeed + acceleration : stats.maxSpeed;
        }
        if (!inputForward && inputBack && (hasFuel() || currentSpeed > 0)) {
            burnFuel();
            currentSpeed = currentSpeed > 0 ? currentSpeed - stats.brakeSpeed : currentSpeed > (-stats.maxSpeed * 0.3f) ? currentSpeed - (stats.acceleration * accModifier) : -stats.maxSpeed * 0.3f;
        }

        if (inputRight && !inputLeft) {
            turnModifier = turnModifier < stats.maxTurningAngle ? turnModifier + stats.turnSpeed : stats.maxTurningAngle;
        }
        if (inputLeft && !inputRight) {
            turnModifier = turnModifier > -stats.maxTurningAngle ? turnModifier - stats.turnSpeed : -stats.maxTurningAngle;
        }

        if (noAccelerationInput() || !hasFuel()) {
            if (Math.abs(currentSpeed) < 0.01)
                currentSpeed = 0f;

            if (currentSpeed != 0) {
                currentSpeed = currentSpeed > 0 ? currentSpeed - stats.brakeSpeed * 0.1F : currentSpeed + stats.brakeSpeed * 0.1F;
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
    }

    public void checkState() {
        if (this.isInWater() || world.getBlockState(getPosition().up()).getMaterial().isLiquid()) {
            if(this.health > 0) {
                this.health -= 0.25;
            }
            motionX *= 0.4d;
            motionZ *= 0.4d;
            motionY = -0.15d;
        }

        if (isInLava() && isFunctional()) {
            health -= 10;
        }
        if(!world.isRemote && health < 0) {
            world.createExplosion(null, posX, posY, posZ, 4.0F, false);
            setDead();
        }
        currentState = this.getVehicleState();
    }

    @Override
    public void onUpdate() {
        updateVehicle();
        if (!onGround) {
            motionY -= 0.1d;
        }
        super.onUpdate();
        distanceTraveled += Math.sqrt(motionX * motionX + motionZ * motionZ) / 1000.0D;
        if(world.isRemote && prevState != currentState) {
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
            this.inputForward = forward;
            this.inputBack = back;
            this.inputRight = right;
            this.inputLeft = left;
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void applyOrientationToEntity(Entity entityToUpdate) {
        entityToUpdate.setRenderYawOffset(rotationYaw);
        float rotationP = MathHelper.wrapDegrees(entityToUpdate.rotationPitch - rotationPitch);
        float modifiedP = MathHelper.clamp(rotationP, -10.0F, 90.0F);
        entityToUpdate.prevRotationPitch += modifiedP - rotationP;
        entityToUpdate.rotationPitch += modifiedP - rotationP;
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
            if(canRepaint()) {
                ((ItemSprayCan)player.getHeldItemMainhand().getItem()).applyOnVehicle(this, world, player);
            } else {
                if(!player.world.isRemote) {
                    player.sendStatusMessage(new TextComponentString(TextFormatting.RED + "You cannot repaint this vehicle"), true);
                }
            }
        } else if(hasInventory() && !world.isRemote) {
            player.openGui(VehicleMod.instance, GuiHandler.VEHICLE, world, getEntityId(), 0, 0);
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
        buf.writeDouble(distanceTraveled);
        buf.writeInt(texture.ordinal());
        NBTTagCompound data = new NBTTagCompound();
        this.upgrades.writeToNBT(data);
        ByteBufUtils.writeTag(buf, data);
    }

    @Override
    public void readSpawnData(ByteBuf buf) {
        health = buf.readFloat();
        fuel = buf.readFloat();
        distanceTraveled = buf.readDouble();
        texture = VehicleTexture.values()[buf.readInt()];
        upgrades.readFromNBT(ByteBufUtils.readTag(buf));
    }

    public VehicleSoundPack getSoundPack() {
        return soundPack;
    }

    public SoundEvent getVehicleSound() {
        return currentState.getSound(soundPack);
    }

    public void refillFuel() {
        fuel += 25f;
        if (fuel > getActualStats().fuelCapacity) {
            fuel = getActualStats().fuelCapacity;
        }
    }

    public void repair(int amount) {
        this.health = this.health + amount > this.getActualStats().maxHealth ? this.getActualStats().maxHealth : this.health + amount;
    }

    public boolean isFunctional() {
        return health > 0;
    }

    @Override
    protected void addPassenger(Entity passenger) {
        if(this.getPassengers().isEmpty() && !isStarted && hasFuel() && isFunctional()) {
            world.playSound(null, posX, posY, posZ, this.soundPack.start(), SoundCategory.MASTER, 1.0F, 1.0F);
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
    protected void entityInit() {}

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

    public void setFuel() {
        fuel = 5.0F;
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
            if (health / getActualStats().maxHealth <= 0.5f) {
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
        compound.setFloat("health", this.health);
        compound.setFloat("fuel", this.fuel);
        compound.setFloat("speed", this.currentSpeed);
        compound.setInteger("textureid", this.texture.ordinal());
        compound.setDouble("traveledDist", this.distanceTraveled);
        if(hasInventory()) {
            NBTTagList invNBT = new NBTTagList();
            for(int i = 0; i < inventory.getSizeInventory(); i++) {
                ItemStack stack = inventory.getStackInSlot(i);
                if(!stack.isEmpty()) {
                    NBTTagCompound dataNBT = new NBTTagCompound();
                    NBTTagCompound itemStackNBT = new NBTTagCompound();
                    stack.writeToNBT(itemStackNBT);
                    dataNBT.setInteger("position", i);
                    dataNBT.setTag("stack", itemStackNBT);
                    invNBT.appendTag(dataNBT);
                }
            }
            compound.setTag("inventory", invNBT);
        }
        upgrades.writeToNBT(compound);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {
        health = compound.getFloat("health");
        fuel = compound.getFloat("fuel");
        currentSpeed = compound.getFloat("speed");
        texture = VehicleTexture.values()[compound.getInteger("textureid")];
        distanceTraveled = compound.getDouble("traveledDist");
        if(compound.hasKey("inventory")) {
            NBTTagList list = compound.getTagList("inventory", Constants.NBT.TAG_COMPOUND);
            for(int i = 0; i < list.tagCount(); i++) {
                NBTTagCompound itemStackNBT = list.getCompoundTagAt(i);
                int index = itemStackNBT.getInteger("position");
                ItemStack stack = new ItemStack(itemStackNBT.getCompoundTag("stack"));
                inventory.setInventorySlotContents(index, stack);
            }
        }
        upgrades.readFromNBT(compound);
    }

    @Override
    protected boolean canFitPassenger(Entity passenger) {
        return this.getPassengers().size() < maximumAmountOfPassengers();
    }

    private EnumVehicleState getVehicleState() {
        if(!hasFuel()) {
            return EnumVehicleState.IDLE;
        }
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
            if(e instanceof EntityVehicle) {
                double x = e.motionX - motionX;
                double z = e.motionZ - motionZ;
                double xz = Math.sqrt(x * x + z * z);
                float vehicleDamage = (float)(xz * 75F);
                float userDamage = (float)(xz * 35F);
                e.attackEntityFrom(DamageSource.FALL, vehicleDamage);
                for (Entity entity : e.getPassengers()) {
                    if(entity.getIsInvulnerable())
                        continue;
                    entity.attackEntityFrom(DamageSource.FALL, userDamage);
                }
                attackEntityFrom(DamageSource.FALL, vehicleDamage);
                for (Entity entity : getPassengers()) {
                    if(entity.getIsInvulnerable())
                        continue;
                    entity.attackEntityFrom(DamageSource.FALL, userDamage);
                }
                motionX = 0;
                motionY = 0;
                motionZ = 0;
                currentSpeed = -currentSpeed / 10;
            } else {
                e.motionX += motionX * currentSpeed * 3;
                e.motionY += currentSpeed;
                e.motionZ += motionZ * currentSpeed * 3;
                e.attackEntityFrom(DamageSource.FALL, Math.abs(currentSpeed) * 15f);
            }
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
        this.fuel = Math.max(0.0F, this.fuel - this.getActualStats().fuelConsumption);
    }

    private boolean isStandingStill() {
        return noAccelerationInput() && currentSpeed == prevSpeed;
    }

    private boolean isAccelerating() {
        return Math.abs(currentSpeed) > Math.abs(prevSpeed) || (currentSpeed > 0 ? inputForward : inputBack);
    }

    private boolean isBraking() {
        return Math.abs(currentSpeed) < Math.abs(prevSpeed) || (currentSpeed > 0 ? inputBack : inputForward);
    }

    private boolean hasReleasedGas() {
        return noAccelerationInput() && currentSpeed > 0;
    }

    public VehicleContainer getInventory() {
        return inventory;
    }

    public boolean canRepaint() {
        return true;
    }

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
    }

    public static class VehicleContainer extends InventoryBasic {

        public VehicleContainer(EntityVehicle vehicle, int slots) {
            super(vehicle.getDisplayName() + " container", false, slots);
        }
    }
}
