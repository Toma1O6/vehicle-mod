package dev.toma.vehiclemod.common.items;

public class ItemNitroCloud extends ItemTunerPackage {

    final int color;

    public ItemNitroCloud(String name, int tier, int color) {
        super(name, tier);
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
