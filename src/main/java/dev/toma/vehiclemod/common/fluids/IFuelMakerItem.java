package dev.toma.vehiclemod.common.fluids;

import net.minecraft.item.ItemStack;

public interface IFuelMakerItem {

    FluidType getFluid();

    int getFluidAmount(ItemStack stack);

    boolean shouldCreateEmptyBucket();

    ItemStack processInsertion(ItemStack stack, int extracted);
}
