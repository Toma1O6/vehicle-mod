package dev.toma.vehiclemod.common.items;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.Vec3d;

public class ItemSprayCan extends VMItem {

    private EnumDyeColor colorVar;

    public ItemSprayCan(String name, EnumDyeColor color) {
        super(name);
        this.setMaxStackSize(1);
        this.colorVar = color;
    }

    public EnumDyeColor getColor() {
        return colorVar;
    }

    private Vec3d multiply(Vec3d vec3d, int i) {
        return new Vec3d(vec3d.x * i, vec3d.y * i, vec3d.z * i);
    }
}
