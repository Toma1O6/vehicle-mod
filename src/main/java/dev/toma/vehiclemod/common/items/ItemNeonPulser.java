package dev.toma.vehiclemod.common.items;

public class ItemNeonPulser extends ItemTunerPackage {

    final int pulseLength;

    public ItemNeonPulser(String name, int tier, int pulseLength) {
        super(name, tier);
        this.pulseLength = pulseLength;
    }

    public int getPulseLength() {
        return pulseLength;
    }
}
