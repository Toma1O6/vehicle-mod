package dev.toma.vehiclemod.racing.renderer;

import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;
import java.util.function.Function;

public final class CheckpointStyle {

    private static int index;
    private static CheckpointStyle[] styles = new CheckpointStyle[4];

    public static CheckpointStyle DEFAULT_STYLE = createStyle(0.3, 4.0, VehicleMod.getResource("textures/gui/checkpoint.png"), CheckpointStyle::getDefaultColorScheme);

    private final int styleID = index++;
    private final double height;
    private final double width;
    private final ResourceLocation texture;
    private final Function<Integer, Integer> colorScheme;

    private CheckpointStyle(double width, double height, ResourceLocation location, Function<Integer, Integer> colorScheme) {
        this.width = width;
        this.height = height;
        this.texture = location;
        this.colorScheme = colorScheme;
        register(this);
    }

    public static CheckpointStyle createStyle(double width, double height, ResourceLocation texture, Function<Integer, Integer> colorScheme) {
        return new CheckpointStyle(width, height, texture, colorScheme);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    public int getColorFromScheme(int nextCheckpointIndex) {
        return colorScheme.apply(nextCheckpointIndex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckpointStyle style = (CheckpointStyle) o;

        return styleID == style.styleID;
    }

    @Override
    public int hashCode() {
        return styleID;
    }

    public static void forEachStyle(Consumer<CheckpointStyle> action) {
        for (CheckpointStyle style : styles) {
            action.accept(style);
        }
    }

    public static int getDefaultColorScheme(int nextIndex) {
        switch (nextIndex) {
            case -1:
                return 0xFF0000;
            case 1:
                return 0xFFFA66;
            default:
                return 0x44FF44;
        }
    }

    public static CheckpointStyle nextStyle(CheckpointStyle currentStyle, boolean reverseOrder) {
        int i = currentStyle.styleID;
        i += reverseOrder ? -1 : 1;
        if(i < 0) i = styles.length - 1;
        if(i >= styles.length) i = 0;
        return styles[i];
    }

    private static void register(CheckpointStyle style) {
        if(index >= styles.length) {
            CheckpointStyle[] expanded = new CheckpointStyle[styles.length + 1];
            System.arraycopy(styles, 0, expanded, 0, styles.length);
            styles = expanded;
        }
        styles[style.styleID] = style;
    }
}
