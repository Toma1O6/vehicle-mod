package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.inventory.InventoryUpgrades;
import dev.toma.vehiclemod.common.items.ItemPerk;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.common.tunning.IStatApplicator;
import dev.toma.vehiclemod.common.tunning.StatPackage;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.util.DevUtil;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.stream.Collectors;

public class VehicleUpgrades implements ISerializationListener {

    private final InventoryUpgrades inventory;
    private final VehicleProperties configStats;
    private VehicleProperties modifiedStats;

    float health;
    float topSpeed;
    float acceleration;
    float braking;
    float handling;
    float fuelCons;
    float fuelCap;
    float nitroPower;

    public VehicleUpgrades(EntityVehicle vehicle) {
        this(vehicle, 0);
    }

    public VehicleUpgrades(EntityVehicle vehicle, int defaultPartLevel) {
        this.inventory = new InventoryUpgrades(vehicle);
        this.configStats = vehicle.getConfigProperties();
        this.setDefaults();
        for (ItemVehicleUpgrade upgrade : ForgeRegistries.ITEMS.getValuesCollection().stream().filter(i -> i instanceof ItemVehicleUpgrade).map(i -> (ItemVehicleUpgrade) i).collect(Collectors.toList())) {
            for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
                if(upgrade.getType() == type && upgrade.getLevel() == defaultPartLevel) {
                    inventory.setInventorySlotContents(type.ordinal(), new ItemStack(upgrade));
                }
            }
        }
    }

    public int getLevel(ItemVehicleUpgrade.Type type) {
        ItemStack stack = inventory.getStackInSlot(type.ordinal());
        if(!stack.isEmpty() && stack.getItem() instanceof ItemVehicleUpgrade) {
            return ((ItemVehicleUpgrade) stack.getItem()).getLevel();
        }
        return -1;
    }

    public void recalculate() {
        setDefaults();
        EntityVehicle vehicle = inventory.getVehicle();
        float missingHealth = vehicle != null ? getActualStats().maxHealth - vehicle.getStats().getHealth() : 0.0F;
        for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
            int level = this.getLevel(type);
            if(level <= 0)
                continue;
            StatPackage statPackage = type.getPackage();
            statPackage.forEachModifier(modifier -> {
                IStatApplicator applicator = modifier.getType().getApplicator();
                applicator.applyOnStat(this, modifier.getValues()[level - 1]);
            });
        }
        for (int i = 0; i < 3; i++) {
            if(this.hasPerk(i)) {
                ItemPerk perk = this.getPerk(i);
                IStatApplicator applicator = perk.getModifierType().getApplicator();
                applicator.applyOnStat(this, perk.getValue());
            }
        }
        float health = configStats.maxHealth * this.health;
        float acceleration = configStats.acceleration * this.acceleration;
        float topSpeed = configStats.maxSpeed * this.topSpeed;
        float braking = configStats.brakeSpeed * this.braking;
        float handling = configStats.turnSpeed * this.handling;
        float fuelCons = configStats.fuelConsumption * (1.0F + (1.0F - this.fuelCons));
        float fuelCap = configStats.fuelCapacity * this.fuelCap;
        this.modifiedStats = new VehicleProperties(health, topSpeed, acceleration, braking, handling, configStats.maxTurningAngle, fuelCons, (int) fuelCap);
        if(vehicle != null) {
            vehicle.getStats().setHealth(Math.max(1.0F, getActualStats().maxHealth - missingHealth));
        }
    }

    public VehicleProperties getActualStats() {
        return modifiedStats != null ? modifiedStats : configStats;
    }

    public void addHealth(float toAdd) {
        this.health += toAdd;
    }

    public void addTopSpeed(float toAdd) {
        this.topSpeed += toAdd;
    }

    public void addAcceleration(float toAdd) {
        this.acceleration += toAdd;
    }

    public void addBraking(float toAdd) {
        this.braking += toAdd;
    }

    public void addHandling(float toAdd) {
        this.handling += toAdd;
    }

    public void addFuelCons(float toAdd) {
        this.fuelCons += toAdd;
    }

    public void addFuelCap(float toAdd) {
        this.fuelCap += toAdd;
    }

    public void addNitroPower(float toAdd) {
        this.nitroPower += toAdd;
    }

    public ItemPerk getPerk(int id) {
        ItemStack stack = inventory.getStackInSlot(9 + id);
        return stack.getItem() instanceof ItemPerk ? (ItemPerk) stack.getItem() : null;
    }

    public boolean hasPerk(int id) {
        return getPerk(id) != null;
    }

    public void writeToNBT(NBTTagCompound nbt) {
        NBTTagList upgrades = DevUtil.inventoryToNBT(inventory);
        nbt.setTag("upgrades", upgrades);
    }

    public void readFromNBT(NBTTagCompound compound) {
        if(compound.hasKey("upgrades", Constants.NBT.TAG_LIST)) {
            DevUtil.loadInventoryFromNBT(inventory, compound.getTagList("upgrades", Constants.NBT.TAG_COMPOUND));
        }
        recalculate();
    }

    public InventoryUpgrades getInventory() {
        return inventory;
    }

    public float getNitroPower() {
        return nitroPower;
    }

    @Override
    public void onNBTWrite(NBTTagCompound nbt) {
        NBTTagList inv = DevUtil.inventoryToNBT(inventory);
        nbt.setTag("upgrades", inv);
    }

    @Override
    public void onNBTRead(NBTTagCompound nbt) {
        if(nbt.hasKey("upgrades", Constants.NBT.TAG_LIST)) {
            DevUtil.loadInventoryFromNBT(inventory, nbt.getTagList("upgrades", Constants.NBT.TAG_COMPOUND));
        }
    }

    @Override
    public void onBytesWrite(ByteBuf buf) {
        NBTTagCompound data = new NBTTagCompound();
        onNBTWrite(data);
        ByteBufUtils.writeTag(buf, data);
    }

    @Override
    public void onBytesRead(ByteBuf buf) {
        NBTTagCompound data = ByteBufUtils.readTag(buf);
        onNBTRead(data);
    }

    private void setDefaults() {
        this.health = 1.0F;
        this.topSpeed = 1.0F;
        this.acceleration = 1.0F;
        this.braking = 1.0F;
        this.handling = 1.0F;
        this.fuelCons = 1.0F;
        this.fuelCap = 1.0F;
        this.nitroPower = 0.2F;
    }
}
