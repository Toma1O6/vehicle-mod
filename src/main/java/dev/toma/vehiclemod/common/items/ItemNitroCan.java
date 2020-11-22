package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.fluids.FluidType;
import dev.toma.vehiclemod.common.fluids.IFuelMakerItem;
import dev.toma.vehiclemod.init.FluidTypes;
import net.minecraft.item.ItemStack;

public class ItemNitroCan extends VMItem implements IFuelMakerItem {

    public ItemNitroCan(String name, int amount) {
        super(name);
        setMaxDamage(amount);
    }

    @Override
    public FluidType getFluid() {
        return FluidTypes.NITRO;
    }

    @Override
    public int getFluidAmount(ItemStack stack) {
        return stack.getMaxDamage() - stack.getItemDamage();
    }

    @Override
    public boolean shouldCreateEmptyBucket() {
        return false;
    }

    @Override
    public ItemStack processInsertion(ItemStack stack, int extracted) {
        stack.setItemDamage(stack.getItemDamage() + extracted);
        return stack;
    }
}
