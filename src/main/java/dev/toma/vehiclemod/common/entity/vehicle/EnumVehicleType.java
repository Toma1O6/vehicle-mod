package dev.toma.vehiclemod.common.entity.vehicle;

public enum EnumVehicleType {

    STANDART(30, EnumCarLockType.IRON),
    SUV(10, EnumCarLockType.GOLD),
    MUSCLE(20, EnumCarLockType.IRON),
    SPORT(15, EnumCarLockType.DIAMOND),
    SUPER(10, EnumCarLockType.DIAMOND),
    UTILITY(15, EnumCarLockType.GOLD);

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
