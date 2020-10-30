package dev.toma.vehiclemod.common.tunning;

import dev.toma.vehiclemod.common.entity.vehicle.VehicleUpgrades;

public interface IStatApplicator {

    IStatApplicator TOP_SPEED = VehicleUpgrades::addTopSpeed;
    IStatApplicator ACCELERATION = VehicleUpgrades::addAcceleration;
    IStatApplicator HANDLING = VehicleUpgrades::addHandling;
    IStatApplicator BRAKING = VehicleUpgrades::addBraking;
    IStatApplicator FUEL_CONSUMPTION = VehicleUpgrades::addFuelCons;
    IStatApplicator FUEL_CAPACITY = VehicleUpgrades::addFuelCap;
    IStatApplicator DURABILITY = VehicleUpgrades::addHealth;

    void applyOnStat(VehicleUpgrades upgrades, float value);
}
