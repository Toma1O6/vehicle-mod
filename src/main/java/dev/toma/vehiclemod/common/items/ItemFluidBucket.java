package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.fluids.FluidType;
import dev.toma.vehiclemod.common.fluids.IFuelMakerItem;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ItemFluidBucket extends VMItem implements IFuelMakerItem {

    final Supplier<FluidType> heldFluid;

    public ItemFluidBucket(String name, Supplier<FluidType> heldFluid) {
        super(name);
        this.heldFluid = heldFluid;
    }

    @Override
    public FluidType getFluid() {
        return heldFluid.get();
    }

    @Override
    public int getFluidAmount(ItemStack stack) {
        return 10000;
    }

    @Override
    public boolean shouldCreateEmptyBucket() {
        return true;
    }

    @Override
    public ItemStack processInsertion(ItemStack stack, int extracted) {
        stack.shrink(1);
        return stack;
    }
}
