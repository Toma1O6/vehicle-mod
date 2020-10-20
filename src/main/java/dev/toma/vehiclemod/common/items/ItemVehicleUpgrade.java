package dev.toma.vehiclemod.common.items;

public class ItemVehicleUpgrade extends VMItem {

    private final Type type;
    private final int level;

    public ItemVehicleUpgrade(Type type, int level) {
        super(type.name().toLowerCase() + "_" + level);
        this.type = type;
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public enum Type {
        BODY,
        BRAKES,
        ECU,
        ENGINE,
        FUEL_TANK,
        SUSPENSION,
        TRANSMISSION,
        TURBO
    }
}
