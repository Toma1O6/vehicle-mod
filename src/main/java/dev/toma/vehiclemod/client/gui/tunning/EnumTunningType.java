package dev.toma.vehiclemod.client.gui.tunning;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.util.GuiHandler;
import dev.toma.vehiclemod.util.function.LazyLoad;
import net.minecraft.item.ItemStack;

public enum EnumTunningType {

    STATS("Components", GuiHandler.VEHICLE_COMPONENT, new LazyLoad<>(() -> new ItemStack(Registries.VMItems.ENGINE_7))),
    NEONS("Neons", GuiHandler.VEHICLE_NEON, new LazyLoad<>(() -> new ItemStack(Registries.VMItems.NEON_TUBE_RED))),
    NITRO("Nitro", GuiHandler.VEHICLE_NITRO, new LazyLoad<>(() -> new ItemStack(Registries.VMItems.NITRO_BOTTLE_100)));

    final String name;
    final int guiID;
    final LazyLoad<ItemStack> displayIcon;

    EnumTunningType(String name, int guiID, LazyLoad<ItemStack> displayIcon) {
        this.name = name;
        this.guiID = guiID;
        this.displayIcon = displayIcon;
    }

    public String getDisplayName() {
        return name;
    }

    public int getGuiID() {
        return guiID;
    }

    public ItemStack getDisplayIcon() {
        return displayIcon.get();
    }
}
