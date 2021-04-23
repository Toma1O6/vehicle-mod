package dev.toma.vehiclemod.common.entity.vehicle.internals;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleBeamerS120;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleTracerJester;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleTracerT1;
import dev.toma.vehiclemod.common.entity.vehicle.special.*;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleBeamerS320RS;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP3;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP9X;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleProtonP1;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik2000L;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik3000L;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiNightStalker;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiVulcan;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleSputnikDuster;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleTracerOutlander;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PropertyList {

    private static final Map<Class<? extends EntityVehicle>, VehicleStyle.Properties> PROPERTIES_MAP = new HashMap<>();

    public static void registerProperty(Class<? extends EntityVehicle> vehicleClass, VehicleStyle.Properties properties) {
        if(PROPERTIES_MAP.put(Objects.requireNonNull(vehicleClass), Objects.requireNonNull(properties)) != null) {
            VehicleMod.logger.warn("Found property override for {}, this might not be intended.", vehicleClass.getSimpleName());
        }
    }

    public static VehicleStyle.Properties lookupProperty(Class<? extends EntityVehicle> vehicleClass) {
        return PROPERTIES_MAP.get(vehicleClass);
    }

    public static void registerProperties() {
        /* ============== MUSCLES ================ */
        registerProperty(VehicleBeamerS120.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(4)
                .addNitroExitDef(1.9, 0.8, 0.55, -0.1, 0.1, 0.1)
                .addNitroExitDef(1.9, 0.8, -0.55, -0.1, 0.1, -0.1)
                .addNitroExitDef(2.5, 0.4, 0.75, 0, 0.05, 0.1)
                .addNitroExitDef(2.5, 0.4, -0.75, 0, 0.05, -0.1)
                .setFrontNeon(2.7, 1.6)
                .setBackNeon(1.8, 1.4)
                .setSideNeons(0.9, 0.2)
                .engine(2, 0.75, 0)
                .exhaust(-2, 0.4, 0.47)
                .passengers(4, id -> id < 2 ? 0.6 : -0.3, -0.15, id -> id % 2 == 0 ? -0.4 : 0.4)
                .buildProperties()
        );
        registerProperty(VehicleTracerJester.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(4)
                .addNitroExitDef(0.9, 1.0, 0.8, -0.1, 0.1, 0.05)
                .addNitroExitDef(0.9, 1.0, -0.8, -0.1, 0.1, -0.05)
                .addNitroExitDef(2.0, 0.4, 0.9, -0.1, 0.05, 0.1)
                .addNitroExitDef(2.0, 0.4, -0.9, -0.1, 0.05, -0.1)
                .setFrontNeon(2.1)
                .setBackNeon(2.4)
                .setSideNeons(0.9)
                .engine(1.6, 0.7, 0)
                .exhaust(-2.6, 0.3, 0.8, -2.6, 0.3, -0.8)
                .passengers(2, id -> -0.1, -0.05, id -> id == 0 ? -0.45 : 0.45)
                .buildProperties()
        );
        registerProperty(VehicleTracerT1.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(4)
                .addNitroExitDef(0.7, 0.8, 0.5, -0.13, 0.1, 0.1)
                .addNitroExitDef(0.7, 0.8, -0.5, -0.13, 0.1, -0.1)
                .addNitroExitDef(2.2, 0.3, 0.65, 0.1, 0.05, 0.05)
                .addNitroExitDef(2.2, 0.3, -0.65, 0.1, 0.05, -0.05)
                .setFrontNeon(2.4, 1.4)
                .setBackNeon(2.0, 1.4)
                .setRightNeon(0.85)
                .setLeftNeon(0.8)
                .setNeonSize(NeonHandler.Direction.RIGHT, 1.5)
                .setNeonSize(NeonHandler.Direction.LEFT, 1.5)
                .engine(1.5, 0.5, 0)
                .exhaust(-2.2, 0.3, 0.3)
                .passengers(2, id -> -0.2, -0.18, id -> id == 0 ? -0.4 : 0.4)
                .buildProperties()
        );
        /* ============== SPECIALS ================= */
        registerProperty(VehicleBeamerPickup.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(2)
                .addNitroExitDef(2.0, 0.6, 0.75, -0.05, 0.1, 0.1)
                .addNitroExitDef(2.0, 0.6, -0.75, -0.05, 0.1, -0.1)
                .setFrontNeon(2.0, 1.6)
                .setBackNeon(1.5, 1.4)
                .setSideNeons(0.85, 0.2, 1.4)
                .engine(1.8, 0.55, 0)
                .exhaust(-1.8, 0.25, 0)
                .passengers(2, id -> 1.4, 0.3, id -> id == 0 ? -0.35 : 0.35)
                .buildProperties()
        );
        registerProperty(VehicleMcgAmbulance.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(4)
                .addNitroExitDef(2.5, 1.0, 0.8, -0.05, 0.1, 0.1)
                .addNitroExitDef(2.5, 1.0, -0.8, -0.05, 0.1, -0.1)
                .addNitroExitDef(2.8, 0.65, 0.35, 0.1, 0.0, 0.1)
                .addNitroExitDef(2.8, 0.65, -0.35, 0.1, 0.0, -0.1)
                .setFrontNeon(2.8)
                .setBackNeon(2.6)
                .setSideNeons(1.15, 0.1, 3.0)
                .engine(2.5, 0.65, 0)
                .exhaust(-2.8, 0.2, 0.7)
                .passengers(3, id -> id < 2 ? 1.2 : -1.0, 0.2, id -> id % 2 == 0 ? -0.55 : 0.55)
                .textures(VehicleMcgAmbulance::getRandomTexture, VehicleMcgAmbulance::canApplyTexture, VehicleStyle.Texture::transformYellowTexture)
                .buildProperties()
        );
        registerProperty(VehicleMcgFiretruck.class, new VehicleStyle.PropertyBuilder()
                .addNitroExitDef(3.5, 0.8, 0.4, 0.1, 0.02, 0.15)
                .addNitroExitDef(3.5, 0.8, -0.4, 0.1, 0.02, -0.15)
                .addNitroExitDef(1.4, 0.5, 1.0, 0.1, 0.0, 0.2)
                .addNitroExitDef(1.4, 0.5, -1.0, 0.1, 0.0, -0.2)
                .addNitroExitDef(-2.5, 0.6, 1.0, -0.1, 0.0, 0.1)
                .addNitroExitDef(-2.5, 0.6, -1.0, -0.1, 0.0, -0.1)
                .setFrontNeon(3.5, 2.3)
                .setBackNeon(2.9, 2.3)
                .setSideNeons(1.2, 0.6, 2.1)
                .engine(3.4, 0.65, 0)
                .exhaust(-3.2, 0.45, 0.9, -3.2, 0.45, -0.9)
                .passengers(3, id -> 2.75, 0.55, id -> -0.65 + id * 0.65)
                .textures(VehicleMcgFiretruck::getRandomTexture, VehicleMcgFiretruck::canApplyTexture, VehicleStyle.Texture::transformYellowTexture)
                .buildProperties()
        );
        registerProperty(VehicleMCGMultiVan.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(3)
                .addNitroExitDef(2.2, 1.1, 0.6, -0.03, 0.15, 0.2)
                .addNitroExitDef(2.2, 1.1, -0.5, -0.03, 0.15, -0.2)
                .addNitroExitDef(2.4, 0.5, 0.0, 0.15, 0.02, 0.0)
                .setFrontNeon(2.5, 1.9)
                .setBackNeon(2.4, 1.8)
                .setRightNeon(1.0)
                .setLeftNeon(1.07)
                .setNeonSize(NeonHandler.Direction.RIGHT, 2.9)
                .setNeonSize(NeonHandler.Direction.LEFT, 2.9)
                .engine(2.2, 0.45, 0)
                .exhaust(-3.0, 0.55, 0)
                .passengers(2, id -> 1.2, 0.22, id -> id % 2 == 0 ? -0.3 : 0.3)
                .buildProperties()
        );
        registerProperty(VehicleSputnik3000LEnforcer.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(0)
                .disableNeons()
                .engine(1.75, 0.65, 0)
                .exhaust(-1.9, 0.25, 0.5)
                .passengers(4, id -> id < 2 ? 0.4 : -0.4, -0.1, id -> id % 2 == 0 ? -0.4 : 0.4)
                .textures(random -> VehicleStyle.Texture.WHITE, texture -> texture == VehicleStyle.Texture.WHITE)
                .buildProperties()
        );
        /* SPORT */
        registerProperty(VehicleBeamerS320RS.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(5)
                .addNitroExitDef(1.4, 0.8, 0.6, -0.1, 0.1, 0.1)
                .addNitroExitDef(1.4, 0.8, -0.6, -0.1, 0.1, -0.1)
                .addNitroExitDef(1.9, 0.7, 0.8, 0.1, 0.02, 0.1)
                .addNitroExitDef(1.9, 0.7, -0.8, 0.1, 0.02, -0.1)
                .addNitroExitDef(2.0, 0.7, 0.0, 0.12, 0.01, 0.0)
                .setFrontNeon(2.0, 1.8)
                .setBackNeon(1.9, 0.9)
                .setRightNeon(1.0, -0.1)
                .setLeftNeon(0.95, -0.1)
                .engine(1.5, 0.65, 0.0)
                .exhaust(-2.2, 0.55, 0.7, -2.2, 0.55, -0.8)
                .passengers(4, id -> id < 2 ? 0.15 : -0.65, -0.1, id -> id % 2 == 0 ? -0.4 : 0.4)
                .buildProperties()
        );
        registerProperty(VehicleProtonP3.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(5)
                .addNitroExitDef(1.0, 0.9, 0.7, -0.1, 0.1, 0.1)
                .addNitroExitDef(1.0, 0.9, -0.7, -0.1, 0.1, -0.1)
                .addNitroExitDef(1.7, 0.5, 0.0, 0.1, 0.0, 0.0)
                .addNitroExitDef(1.7, 0.5, 0.9, 0.1, 0.0, 0.1)
                .addNitroExitDef(1.7, 0.5, -0.9, 0.1, 0.0, -0.1)
                .setFrontNeon(1.7, 1.7)
                .setBackNeon(2.0, 1.7)
                .setSideNeons(0.85, -0.1, 1.5)
                .engine(1.5, 0.45, 0)
                .exhaust(-2.3, 0.45, 0.65, -2.3, 0.45, -0.65)
                .passengers(2, id -> -0.2, -0.15, id -> id % 2 == 0 ? -0.4: 0.4)
                .buildProperties()
        );
        registerProperty(VehicleProtonP9X.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(4)
                .addNitroExitDef(0.8, 0.9, 0.8, -0.12, 0.1, 0.1)
                .addNitroExitDef(0.8, 0.9, -0.8, -0.12, 0.1, -0.1)
                .addNitroExitDef(2.0, 0.5, 1.0, 0.08, -0.05, 0.1)
                .addNitroExitDef(2.0, 0.5, -1.0, 0.08, -0.05, -0.1)
                .setFrontNeon(2.1)
                .setBackNeon(2.1)
                .setSideNeons(1.05, -0.15)
                .engine(1.5, 0.6, 0)
                .exhaust(-2.4, 0.2, 0.65)
                .passengers(2, id -> -0.2, -0.2, id -> id == 0 ? -0.45 : 0.45)
                .buildProperties()
        );
        /* STANDART */
        registerProperty(VehicleProtonP1.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(3)
                .addNitroExitDef(1.0, 0.9, 0.7, -0.1, 0.1, 0.1)
                .addNitroExitDef(1.0, 0.9, -0.7, -0.1, 0.1, -0.1)
                .addNitroExitDef(1.7, 0.5, 0.0, 0.1, 0.0, 0.0)
                .setFrontNeon(1.7, 1.7)
                .setBackNeon(2.0, 1.7)
                .setSideNeons(0.85, -0.1, 1.5)
                .engine(1.5, 0.45, 0)
                .exhaust(-2.3, 0.45, 0.6)
                .passengers(2, id -> -0.2, -0.15, id -> id % 2 == 0 ? -0.4 : 0.4)
                .buildProperties()
        );
        registerProperty(VehicleSputnik2000L.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(3)
                .addNitroExitDef(1.0, 0.9, 0.7, -0.1, 0.1, 0.1)
                .addNitroExitDef(1.0, 0.9, -0.7, -0.1, 0.1, -0.1)
                .addNitroExitDef(2.0, 0.5, 0.0, 0.15, 0.02, 0)
                .setFrontNeon(2.2, 1.4)
                .setBackNeon(1.8, 1.4)
                .setRightNeon(0.8)
                .setLeftNeon(0.85)
                .setNeonSize(NeonHandler.Direction.RIGHT, 1.4)
                .setNeonSize(NeonHandler.Direction.LEFT, 1.4)
                .engine(1.7, 0.75, 0)
                .exhaust(-1.95, 0.4, 0.3)
                .passengers(2, id -> 0.1, -0.05, id -> id % 2 == 0 ? -0.4 : 0.4)
                .buildProperties()
        );
        registerProperty(VehicleSputnik3000L.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(4)
                .addNitroExitDef(1.5, 0.8, 0.45, -0.1, 0.1, 0.1)
                .addNitroExitDef(1.5, 0.8, -0.45, -0.1, 0.1, -0.1)
                .addNitroExitDef(2.0, 0.4, 0.8, 0.05, 0.05, 0.1)
                .addNitroExitDef(2.0, 0.4, -0.8, 0.05, 0.05, -0.1)
                .setFrontNeon(2.3, 1.6)
                .setBackNeon(1.8, 1.4)
                .setSideNeons(1.0)
                .engine(1.75, 0.65, 0)
                .exhaust(-1.9, 0.25, 0.5)
                .passengers(4, id -> id < 2 ? 0.4 : -0.4, -0.1, id -> id % 2 == 0 ? -0.4 : 0.4)
                .buildProperties()
        );
        /* SUPERSPORT */
        registerProperty(VehicleFedorattiNightStalker.class, new VehicleStyle.PropertyBuilder()
                .addNitroExitDef(1.6, 0.8, 0.65, -0.1, 0.1, 0.1)
                .addNitroExitDef(1.6, 0.8, -0.65, -0.1, 0.1, -0.1)
                .addNitroExitDef(2.7, 0.2, 0.65, 0.1, 0.0, 0.05)
                .addNitroExitDef(2.7, 0.2, -0.65, 0.1, 0.0, -0.05)
                .addNitroExitDef(-1.4, 0.8, 0.3, -0.1, 0.1, 0.05)
                .addNitroExitDef(-1.4, 0.8, -0.3, -0.1, 0.1, -0.05)
                .setFrontNeon(2.8)
                .setBackNeon(2.1, 1.5)
                .setSideNeons(1.0, 0.1, 2.5)
                .engine(-1.5, 0.65, 0)
                .exhaust(-2.25, 0.45, 0)
                .passengers(2, id -> 0.2, -0.2, id -> id % 2 == 0 ? -0.4 : 0.4)
                .buildProperties()
        );
        registerProperty(VehicleFedorattiVulcan.class, new VehicleStyle.PropertyBuilder()
                .addNitroExitDef(1.4, 0.8, 0.7, -0.2, 0.15, 0.1)
                .addNitroExitDef(1.4, 0.8, -0.7, -0.2, 0.15, -0.1)
                .addNitroExitDef(3.0, 0.3, 0.8, -0.05, 0.05, 0.1)
                .addNitroExitDef(3.0, 0.3, -0.8, -0.05, 0.05, -0.1)
                .addNitroExitDef(-1.1, 0.8, 0.2, -0.1, 0.15, 0.05)
                .addNitroExitDef(-1.1, 0.8, -0.2, -0.1, 0.15, -0.05)
                .setFrontNeon(3.3, 1.6)
                .setBackNeon(1.9, 1.4)
                .setRightNeon(0.9, 0.15)
                .setLeftNeon(0.95, 0.15)
                .engine(-1.3, 0.95, 0)
                .exhaust(-2.1, 0.4, -0.55, -2.1, 0.4, 0.55)
                .passengers(4, id -> id < 2 ? 0.5 : -0.2, -0.2, id -> id % 2 == 0 ? -0.4 : 0.4)
                .buildProperties()
        );
        /* SUV */
        registerProperty(VehicleSputnikDuster.class, new VehicleStyle.PropertyBuilder()
                .addNitroExitDef(1.5, 1.2, 0.7, -0.05, 0.1, 0.1)
                .addNitroExitDef(1.5, 1.2, -0.7, -0.05, 0.1, -0.1)
                .addNitroExitDef(2.4, 0.6, 1.0, -0.1, 0.02, 0.1)
                .addNitroExitDef(2.4, 0.6, -1.0, -0.1, 0.02, -0.1)
                .addNitroExitDef(2.5, 0.6, 0.8, 0.15, 0.0, 0.0)
                .addNitroExitDef(2.5, 0.6, -0.8, 0.15, 0.0, 0.0)
                .setFrontNeon(2.6, 2.2)
                .setBackNeon(1.8, 1.8)
                .setSideNeons(1.1, 0.2)
                .engine(2.0, 0.65, 0)
                .exhaust(-2.0, 0.35, 0.4)
                .passengers(4, id -> id < 2 ? 0.4 : -0.4, 0.3, id -> id % 2 == 0 ? -0.5 : 0.5)
                .buildProperties()
        );
        registerProperty(VehicleTracerOutlander.class, new VehicleStyle.PropertyBuilder()
                .nitroExits(4)
                .addNitroExitDef(1.0, 1.0, 0.9, -0.1, 0.2, 0.1)
                .addNitroExitDef(1.0, 1.0, -0.9, -0.1, 0.2, -0.1)
                .addNitroExitDef(2.2, 0.4, 1.0, -0.1, 0.05, 0.1)
                .addNitroExitDef(2.2, 0.4, -1.0, -0.1, 0.05, -0.1)
                .setFrontNeon(2.2)
                .setBackNeon(2.9)
                .setSideNeons(1.0)
                .engine(1.7, 0.8, 0)
                .exhaust(-3.1, 0.2, 0.75)
                .passengers(2, id -> -0.15, 0.2, id -> id == 0 ? -0.55 : 0.55)
                .buildProperties()
        );
    }
}
