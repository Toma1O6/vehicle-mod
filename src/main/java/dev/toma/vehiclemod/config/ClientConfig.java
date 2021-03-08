package dev.toma.vehiclemod.config;

import net.minecraftforge.common.config.Config;

public class ClientConfig {

    @Config.Name("Force opaque colors")
    public boolean opaqueColors = false;

    @Config.Name("Checkpoint height")
    @Config.RangeDouble(min = 0.05, max = 40.0)
    public double checkpointHeight = 0.4;
}
