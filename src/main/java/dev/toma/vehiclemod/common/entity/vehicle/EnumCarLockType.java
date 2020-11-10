package dev.toma.vehiclemod.common.entity.vehicle;

public enum EnumCarLockType {

    IRON(9),
    GOLD(12),
    DIAMOND(15);

    private final int pinCount;

    EnumCarLockType(int pinCount) {
        this.pinCount = pinCount;
    }
}
