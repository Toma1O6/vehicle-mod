package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.fluids.IFilter;

import java.util.Random;

public class ItemFuelFilter extends VMItem implements IFilter {

    public ItemFuelFilter(String name) {
        super(name);
    }

    @Override
    public boolean shouldBreak(Random random) {
        return true;
    }
}
