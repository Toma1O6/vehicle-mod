package dev.toma.vehiclemod.common.items;

public abstract class ItemTunerPackage extends VMItem implements ITunerPackageEntry {

    final int tier;

    public ItemTunerPackage(String name, int tier) {
        super(name);
        this.tier = tier;
    }

    @Override
    public int getTier() {
        return tier;
    }
}
