package dev.toma.vehiclemod.util;

import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.util.ResourceLocation;

public enum VehicleTexture {

    WHITE(),
    ORANGE(),
    MAGENTA(),
    LIGHT_BLUE(),
    YELLOW(),
    LIME(),
    PINK(),
    GRAY(),
    SILVER(),
    CYAN(),
    PURPLE(),
    BLUE(),
    BROWN(),
    GREEN(),
    RED(),
    BLACK(),
    BIRCH(),
    BRICK(),
    DIORITE(),
    HELL(),
    IRON(),
    LAPIS(),
    PRISMARINE(),
    RUST(),
    WOOD_DARK(),
    WOOD_LIGHT(),
    WOOD();

    final ResourceLocation location;

    VehicleTexture() {
        this.location = new ResourceLocation(VehicleMod.MODID, "textures/entity/" + name().toLowerCase() + ".png");
    }

    public ResourceLocation getResource() {
        return location;
    }
}
