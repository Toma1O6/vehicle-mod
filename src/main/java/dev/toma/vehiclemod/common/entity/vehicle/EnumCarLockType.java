package dev.toma.vehiclemod.common.entity.vehicle;

public enum EnumCarLockType {

    IRON(2),
    GOLD(12),
    DIAMOND(15);

    private final int pinCount;

    EnumCarLockType(int pinCount) {
        this.pinCount = pinCount;
    }

    public int getPinCount() {
        return pinCount;
    }
}
