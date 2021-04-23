package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.entity.vehicle.internals.EnumVehicleState;
import dev.toma.vehiclemod.common.entity.vehicle.internals.IDriveable;
import dev.toma.vehiclemod.common.entity.vehicle.internals.ISerializationListener;
import dev.toma.vehiclemod.common.entity.vehicle.internals.LockManager;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketUpdateEntity;
import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import dev.toma.vehiclemod.util.EventHandler;
import dev.toma.vehiclemod.util.IEventHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public abstract class EntityDriveable extends Entity implements IDriveable, ILockpickable, IEntityAdditionalSpawnData {

    public static final byte FORWARD = 1;
    public static final byte BACKWARD = 1 << 1;
    public static final byte RIGHT = 1 << 2;
    public static final byte LEFT = 1 << 3;
    public static final byte HANDBRAKE = 1 << 4;
    protected final IEventHandler<ISerializationListener> serializationListenerEventHandler = new EventHandler<>();
    private final LockManager lockManager;
    private EnumVehicleState actualState = EnumVehicleState.IDLE;
    private EnumVehicleState previousState = EnumVehicleState.IDLE;
    private byte encodedInput;
    private double lerpX;
    private double lerpY;
    private double lerpZ;
    private double lerpYaw;
    private double lerpPitch;
    private int lerpSteps;
    private double lastMotionX;
    private double lastMotionZ;

    public EntityDriveable(World world) {
        super(world);
        ignoreFrustumCheck = false;
        lockManager = new LockManager();

        serializationListenerEventHandler.subscribe(lockManager);
    }

    public abstract boolean hasFuel();

    protected abstract void moveForward();

    protected abstract void moveBack();

    protected abstract void moveRight();

    protected abstract void moveLeft();

    protected abstract void useHandbrake();

    protected abstract void inputStateChanged(byte input, boolean state);

    protected abstract void tickDriveable();

    public final boolean isTurning() {
        return isBitActive(RIGHT) || isBitActive(LEFT);
    }

    public final boolean isAnyInputActive() {
        return encodedInput != 0;
    }

    public final double getEntitySpeed() {
        return Math.sqrt(motionX * motionX + motionZ * motionZ);
    }

    public final double getLastEntitySpeed() {
        return Math.sqrt(lastMotionX * lastMotionX + lastMotionZ * lastMotionZ);
    }

    public final boolean isStationary() {
        return motionX == 0 && motionZ == 0;
    }

    public final void sync() {
        if (!world.isRemote) {
            VMNetworkManager.instance().sendToAllTracking(new CPacketUpdateEntity(this), this);
        }
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
    protected final boolean canBeRidden(Entity entityIn) {
        return super.canBeRidden(entityIn) && lockManager.isUnlocked();
    }

    @Override
    public final boolean canBeCollidedWith() {
        return true;
    }

    @Override
    public final void onUpdate() {
        lastMotionX = motionX;
        lastMotionZ = motionZ;
        previousState = actualState;
        super.onUpdate();
        tickLerp();
        tickDriveable();
        actualState = updateState();
        move(MoverType.SELF, motionX, motionY, motionZ);
    }

    @Override
    public final void handleInputs(byte encodedInput) {
        boolean forward = isBitActive(FORWARD, encodedInput);
        boolean backward = isBitActive(BACKWARD, encodedInput);
        boolean right = isBitActive(RIGHT, encodedInput);
        boolean left = isBitActive(LEFT, encodedInput);
        boolean handbrake = isBitActive(HANDBRAKE, encodedInput);
        if(forward) moveForward();
        if(forward != isBitActive(FORWARD)) inputStateChanged(FORWARD, forward);
        if(backward) moveBack();
        if(backward != isBitActive(BACKWARD)) inputStateChanged(BACKWARD, backward);
        if(right) moveRight();
        if(right != isBitActive(RIGHT)) inputStateChanged(RIGHT, right);
        if(left) moveLeft();
        if(left != isBitActive(LEFT)) inputStateChanged(LEFT, left);
        if(handbrake) useHandbrake();
        if(handbrake != isBitActive(HANDBRAKE)) inputStateChanged(HANDBRAKE, handbrake);
        this.encodedInput = encodedInput;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public final byte encode(GameSettings fromSettings) {
        byte inputs = 0;
        inputs |= fromSettings.keyBindForward.isKeyDown() ? FORWARD : 0;
        inputs |= fromSettings.keyBindBack.isKeyDown() ? BACKWARD : 0;
        inputs |= fromSettings.keyBindRight.isKeyDown() ? RIGHT : 0;
        inputs |= fromSettings.keyBindLeft.isKeyDown() ? LEFT : 0;
        inputs |= fromSettings.keyBindJump.isKeyDown() ? HANDBRAKE : 0;
        return inputs;
    }

    @Override
    public final boolean shouldAcceptInputFrom(Entity entity) {
        return entity == getControllingPassenger();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport) {
        this.lerpX = x;
        this.lerpY = y;
        this.lerpZ = z;
        this.lerpYaw = yaw;
        this.lerpPitch = pitch;
        this.lerpSteps = 10;
    }

    @Override
    public Entity getControllingPassenger() {
        List<Entity> passengers = getPassengers();
        if(!passengers.isEmpty())
            return passengers.get(0);
        return null;
    }

    @Override
    public final void writeSpawnData(ByteBuf buffer) {
        serializationListenerEventHandler.invoke(listener -> listener.onBytesWrite(buffer));
    }

    @Override
    public final void readSpawnData(ByteBuf additionalData) {
        serializationListenerEventHandler.invoke(listener -> listener.onBytesRead(additionalData));
    }

    @Override
    protected final void playStepSound(BlockPos pos, Block blockIn) {
    }

    public LockManager getLockManager() {
        return lockManager;
    }

    public EnumVehicleState getActualState() {
        return actualState;
    }

    public boolean hasStateChanged() {
        return actualState != previousState;
    }

    public boolean isBitActive(byte bit) {
        return isBitActive(bit, encodedInput);
    }

    public boolean isBitActive(byte bit, byte bytes) {
        return (bytes & bit) == bit;
    }

    public void clearInput() {
        encodedInput = 0;
    }

    public boolean hasMovementInput() {
        return isBitActive(FORWARD) || isBitActive(BACKWARD);
    }

    @Override
    protected void entityInit() {

    }

    @Override
    protected final void readEntityFromNBT(NBTTagCompound compound) {
        serializationListenerEventHandler.invoke(listener -> listener.onNBTRead(compound));
    }

    @Override
    protected final void writeEntityToNBT(NBTTagCompound compound) {
        serializationListenerEventHandler.invoke(listener -> listener.onNBTWrite(compound));
    }

    protected boolean isAccelerating() {
        return (motionX != 0 || motionZ != 0) && (Math.abs(motionX) >= Math.abs(lastMotionX)) || (Math.abs(motionZ) >= Math.abs(lastMotionZ));
    }

    protected boolean isBraking() {
        return !isAccelerating() && isBitActive(BACKWARD);
    }

    private void tickLerp() {
        if (this.lerpSteps > 0 && !this.canPassengerSteer()) {
            double x = this.posX + (this.lerpX - this.posX) / this.lerpSteps;
            double y = this.posY + (this.lerpY - this.posY) / this.lerpSteps;
            double z = this.posZ + (this.lerpZ - this.posZ) / this.lerpSteps;
            double deltaYaw = MathHelper.wrapDegrees(this.lerpYaw - this.rotationYaw);
            this.rotationYaw = (float) (this.rotationYaw + deltaYaw / (double) this.lerpSteps);
            this.rotationPitch = (float) (this.rotationPitch + (this.lerpPitch - this.rotationPitch) / this.lerpSteps);
            --this.lerpSteps;
            this.setPosition(x, y, z);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        }
    }

    private EnumVehicleState updateState() {
        if (!hasFuel()) {
            return EnumVehicleState.IDLE;
        } else if (isAccelerating()) {
            return EnumVehicleState.ACCELERATING;
        } else if ((previousState == EnumVehicleState.ACCELERATING || previousState == EnumVehicleState.KEEPING_SPEED) && (motionX != 0 || motionZ != 0)) {
            return EnumVehicleState.KEEPING_SPEED;
        } else {
            return EnumVehicleState.BRAKING;
        }
    }
}
