package dev.toma.vehiclemod.config;

import net.minecraftforge.common.config.Config;

public class VehicleConfig {
    @Config.Name("Beamer S120")
    public VehicleStats beamer_s120 = new VehicleStats(250F, 1.23F, 0.006F, 0.017F, 0.15F, 3.6F, 0.0033f, 50, new VehicleStats.Vector3i(0, 0, -1)).track();
    @Config.Name("Fedoratti Vulcan")
    public VehicleStats fedoratti_vulcan = new VehicleStats(220F, 1.72F, 0.0079F, 0.023F, 0.25F, 3.9F, 0.0062F, 70, new VehicleStats.Vector3i(0, 0, -1)).track();
    @Config.Name("Tracer T1")
    public VehicleStats tracer_t1 = new VehicleStats(250F, 1.29F, 0.0076F, 0.015F, 0.16F, 3.6F, 0.004F, 50).track();
    @Config.Name("Sputnik 2000L")
    public VehicleStats sputnik2000L = new VehicleStats(200F, 1.12F, 0.0049F, 0.015F, 0.13F, 3.6F, 0.004F, 30).track();
    @Config.Name("Beamer S320 RS")
    public VehicleStats beamers320rs = new VehicleStats(250F, 1.39F, 0.0072F, 0.022F, 0.3F, 4.3F, 0.0044f, 50, new VehicleStats.Vector3i(0, 0, -1)).track();
    @Config.Name("MCG MultiVan")
    public VehicleStats mcgMultiVan = new VehicleStats(400F, 1.07F, 0.004F, 0.014F, 0.12F, 3.4F, 0.0069f, 120, new VehicleStats.Vector3i(0, 0, -3)).track();
    @Config.Name("Beamer Pickup")
    public VehicleStats beamerPickup = new VehicleStats(280F, 0.8F, 0.0035F, 0.012F, 0.1F, 3.2F, 0.0058F, 60, new VehicleStats.Vector3i(0, 0, -2)).track();
    @Config.Name("Sputnik 3000L")
    public VehicleStats sputnik3000L = new VehicleStats(250F, 1.3F, 0.0053F, 0.019F, 0.2F, 3.9F, 0.0031F, 50, new VehicleStats.Vector3i(0, 0, -1)).track();
    @Config.Name("Sputnik Duster")
    public VehicleStats sputnikDuster = new VehicleStats(300F, 1.26F, 0.0047F, 0.0165F, 0.18F, 3.9F, 0.0053f, 70, new VehicleStats.Vector3i(0, 0, -1)).track();
    @Config.Name("Fedoratti NightStalker")
    public VehicleStats fedorattiNightStalker = new VehicleStats(200F, 1.58F, 0.009F, 0.026F, 0.28F, 4.2F, 0.0065F, 60, new VehicleStats.Vector3i(0, 0, -1)).track();
    @Config.Name("Proton P1")
    public VehicleStats protonP1 = new VehicleStats(250F, 1.37F, 0.0062F, 0.019F, 0.22F, 4.0F, 0.0036F, 50).track();
    @Config.Name("Proton P3")
    public VehicleStats protonP3 = new VehicleStats(220F, 1.41F, 0.007F, 0.022F, 0.25F, 4.0F, 0.0041F, 50).track();
    @Config.Name("MCG Ambulance")
    public VehicleStats mcgAmbulance = new VehicleStats(300F, 1.14F, 0.0042F, 0.016F, 0.14F, 3.6F, 0.0064F, 70, new VehicleStats.Vector3i(0, 0, -3)).track();
    @Config.Name("MCG Firetruck")
    public VehicleStats mcgFiretruck = new VehicleStats(500F, 1.0F, 0.0038F, 0.011F, 0.09F, 3.1F, 0.0082F, 100, new VehicleStats.Vector3i(0, 0, -5)).track();
    @Config.Name("Tracer Jester")
    public VehicleStats tracerJester = new VehicleStats(250F, 1.15F, 0.0085F, 0.02F, 0.18F, 3.8F, 0.0052F, 45, new VehicleStats.Vector3i(0, 0, -1)).track();
    @Config.Name("Tracer Outlander")
    public VehicleStats tracerOutlander = new VehicleStats(350F, 1.16F, 0.005F, 0.018F, 0.16F, 3.9F, 0.005F, 65, new VehicleStats.Vector3i(0, 0, -2)).track();
    @Config.Name("Proton P9X")
    public VehicleStats protonP9X = new VehicleStats(250F, 1.48F, 0.0068F, 0.0265F, 0.09F, 3.1F, 0.0049F, 60).track();
}
