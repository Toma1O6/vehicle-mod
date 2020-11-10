package dev.toma.vehiclemod.common.entity.vehicle;

public enum EnumVehicleType {

    STANDART(40, EnumCarLockType.IRON), // 10
    SUV(15, EnumCarLockType.GOLD), // 15
    MUSCLE(20, EnumCarLockType.IRON), // 15
    SPORT(10, EnumCarLockType.DIAMOND), // 20
    SPECIAL(15, EnumCarLockType.GOLD); // 10

    private final int spawnChance;
    private final EnumCarLockType carLockType;

    EnumVehicleType(int spawnChance, EnumCarLockType carLockType) {
        this.spawnChance = spawnChance;
        this.carLockType = carLockType;
    }

    public int getSpawnChance() {
        return spawnChance;
    }

    public EnumCarLockType getCarLockType() {
        return carLockType;
    }
}
