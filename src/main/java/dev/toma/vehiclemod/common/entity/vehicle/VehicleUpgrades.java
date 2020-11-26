package dev.toma.vehiclemod.common.entity.vehicle;

import dev.toma.vehiclemod.common.items.ItemPerk;
import dev.toma.vehiclemod.common.items.ItemVehicleUpgrade;
import dev.toma.vehiclemod.common.tunning.IStatApplicator;
import dev.toma.vehiclemod.common.tunning.StatPackage;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.util.DevUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class VehicleUpgrades {

    private final SortedMap<ItemVehicleUpgrade.Type, Integer> upgradeMap;
    private final ItemPerk[] perks = new ItemPerk[3];
    private final VehicleStats configStats;
    private VehicleStats modifiedStats;

    float health;
    float topSpeed;
    float acceleration;
    float braking;
    float handling;
    float fuelCons;
    float fuelCap;
    float nitroPower;

    public VehicleUpgrades(VehicleStats stats) {
        this(stats, new int[9]);
    }

    public VehicleUpgrades(VehicleStats stats, int[] defaults) {
        this.configStats = stats;
        this.setDefaults();
        this.upgradeMap = DevUtil.make(new TreeMap<>(Comparator.comparingInt(Enum::ordinal)), map -> {
            for (int i = 0; i < ItemVehicleUpgrade.Type.values().length; i++) {
                ItemVehicleUpgrade.Type type = ItemVehicleUpgrade.Type.values()[i];
                map.put(type, defaults[i]);
            }
        });
        recalculate();
    }

    public boolean canUpgradeWith(ItemVehicleUpgrade upgrade) {
        ItemVehicleUpgrade.Type type = upgrade.getType();
        int level = upgradeMap.get(type);
        int toSet = upgrade.getLevel();
        return toSet > level;
    }

    public void upgrade(ItemVehicleUpgrade upgrade, EntityPlayer player) {
        if(canUpgradeWith(upgrade)) {
            upgradeMap.put(upgrade.getType(), upgrade.getLevel());
        }
        EntityVehicle vehicle = null;
        if(player.getRidingEntity() instanceof EntityVehicle) {
            vehicle = (EntityVehicle) player.getRidingEntity();
        }
        float prevMaxHealth = getActualStats().maxHealth;
        float pct = vehicle != null ? vehicle.health / prevMaxHealth : 1.0F;
        recalculate();
        float actualMax = getActualStats().maxHealth;
        if(prevMaxHealth != actualMax && vehicle != null) {
            vehicle.health = actualMax * pct;
        }
    }

    private void recalculate() {
        setDefaults();
        for (ItemVehicleUpgrade.Type type : ItemVehicleUpgrade.Type.values()) {
            int level = upgradeMap.get(type);
            if(level <= 0)
                continue;
            StatPackage statPackage = type.getPackage();
            statPackage.forEachModifier(modifier -> {
                IStatApplicator applicator = modifier.getType().getApplicator();
                applicator.applyOnStat(this, modifier.getValues()[level - 1]);
            });
        }
        for (int i = 0; i < perks.length; i++) {
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
        this.modifiedStats = new VehicleStats(health, topSpeed, acceleration, braking, handling, configStats.maxTurningAngle, fuelCons, (int) fuelCap);
    }

    public VehicleStats getActualStats() {
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
        return perks[id];
    }

    public void setPerk(int id, ItemPerk perk) {
        perks[id] = perk;
        recalculate();
    }

    public boolean hasPerk(int id) {
        return getPerk(id) != null;
    }

    public void writeToNBT(NBTTagCompound nbt) {
        NBTTagList list = new NBTTagList();
        for (Map.Entry<ItemVehicleUpgrade.Type, Integer> entry : upgradeMap.entrySet()) {
            list.appendTag(new NBTTagInt(entry.getValue()));
        }
        nbt.setTag("upgrades", list);
        NBTTagList perks = new NBTTagList();
        for (int i = 0; i < this.perks.length; i++) {
            ItemPerk perk = this.perks[i];
            if(perk == null)
                continue;
            NBTTagCompound compound = new NBTTagCompound();
            compound.setByte("key", (byte) i);
            compound.setString("value", perk.getRegistryName().toString());
            perks.appendTag(compound);
        }
        nbt.setTag("perks", perks);
    }

    public void readFromNBT(NBTTagCompound compound) {
        if(compound.hasKey("upgrades", Constants.NBT.TAG_LIST)) {
            NBTTagList list = compound.getTagList("upgrades", Constants.NBT.TAG_INT);
            for (int i = 0; i < list.tagCount(); i++) {
                int v = list.getIntAt(i);
                upgradeMap.put(ItemVehicleUpgrade.Type.values()[i], v);
            }
        }
        if(compound.hasKey("perks", Constants.NBT.TAG_LIST)) {
            NBTTagList list = compound.getTagList("perks", Constants.NBT.TAG_COMPOUND);
            for (int i = 0; i < list.tagCount(); i++) {
                NBTTagCompound nbt = list.getCompoundTagAt(i);
                int index = nbt.getByte("key");
                ResourceLocation location = new ResourceLocation(nbt.getString("value"));
                Item item = ForgeRegistries.ITEMS.getValue(location);
                if(!(item instanceof ItemPerk))
                    continue;
                perks[index] = (ItemPerk) item;
            }
        }
        recalculate();
    }

    public Map<ItemVehicleUpgrade.Type, Integer> getUpgradeMap() {
        return upgradeMap;
    }

    public float getNitroPower() {
        return nitroPower;
    }

    private void setDefaults() {
        this.health = 1.0F;
        this.topSpeed = 1.0F;
        this.acceleration = 1.0F;
        this.braking = 1.0F;
        this.handling = 1.0F;
        this.fuelCons = 1.0F;
        this.fuelCap = 1.0F;
        this.nitroPower = 1.0F;
    }
}
