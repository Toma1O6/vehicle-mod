package dev.toma.vehiclemod.common.tunning;

import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleUpgrades;

public interface IStatApplicator {

    IStatApplicator TOP_SPEED = VehicleUpgrades::addTopSpeed;
    IStatApplicator ACCELERATION = VehicleUpgrades::addAcceleration;
    IStatApplicator HANDLING = VehicleUpgrades::addHandling;
    IStatApplicator BRAKING = VehicleUpgrades::addBraking;
    IStatApplicator FUEL_CONSUMPTION = VehicleUpgrades::addFuelCons;
    IStatApplicator FUEL_CAPACITY = VehicleUpgrades::addFuelCap;
    IStatApplicator DURABILITY = VehicleUpgrades::addHealth;
    IStatApplicator NITRO_PW = VehicleUpgrades::addNitroPower;

    void applyOnStat(VehicleUpgrades upgrades, float value);
}
