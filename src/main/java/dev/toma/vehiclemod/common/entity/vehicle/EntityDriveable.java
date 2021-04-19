package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.entity.vehicle.internals.IDriveable;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityDriveable extends Entity implements IDriveable {

    public static final byte FORWARD =      1;
    public static final byte BACKWARD =     1 << 1;
    public static final byte RIGHT =        1 << 2;
    public static final byte LEFT =         1 << 3;
    public static final byte HANDBRAKE =    1 << 4;
    private byte encodedInput;
    private double lerpX;
    private double lerpY;
    private double lerpZ;
    private double lerpYaw;
    private double lerpPitch;
    private int lerpSteps;

    public EntityDriveable(World world) {
        super(world);
        ignoreFrustumCheck = false;
    }

    protected abstract void moveForward();

    protected abstract void moveBack();

    protected abstract void moveRight();

    protected abstract void moveLeft();

    protected abstract void useHandbrake();

    public final boolean isTurning() {
        return isBitActive(RIGHT) || isBitActive(LEFT);
    }

    public final boolean isAnyInputActive() {
        return encodedInput != 0;
    }

    public final double getEntitySpeed() {
        return Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        tickLerp();
    }

    @Override
    public final void handleInputs(byte encodedInput) {
        this.encodedInput = encodedInput;
        if(isBitActive(FORWARD)) moveForward();
        if(isBitActive(BACKWARD)) moveBack();
        if(isBitActive(RIGHT)) moveRight();
        if(isBitActive(LEFT)) moveLeft();
        if(isBitActive(HANDBRAKE)) useHandbrake();
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
    protected void entityInit() {

    }

    protected void clearInput() {
        encodedInput = 0;
    }

    protected boolean isBitActive(byte bit) {
        return (encodedInput & bit) == bit;
    }

    private void tickLerp() {
        if (this.lerpSteps > 0 && !this.canPassengerSteer())
        {
            double d0 = this.posX + (this.lerpX - this.posX) / this.lerpSteps;
            double d1 = this.posY + (this.lerpY - this.posY) / this.lerpSteps;
            double d2 = this.posZ + (this.lerpZ - this.posZ) / this.lerpSteps;
            double d3 = MathHelper.wrapDegrees(this.lerpYaw - this.rotationYaw);
            this.rotationYaw = (float) (this.rotationYaw + d3 / (double)this.lerpSteps);
            this.rotationPitch = (float) (this.rotationPitch + (this.lerpPitch - this.rotationPitch) / this.lerpSteps);
            --this.lerpSteps;
            this.setPosition(d0, d1, d2);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        }
    }
}
