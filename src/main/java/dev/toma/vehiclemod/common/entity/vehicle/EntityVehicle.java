package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.entity.vehicle.internals.*;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketUpdateEntity;
import dev.toma.vehiclemod.network.packets.SPacketLockpickAttempt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class EntityVehicle extends EntityDriveable implements ILockpickable {

    private final LightController lightController;
    private final MoveController moveController;
    private final LockManager lockManager;
    private final VehicleUpgrades vehicleUpgrades;
    private final SoundController soundController;
    private EnumVehicleState actualState = EnumVehicleState.IDLE;
    private EnumVehicleState previousState = EnumVehicleState.IDLE;

    public EntityVehicle(World world) {
        super(world);
        this.lightController = new LightController();
        this.moveController = new MoveController();
        this.lockManager = new LockManager();
        this.soundController = new SoundController();
        this.vehicleUpgrades = createVehicleUpgrades();

        stepHeight = 1.25F;
        setSize();
    }

    public EntityVehicle(World world, BlockPos spawnPos) {
        this(world);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        moveController.applyOn(this);
        if(world.isRemote) {
            soundController.updateSounds(this);
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

    public void sync() {
        if(!world.isRemote) {
            VMNetworkManager.instance().sendToAllTracking(new CPacketUpdateEntity(this), this);
        }
    }

    public LightController getLightController() {
        return lightController;
    }

    public VehicleUpgrades getVehicleUpgrades() {
        return vehicleUpgrades;
    }

    public EnumVehicleState getActualState() {
        return actualState;
    }

    public boolean hasStateChanged() {
        return actualState != previousState;
    }

    protected VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this);
    }

    protected void setSize() {
        setSize(2.0F, 1.5F);
    }

    @Override
    protected final void moveForward() {
        moveController.moveForward(vehicleUpgrades);
    }

    @Override
    protected final void moveBack() {
        moveController.moveBack(vehicleUpgrades);
    }

    @Override
    protected final void moveRight() {
        moveController.moveRight(vehicleUpgrades);
    }

    @Override
    protected final void moveLeft() {
        moveController.moveLeft(vehicleUpgrades);
    }

    @Override
    protected final void useHandbrake() {
        moveController.useHandbrake();
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {

    }
}
