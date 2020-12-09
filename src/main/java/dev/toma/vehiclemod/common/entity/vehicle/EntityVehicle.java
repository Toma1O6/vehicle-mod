package dev.toma.vehiclemod.common.entity.vehicle;

import com.google.common.base.Predicate;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.CarHonkSound;
import dev.toma.vehiclemod.client.CarSound;
import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.items.IVehicleAction;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketUpdateEntity;
import dev.toma.vehiclemod.network.packets.CPacketVehicleData;
import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import dev.toma.vehiclemod.util.GuiHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.vecmath.Vector3f;
import java.util.List;
import java.util.Random;

@SuppressWarnings("Guava")
public abstract class EntityVehicle extends Entity implements IEntityAdditionalSpawnData, ILockpickable {

    private static final Predicate<Entity> TARGET = entity -> EntitySelectors.NOT_SPECTATING.apply(entity) && EntitySelectors.IS_ALIVE.apply(entity) && entity.canBeCollidedWith();

    public float health;
    public float currentSpeed, prevSpeed;
    public float turnModifier;
    public float fuel;
    public EnumVehicleState currentState;
    public EnumVehicleState prevState;
    public final LockManager lockManager;
    public final LightController lightController;
    public boolean ecoMode;
    protected VehicleContainer inventory = this.createInvetory();
    protected VehicleSoundPack soundPack;
    protected VehicleUpgrades upgrades;
    protected NitroHandler nitroHandler;
    protected VehicleTexture texture;
    private double distanceTraveled = 0;
    private boolean isStarted = false;
    private int startCooldown;
    @SideOnly(Side.CLIENT)
    public CarSound currentSound;
    @SideOnly(Side.CLIENT)
    public CarHonkSound honkSound;
    protected boolean inputForward;
    protected boolean inputBack;
    protected boolean inputRight;
    protected boolean inputLeft;

    public static double getMovementSpeed(EntityVehicle vehicle) {
        return Math.sqrt(vehicle.motionX * vehicle.motionX + vehicle.motionZ * vehicle.motionZ);
    }

    public static int[] fill(int l, int v) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++)
            arr[i] = v;
        return arr;
    }

    public EntityVehicle(World world) {
        super(world);
        setSize(2f, 1.5f);
        stepHeight = 1f;
        preventEntitySpawning = true;
        this.upgrades = this.createVehicleUpgrades();
        this.nitroHandler = new NitroHandler(this);
        texture = getBaseTexture();
        this.health = this.upgrades.getActualStats().maxHealth;
        this.setFuel();
        ignoreFrustumCheck = true;
        this.soundPack = createSoundPack();
        this.lockManager = new LockManager(EnumCarLockType.IRON);
        this.lightController = new LightController();
    }

    public EntityVehicle(World world, BlockPos pos) {
        this(world);
        setPosition(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
    }

    public abstract EnumVehicleType getVehicleType();

    public abstract VehicleStats getConfigStats();

    public abstract int maximumAmountOfPassengers();

    public abstract VehicleSoundPack createSoundPack();

    public abstract VehicleContainer createInvetory();

    public abstract PositionManager getVehiclePositions();

    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this.getConfigStats());
    }

    private void updateVehicle() {
        updateMotion();
        if (!this.isBeingRidden() && (!noAccelerationInput() || !noTurningInput() || !hasFuel() || !isStarted())) {
            inputForward = false;
            inputBack = false;
            inputRight = false;
            inputLeft = false;
        }
        if (startCooldown > 0 && --startCooldown == 0) {
            this.attemptStart();
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
            health -= d0 * 50f;
            for (Entity e : this.getPassengers()) {
                if (!e.getIsInvulnerable()) {
                    e.attackEntityFrom(DamageSource.FALL, (float) d0 * 25f);
                }
            }
        }
    }

    private void updateMotion() {
        Vec3d lookVec = this.getLookVec();
        VehicleStats stats = this.getActualStats();
        Entity controller = this.getControllingPassenger();
        this.nitroHandler.tick(controller);
        float healthpct = health / stats.maxHealth;
        float quarterHealth = stats.maxHealth / 4f;
        float accModifier = healthpct < 0.25F ? this.health / quarterHealth : 1.0F;
        float mod = nitroHandler.isNitroActive() ? upgrades.getNitroPower() : 0.0F;
        if (inputForward && !inputBack && (hasFuel() || currentSpeed < 0)) {
            mod += Math.max(0.04F, Math.abs(1.0F - currentSpeed / stats.maxSpeed));
            float acceleration = mod * stats.acceleration * accModifier;
            float maxSpeed = stats.maxSpeed;
            if (ecoMode) {
                maxSpeed *= 0.75F;
                acceleration *= 0.4F;
            }
            burnFuel();
            currentSpeed = currentSpeed < maxSpeed ? Math.min(maxSpeed, currentSpeed + acceleration) : currentSpeed > maxSpeed ? Math.max(currentSpeed - stats.acceleration * mod * 2, maxSpeed) : maxSpeed;
        }
        if (!inputForward && inputBack && (hasFuel() || currentSpeed > 0)) {
            burnFuel();
            float speed = world.isRainingAt(this.getPosition()) ? stats.brakeSpeed * 0.5F : stats.brakeSpeed;
            currentSpeed = currentSpeed > 0 ? currentSpeed - speed : currentSpeed > (-stats.maxSpeed * 0.3f) ? currentSpeed - (stats.acceleration * accModifier) : -stats.maxSpeed * 0.3f;
        }

        if (inputRight && !inputLeft) {
            turnModifier = turnModifier < stats.maxTurningAngle ? turnModifier < 0 ? turnModifier + stats.turnSpeed + 0.5F : turnModifier + stats.turnSpeed : stats.maxTurningAngle;
        }
        if (inputLeft && !inputRight) {
            turnModifier = turnModifier > -stats.maxTurningAngle ? turnModifier > 0 ? turnModifier - stats.turnSpeed - 0.5F : turnModifier - stats.turnSpeed : -stats.maxTurningAngle;
        }

        if (noAccelerationInput() || !hasFuel()) {
            if (Math.abs(currentSpeed) < 0.01)
                currentSpeed = 0f;

            if (currentSpeed != 0) {
                currentSpeed = currentSpeed > 0 ? currentSpeed - stats.brakeSpeed * 0.1F : currentSpeed + stats.brakeSpeed * 0.1F;
            }
        }

        if (noTurningInput()) {
            if (Math.abs(turnModifier) <= 0.5f)
                turnModifier = 0f;

            if (turnModifier != 0) {
                turnModifier = turnModifier > 0 ? turnModifier - 0.5f : turnModifier + 0.5f;
            }
        }

        motionX = lookVec.x * currentSpeed;
        motionZ = lookVec.z * currentSpeed;

        if (currentSpeed != 0) {
            rotationYaw += currentSpeed > 0 ? turnModifier : -turnModifier;
        }
    }

    private void checkState() {
        if (this.isInWater() || world.getBlockState(getPosition().up()).getMaterial().isLiquid()) {
            if (this.health > 0) {
                this.health -= 0.25;
            }
            motionX *= 0.4d;
            motionZ *= 0.4d;
            motionY = -0.15d;
        }

        if (isInLava()) {
            health -= 10;
        }
        if (!world.isRemote && health < 0) {
            world.createExplosion(null, posX, posY, posZ, 4.0F, false);
            setDead();
        }
        currentState = this.getVehicleState();
    }

    private void vehicleStateChanged() {
        VehicleMod.proxy.playSoundAt(this);
    }

    public void updateInput(boolean forward, boolean back, boolean right, boolean left, EntityPlayer player) {
        if (isStarted) {
            this.rotationYaw = rotationYaw < 0f ? rotationYaw + 360f : rotationYaw > 360f ? rotationYaw - 360f : rotationYaw;
            this.inputForward = forward;
            this.inputBack = back;
            this.inputRight = right;
            this.inputLeft = left;
        }
    }

    public VehicleTexture getTexture() {
        return texture;
    }

    public void setTexture(VehicleTexture texture) {
        this.texture = texture;
    }

    public VehicleTexture getBaseTexture() {
        return VehicleTexture.values()[world.rand.nextInt(16)];
    }

    public boolean hasInventory() {
        return inventory != null;
    }

    public VehicleUpgrades getUpgrades() {
        return upgrades;
    }

    public NitroHandler getNitroHandler() {
        return nitroHandler;
    }

    public VehicleStats getActualStats() {
        return upgrades.getActualStats();
    }

    public VehicleSoundPack getSoundPack() {
        return soundPack;
    }

    public SoundEvent getVehicleSound() {
        return currentState.getSound(soundPack);
    }

    public void refillFuel() {
        this.fuel = Math.min(this.getActualStats().fuelCapacity, fuel + 10);
    }

    public void repair(int amount) {
        this.health = this.health + amount > this.getActualStats().maxHealth ? this.getActualStats().maxHealth : this.health + amount;
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

    private void spawnParticles() {
        if (world.isRemote) {
            float health = this.health / this.getActualStats().maxHealth;
            this.getVehiclePositions().tickParticles(world, health, isStarted && fuel > 0, nitroHandler.isNitroActive(), posX, posY, posZ, rotationYaw);
        }
    }

    private EnumVehicleState getVehicleState() {
        if (!hasFuel()) {
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
            if (e instanceof EntityVehicle) {
                double x = e.motionX - motionX;
                double z = e.motionZ - motionZ;
                double xz = Math.sqrt(x * x + z * z);
                float vehicleDamage = (float) (xz * 150F);
                float userDamage = (float) (xz * 60F);
                e.attackEntityFrom(DamageSource.FALL, vehicleDamage);
                for (Entity entity : e.getPassengers()) {
                    if (entity.getIsInvulnerable())
                        continue;
                    entity.attackEntityFrom(DamageSource.FALL, userDamage);
                }
                attackEntityFrom(DamageSource.FALL, vehicleDamage);
                for (Entity entity : getPassengers()) {
                    if (entity.getIsInvulnerable())
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
        float base = this.getActualStats().fuelConsumption;
        float toBurn = ecoMode ? base * 0.5F : base;
        this.fuel = Math.max(0.0F, this.fuel - toBurn);
    }

    private boolean isStandingStill() {
        return noAccelerationInput() && currentSpeed == prevSpeed;
    }

    private boolean isAccelerating() {
        return Math.abs(currentSpeed) > Math.abs(prevSpeed) || (currentSpeed > 0 ? inputForward : inputBack);
    }

    private boolean isBraking() {
        return Math.abs(currentSpeed) < Math.abs(prevSpeed) && (currentSpeed > 0 ? inputBack : inputForward);
    }

    private boolean hasReleasedGas() {
        return noAccelerationInput() && currentSpeed > 0;
    }

    public VehicleContainer getInventory() {
        return inventory;
    }

    public boolean canRepaint(VehicleTexture texture) {
        return true;
    }

    public void sync() {
        if (!world.isRemote) {
            VMNetworkManager.instance().sendToAllTracking(new CPacketUpdateEntity(this), this);
        }
    }

    private void attemptStart() {
        if (!world.isRemote && this.hasFuel() && rand.nextFloat() <= MathHelper.clamp(health / getActualStats().maxHealth, 0.05F, 0.95F)) {
            isStarted = true;
            WorldServer server = (WorldServer) world;
            for (EntityPlayerMP playerMP : server.getPlayers(EntityPlayerMP.class, p -> p.dimension == dimension)) {
                playerMP.connection.sendPacket(new SPacketSoundEffect(soundPack.start(), SoundCategory.MASTER, posX, posY, posZ, 1.0F, 1.0F));
            }
            sync();
        }
    }

    public void initiateStart() {
        if (!isStarted && startCooldown == 0) {
            this.startCooldown = 22;
            world.playSound(null, posX, posY, posZ, this.soundPack.starting(), SoundCategory.MASTER, 1.0F, 1.0F);
        }
    }

    public int getStartCooldown() {
        return startCooldown;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public boolean isEcoMode() {
        return ecoMode;
    }

    public void setEcoMode(boolean ecoMode) {
        this.ecoMode = ecoMode;
    }

    @Override
    public int[] getCombinations() {
        return lockManager.getCombinations();
    }

    @Override
    public boolean shouldBreakLockpick(Random random) {
        return random.nextFloat() < 0.4F;
    }

    @Override
    public void handleUnlock(EntityPlayer player, World world) {
        lockManager.handleUnlock();
        sync();
    }

    @Override
    public SPacketLockpickAttempt createLockpickPacket(int index, int offset) {
        return SPacketLockpickAttempt.lockpickVehicle(index, offset, getEntityId());
    }

    @Override
    public void onUpdate() {
        updateVehicle();
        if (!onGround) {
            motionY -= 0.1d;
        }
        super.onUpdate();
        distanceTraveled += Math.sqrt(motionX * motionX + motionZ * motionZ) / 1000.0D;
        if (world.isRemote && prevState != currentState) {
            this.vehicleStateChanged();
        }
        prevSpeed = currentSpeed;
        prevState = currentState;
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
        ItemStack stack = player.getHeldItem(hand);
        if (!player.isSneaking()) {
            if (!world.isRemote) {
                if (canFitPassenger(player) && player.getRidingEntity() == null) {
                    if (canBeRidden(player)) {
                        player.startRiding(this);
                        return true;
                    } else {
                        player.sendStatusMessage(new TextComponentString("This vehicle is locked"), true);
                    }
                }
            }
        } else if (stack.getItem() instanceof IVehicleAction) {
            ((IVehicleAction) stack.getItem()).apply(player, world, stack, this);
            return true;
        } else if (hasInventory() && !world.isRemote && lockManager.isUnlocked()) {
            player.openGui(VehicleMod.instance, GuiHandler.VEHICLE, world, getEntityId(), 0, 0);
        }
        return false;
    }

    @Override
    protected boolean canBeRidden(Entity entityIn) {
        return super.canBeRidden(entityIn) && lockManager.isUnlocked();
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
        buf.writeBoolean(ecoMode);
        buf.writeBoolean(isStarted);
        buf.writeInt(startCooldown);
        NBTTagCompound data = new NBTTagCompound();
        this.upgrades.writeToNBT(data);
        ByteBufUtils.writeTag(buf, data);
        NBTTagCompound lock = lockManager.serializeNBT();
        ByteBufUtils.writeTag(buf, lock);
        NBTTagCompound lights = lightController.serializeNBT();
        ByteBufUtils.writeTag(buf, lights);
    }

    @Override
    public void readSpawnData(ByteBuf buf) {
        health = buf.readFloat();
        fuel = buf.readFloat();
        distanceTraveled = buf.readDouble();
        texture = VehicleTexture.values()[buf.readInt()];
        ecoMode = buf.readBoolean();
        isStarted = buf.readBoolean();
        startCooldown = buf.readInt();
        upgrades.readFromNBT(ByteBufUtils.readTag(buf));
        lockManager.deserializeNBT(ByteBufUtils.readTag(buf));
        lightController.deserializeNBT(ByteBufUtils.readTag(buf));
    }

    @Override
    protected void removePassenger(Entity passenger) {
        super.removePassenger(passenger);
        if (this.getPassengers().size() == 0) {
            this.isStarted = false;
        }
    }

    @Override
    protected void entityInit() {
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

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {
        compound.setFloat("health", this.health);
        compound.setFloat("fuel", this.fuel);
        compound.setFloat("speed", this.currentSpeed);
        compound.setInteger("textureid", this.texture.ordinal());
        compound.setBoolean("ecoMode", ecoMode);
        compound.setBoolean("started", isStarted);
        compound.setInteger("startCooldown", startCooldown);
        compound.setDouble("traveledDist", this.distanceTraveled);
        if (hasInventory()) {
            NBTTagList invNBT = new NBTTagList();
            for (int i = 0; i < inventory.getSizeInventory(); i++) {
                ItemStack stack = inventory.getStackInSlot(i);
                if (!stack.isEmpty()) {
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
        compound.setTag("lock", lockManager.serializeNBT());
        upgrades.writeToNBT(compound);
        compound.setTag("lightController", lightController.serializeNBT());
        compound.setTag("nitro", nitroHandler.serializeNBT());
        this.writeExtraData(compound);
    }

    protected void writeExtraData(NBTTagCompound compound) {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {
        health = compound.getFloat("health");
        fuel = compound.getFloat("fuel");
        currentSpeed = compound.getFloat("speed");
        texture = VehicleTexture.values()[compound.getInteger("textureid")];
        ecoMode = compound.getBoolean("ecoMode");
        isStarted = compound.getBoolean("started");
        startCooldown = compound.getInteger("startCooldown");
        distanceTraveled = compound.getDouble("traveledDist");
        if (compound.hasKey("inventory")) {
            NBTTagList list = compound.getTagList("inventory", Constants.NBT.TAG_COMPOUND);
            for (int i = 0; i < list.tagCount(); i++) {
                NBTTagCompound itemStackNBT = list.getCompoundTagAt(i);
                int index = itemStackNBT.getInteger("position");
                ItemStack stack = new ItemStack(itemStackNBT.getCompoundTag("stack"));
                inventory.setInventorySlotContents(index, stack);
            }
        }
        lockManager.deserializeNBT(compound.hasKey("lock", Constants.NBT.TAG_COMPOUND) ? compound.getCompoundTag("lock") : new NBTTagCompound());
        upgrades.readFromNBT(compound);
        lightController.deserializeNBT(compound.hasKey("lightController", Constants.NBT.TAG_COMPOUND) ? compound.getCompoundTag("lightController") : new NBTTagCompound());
        nitroHandler.deserializeNBT(compound.hasKey("nitro", Constants.NBT.TAG_LIST) ? compound.getTagList("nitro", Constants.NBT.TAG_COMPOUND) : new NBTTagList());
        this.readExtraData(compound);
    }

    protected void readExtraData(NBTTagCompound compound) {

    }

    @Override
    protected boolean canFitPassenger(Entity passenger) {
        return this.getPassengers().size() < maximumAmountOfPassengers();
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
