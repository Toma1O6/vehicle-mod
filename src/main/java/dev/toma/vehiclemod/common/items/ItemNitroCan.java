package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.common.fluids.FluidType;
import dev.toma.vehiclemod.common.fluids.IFuelMakerItem;
import dev.toma.vehiclemod.init.FluidTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class ItemNitroCan extends VMItem implements IFuelMakerItem, ITunerPackageEntry {

    public static final ResourceLocation EMPTY_ICON = VehicleMod.getResource("textures/gui/nitro_empty.png");
    final int tier;
    final int capacity;
    final int useTicks;
    final Supplier<SoundEvent> soundSupplier;
    final ResourceLocation icon_available;
    final ResourceLocation icon_active;

    public ItemNitroCan(String name, int tier, int capacity, int useTicks, Supplier<SoundEvent> soundSupplier) {
        super(name);
        setMaxDamage(1);
        setMaxStackSize(1);
        this.tier = tier;
        this.capacity = capacity;
        this.useTicks = useTicks;
        this.soundSupplier = soundSupplier;
        this.icon_available = VehicleMod.getResource("textures/gui/" + name + "_available.png");
        this.icon_active = VehicleMod.getResource("textures/gui/" + name + "_active.png");
    }

    @Override
    public int getTier() {
        return tier;
    }

    @Override
    public FluidType getFluid() {
        return FluidTypes.NITRO;
    }

    @Override
    public int getFluidAmount(ItemStack stack) {
        return stack.getItemDamage() > 0 ? 0 : capacity;
    }

    @Override
    public boolean shouldCreateEmptyBucket() {
        return false;
    }

    @Override
    public ItemStack processInsertion(ItemStack stack, int extracted) {
        stack.setItemDamage(stack.getMaxDamage());
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

    public int getUseTicks() {
        return useTicks;
    }

    public int getCapacity() {
        return capacity;
    }
}
