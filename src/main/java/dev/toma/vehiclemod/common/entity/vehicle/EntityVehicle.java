package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.entity.vehicle.internals.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityVehicle extends EntityDriveable {

    private final LightController lightController;
    private final MoveController moveController;
    private final VehicleUpgrades vehicleUpgrades;
    private final SoundController soundController;
    private final NitroHandler nitroHandler;
    private final VehicleContainer inventory;

    public EntityVehicle(World world) {
        super(world);
        this.lightController = new LightController();
        this.moveController = new MoveController();
        this.soundController = new SoundController();
        this.vehicleUpgrades = createVehicleUpgrades();
        this.nitroHandler = new NitroHandler(this);
        this.inventory = createInventory();

        stepHeight = 1.25F;
        setSize();
    }

    public EntityVehicle(World world, BlockPos spawnPos) {
        this(world);
    }

    @Override
    public void tickDriveable() {
        moveController.applyOn(this);
        if(world.isRemote) {
            soundController.updateSounds(this);
        }
    }

    public LightController getLightController() {
        return lightController;
    }

    public SoundController getSoundController() {
        return soundController;
    }

    public NitroHandler getNitroHandler() {
        return nitroHandler;
    }

    public VehicleContainer getInventory() {
        return inventory;
    }

    public VehicleUpgrades getVehicleUpgrades() {
        return vehicleUpgrades;
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
}
