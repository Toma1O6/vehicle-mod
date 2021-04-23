package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.config.VehicleProperties;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.Constants;

import java.util.function.Supplier;

public final class VehicleStats implements ISerializationListener {

    private float health;
    private float fuel;
    private boolean ecoMode;
    private boolean started;
    private int startCooldown;
    /**
     * Travelled distance in cm
     */
    private long distanceTravelled;
    private Supplier<VehicleProperties> propertiesSupplier;

    public VehicleStats(Supplier<VehicleProperties> propertiesSupplier) {
        VehicleProperties properties = propertiesSupplier.get();
        this.health = properties.maxHealth;
        this.fuel = properties.fuelCapacity;
    }

    public void tick(EntityVehicle vehicle) {
        processStarting(vehicle);
        double dx = Math.abs(vehicle.posX - vehicle.lastTickPosX);
        double dz = Math.abs(vehicle.posZ - vehicle.lastTickPosZ);
        if(dx != 0.0 || dz != 0.0) {
            double sqrt = Math.sqrt(dx * dx + dz * dz);
            distanceTravelled += (long) (sqrt * 100L);
        }
    }

    public boolean areComponentsValid(VehicleUpgrades upgrades) {
        for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
            if (upgrades.getLevel(type) < 0) {
                return false;
            }
        }
        return true;
    }

    public float getHealth() {
        return health;
    }

    public float getFuel() {
        return fuel;
    }

    public boolean isEcoModeActive() {
        return ecoMode;
    }

    public boolean isStarted() {
        return started;
    }

    public int getStartCooldown() {
        return startCooldown;
    }

    public double getDistanceTravelled() {
        return distanceTravelled / 1000.0;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void addHealth(float amount) {
        this.health = Math.min(propertiesSupplier.get().maxHealth, health + amount);
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public void addFuel(int amount) {
        this.fuel = Math.min(propertiesSupplier.get().fuelCapacity, fuel + amount);
    }

    public void setEcoMode(boolean ecoMode) {
        this.ecoMode = ecoMode;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    @Override
    public void onNBTWrite(NBTTagCompound nbt) {
        NBTTagCompound data = new NBTTagCompound();
        data.setFloat("health", health);
        data.setFloat("fuel", fuel);
        data.setBoolean("eco", ecoMode);
        data.setBoolean("started", started);
        data.setLong("distance", distanceTravelled);
        data.setInteger("cooldown", startCooldown);
        nbt.setTag("stats", data);
    }

    @Override
    public void onNBTRead(NBTTagCompound nbt) {
        if(nbt.hasKey("stats", Constants.NBT.TAG_COMPOUND)) {
            NBTTagCompound data = nbt.getCompoundTag("stats");
            health = data.getFloat("health");
            fuel = data.getFloat("fuel");
            ecoMode = data.getBoolean("eco");
            started = data.getBoolean("started");
            distanceTravelled = data.getLong("distance");
            startCooldown = data.getInteger("cooldown");
        }
    }

    @Override
    public void onBytesWrite(ByteBuf buf) {
        buf.writeFloat(health);
        buf.writeFloat(fuel);
        buf.writeBoolean(ecoMode);
        buf.writeBoolean(started);
        buf.writeLong(distanceTravelled);
        buf.writeInt(startCooldown);
    }

    @Override
    public void onBytesRead(ByteBuf buf) {
        health = buf.readFloat();
        fuel = buf.readFloat();
        ecoMode = buf.readBoolean();
        started = buf.readBoolean();
        distanceTravelled = buf.readLong();
        startCooldown = buf.readInt();
    }

    public void initiateStart(World world, VehicleUpgrades upgrades, double posX, double posY, double posZ, VehicleSoundPack pack) {
        if(!started && startCooldown == 0 && areComponentsValid(upgrades) && health > 0) {
            startCooldown = 22;
            world.playSound(null, posX, posY, posZ, pack.starting(), SoundCategory.MASTER, 1.0F, 1.0F);
        }
    }

    private void processStarting(EntityVehicle vehicle) {
        if (!started) {
            if (startCooldown > 0 && --startCooldown == 0) {
                tryStart(vehicle);
            }
        }
    }

    private void tryStart(EntityVehicle vehicle) {
        if (!vehicle.world.isRemote && fuel > 0) {
            float f0 = vehicle.world.rand.nextFloat();
            float f1 = health > 0 ? MathHelper.clamp(health / vehicle.getProperties().maxHealth, 0.05F, 0.95F) : 0.0F;
            if (f0 <= f1) {
                closeDriverInventory(vehicle.getControllingPassenger());
            }
            if (areComponentsValid(vehicle.getVehicleUpgrades())) {
                setStarted(true);
                WorldServer server = (WorldServer) vehicle.world;
                SoundEvent startSound = vehicle.getSoundController().getPack().start();
                for (EntityPlayerMP player : server.getPlayers(EntityPlayerMP.class, p -> p.dimension == vehicle.dimension)) {
                    player.connection.sendPacket(new SPacketSoundEffect(startSound, SoundCategory.MASTER, vehicle.posX, vehicle.posY, vehicle.posZ, 1.0F, 1.0F));
                }
                vehicle.sync();
            }
        }
    }

    private void closeDriverInventory(Entity driver) {
        if (driver instanceof EntityPlayer) {
            ((EntityPlayer) driver).closeScreen();
        }
    }
}
