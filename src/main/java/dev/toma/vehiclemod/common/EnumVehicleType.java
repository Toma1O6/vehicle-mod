package dev.toma.vehiclemod.common;

public enum EnumVehicleType {

    STANDART(40),
    SUV(15),
    MUSCLE(20),
    SPORT(10),
    SPECIAL(15);

    private final int spawnChance;

    EnumVehicleType(int spawnChance) {
        this.spawnChance = spawnChance;
    }

    public int getSpawnChance() {
        return spawnChance;
    }
}
