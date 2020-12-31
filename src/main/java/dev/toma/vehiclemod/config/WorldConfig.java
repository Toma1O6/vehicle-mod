package dev.toma.vehiclemod.config;

import net.minecraftforge.common.config.Config;

public class WorldConfig {

    @Config.Name("Vehicle spawn chance")
    @Config.Comment({"Enter value between 0-100", "Use 0 to disable spawning"})
    @Config.RangeDouble(min = 0.0, max = 100.0)
    public float vehicleSpawnChance = 0.7F;

    @Config.Name("Mechanic package spawn chance")
    @Config.Comment({"Enter value between 0-100", "Use 0 to disable spawning"})
    @Config.RangeDouble(min = 0.0, max = 100.0)
    public float mechanicPackageSpawnChance = 8.0F;

    @Config.Name("Tuner package spawn chance")
    @Config.Comment({"Enter value between 0-100", "Use 0 to disable spawning"})
    @Config.RangeDouble(min = 0.0, max = 100.0)
    public float tunerPackageSpawnChance = 4.0F;

    public float getVehicleSpawnChance() {
        return vehicleSpawnChance / 100.0F;
    }

    public float getMechanicPackageSpawnChance() {
        return mechanicPackageSpawnChance / 100.0F;
    }

    public float getTunerPackageSpawnChance() {
        return tunerPackageSpawnChance / 100.0F;
    }
}
