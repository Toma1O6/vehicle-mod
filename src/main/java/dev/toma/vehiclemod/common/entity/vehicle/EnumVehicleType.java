package dev.toma.vehiclemod.common.entity.vehicle;

public enum EnumVehicleType {

    STANDART(40), // 10
    SUV(15), // 15
    MUSCLE(20), // 20
    SPORT(10), // 20
    SPECIAL(15); // 10

    private final int spawnChance;

    EnumVehicleType(int spawnChance) {
        this.spawnChance = spawnChance;
    }

    public int getSpawnChance() {
        return spawnChance;
    }
}
