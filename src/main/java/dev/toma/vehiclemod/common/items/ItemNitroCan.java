package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.fluids.FluidType;
import dev.toma.vehiclemod.common.fluids.IFuelMakerItem;
import dev.toma.vehiclemod.init.FluidTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class ItemNitroCan extends VMItem implements IFuelMakerItem {

    public static final ResourceLocation EMPTY_ICON = VehicleMod.getResource("textures/gui/nitro_empty.png");
    final int extractAmount;
    final Supplier<SoundEvent> soundSupplier;
    final ResourceLocation icon_available;
    final ResourceLocation icon_active;

    public ItemNitroCan(String name, int extractAmount, int amount, Supplier<SoundEvent> soundSupplier) {
        super(name);
        setMaxDamage(amount);
        setMaxStackSize(1);
        this.extractAmount = extractAmount;
        this.soundSupplier = soundSupplier;
        this.icon_available = VehicleMod.getResource("textures/gui/" + name + "_available.png");
        this.icon_active = VehicleMod.getResource("textures/gui/" + name + "_active.png");
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

    public SoundEvent getBurnSound() {
        return soundSupplier.get();
    }

    public ResourceLocation getIcon_active() {
        return icon_active;
    }

    public ResourceLocation getIcon_available() {
        return icon_available;
    }

    public int getExtractAmount() {
        return extractAmount;
    }
}
