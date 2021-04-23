package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.*;
import dev.toma.vehiclemod.common.items.IVehicleAction;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.util.GuiHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public abstract class EntityVehicle extends EntityDriveable {

    private final LightController lightController;
    private final MoveController moveController;
    private final VehicleUpgrades vehicleUpgrades;
    private final SoundController soundController;
    private final NitroHandler nitroHandler;
    private final NeonHandler neonHandler;
    private final VehicleContainer inventory;
    private final VehicleProperties properties;
    private final VehicleStats stats;
    private final VehicleStyle style;

    public EntityVehicle(World world) {
        super(world);
        this.lightController = new LightController();
        this.soundController = new SoundController();
        this.soundController.setPack(instantiateSoundPack(VehicleSoundPack.Builder.create()));
        this.properties = getPropertiesInstance(VMConfig.vehicleConfig);
        this.moveController = new MoveController();
        this.vehicleUpgrades = createVehicleUpgrades();
        this.nitroHandler = new NitroHandler(this);
        this.neonHandler = new NeonHandler(this);
        this.inventory = createInventory();
        this.stats = new VehicleStats(this::getProperties);
        this.style = instantiateStyle();

        stepHeight = 1.25F;
        setSize();

        serializationListenerEventHandler.subscribe(lightController);
        serializationListenerEventHandler.subscribe(vehicleUpgrades);
        serializationListenerEventHandler.subscribe(nitroHandler);
        serializationListenerEventHandler.subscribe(neonHandler);
        serializationListenerEventHandler.subscribe(inventory);
        serializationListenerEventHandler.subscribe(stats);
        serializationListenerEventHandler.subscribe(style);
    }

    public EntityVehicle(World world, BlockPos spawnPos) {
        this(world);
        setPosition(spawnPos.getX() + 0.5, spawnPos.getY() + 1, spawnPos.getZ() + 0.5);
    }

    public abstract EnumVehicleType getVehicleType();

    protected abstract VehicleProperties getPropertiesInstance(VehicleConfig config);

    protected abstract VehicleStyle instantiateStyle();

    protected abstract VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder);

    @Override
    public void tickDriveable() {
        moveController.applyOn(this);
        nitroHandler.tick(getControllingPassenger());
        stats.tick(this);
        if(world.isRemote) {
            soundController.updateSounds(this);
            style.doParticles(world, nitroHandler, posX, posY, posZ, stats.getHealth() / getProperties().maxHealth, stats.isStarted(), rotationYaw);
        }
    }

    @Override
    public final boolean hasFuel() {
        return stats.getFuel() > 0.0F;
    }

    public final LightController getLightController() {
        return lightController;
    }

    public final SoundController getSoundController() {
        return soundController;
    }

    public final NitroHandler getNitroHandler() {
        return nitroHandler;
    }

    public final NeonHandler getNeonHandler() {
        return neonHandler;
    }

    public final VehicleContainer getInventory() {
        return inventory;
    }

    public final VehicleUpgrades getVehicleUpgrades() {
        return vehicleUpgrades;
    }

    public final VehicleProperties getConfigProperties() {
        return properties;
    }

    public final VehicleStats getStats() {
        return stats;
    }

    public final VehicleProperties getProperties() {
        return vehicleUpgrades.getActualStats();
    }

    public VehicleStyle getStyle() {
        return style;
    }

    @Override
    public final double getMountedYOffset() {
        return style.getPassengerY();
    }

    @Override
    public final void updatePassenger(Entity passenger) {
        if(isPassenger(passenger)) {
            int passengerIndex = getPassengers().indexOf(passenger);
            double x = style.getPassengerX(passengerIndex);
            double z = style.getPassengerZ(passengerIndex);
            Vec3d vec = new Vec3d(x, 0, z).rotateYaw(-rotationYaw * VehicleStyle.PI_D_180 - VehicleStyle.HALF_PI);
            passenger.setPosition(posX + vec.x, posY + getMountedYOffset() + passenger.getYOffset(), posZ + vec.z);
        }
    }

    @Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);
        if(!player.isSneaking()) {
            if(!world.isRemote && canFitPassenger(player) && player.getRidingEntity() == null) {
                if(canBeRidden(player)) {
                    player.startRiding(this);
                    return true;
                } else {
                    player.sendStatusMessage(new TextComponentString("This vehicle is locked"), true);
                }
            }
        } else if(stack.getItem() instanceof IVehicleAction) {
            ((IVehicleAction) stack.getItem()).apply(player, world, stack, this);
            return true;
        } else if(inventory != null && !world.isRemote && getLockManager().isUnlocked()) {
            player.openGui(VehicleMod.instance, GuiHandler.VEHICLE, world, getEntityId(), 0, 0);
            return true;
        }
        return false;
    }

    @Override
    protected boolean canFitPassenger(Entity passenger) {
        return style.canFitPassenger(getPassengers().size());
    }

    @Override
    protected void removePassenger(Entity passenger) {
        super.removePassenger(passenger);
        if(getPassengers().size() == 0) {
            stats.setStarted(false);
        }
    }

    protected VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this);
    }

    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 9);
    }

    protected void setSize() {
        setSize(2.0F, 1.5F);
    }

    @Override
    protected final void moveForward() {
        moveController.moveForward(vehicleUpgrades, motionX, motionZ);
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
    protected void inputStateChanged(byte input, boolean state) {
        moveController.inputChanged(input, state);
    }
}
