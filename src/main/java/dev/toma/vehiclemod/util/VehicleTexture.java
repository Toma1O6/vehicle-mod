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
    WOOD(),
    SANDSTONE(),
    RED_SANDSTONE(),
    UTILITY_YELLOW(true);

    final ResourceLocation location;
    final boolean ignored;

    VehicleTexture() {
        this(false);
    }

    VehicleTexture(boolean ignored) {
        this.location = new ResourceLocation(VehicleMod.MODID, "textures/entity/" + name().toLowerCase() + ".png");
        this.ignored = ignored;
    }

    public ResourceLocation getResource() {
        return location;
    }

    public boolean isIgnored() {
        return ignored;
    }
}
