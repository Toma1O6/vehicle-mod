package dev.toma.vehiclemod.common.entity.vehicle.internals;

public enum EnumCarLockType {

    IRON(9, 7),
    GOLD(12, 9),
    DIAMOND(15, 11);

    private final int pinCount;
    private final int naturalPinCount;

    EnumCarLockType(int pinCount, int naturalPinCount) {
        this.pinCount = pinCount;
        this.naturalPinCount = naturalPinCount;
    }

    public int getPinCount(boolean naturallySpawned) {
        return naturallySpawned ? naturalPinCount : pinCount;
    }
}
