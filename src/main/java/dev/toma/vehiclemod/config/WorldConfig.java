package dev.toma.vehiclemod.config;

import net.minecraftforge.common.config.Config;

public class WorldConfig {

    @Config.Name("Vehicle spawn chance")
    @Config.Comment({"Enter value between 0-100", "Use 0 to disable spawning"})
    @Config.RangeDouble(min = 0.0, max = 100.0)
    public float vehicleSpawnChance = 0.7F;

    @Config.Name("Mechanic package spawn chance")
    @Config.Comment({"Enter value between 0-100", "Use 0 to disable spawning"})
    @Config.RangeInt(min = 0, max = 100)
    public int mechanicPackageSpawnChance = 9;

    @Config.Name("Tuner package spawn chance")
    @Config.Comment({"Enter value between 0-100", "Use 0 to disable spawning"})
    @Config.RangeInt(min = 0, max = 100)
    public int tunerPackageSpawnChance = 4;

    public float getVehicleSpawnChance() {
        return vehicleSpawnChance / 100.0F;
    }
}
