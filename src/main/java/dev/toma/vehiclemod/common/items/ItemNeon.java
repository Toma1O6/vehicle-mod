package dev.toma.vehiclemod.common.items;

public class ItemNeon extends ItemTunerPackage {

    final int color;

    public ItemNeon(String name, int tier, int color) {
        super(name, tier);
        this.color = color;
    }

    public int getNeonColor() {
        return color;
    }
}
