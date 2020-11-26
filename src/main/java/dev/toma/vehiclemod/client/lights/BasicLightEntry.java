package dev.toma.vehiclemod.client.lights;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.model.ModelRenderer;

public class BasicLightEntry<V extends EntityVehicle> implements LightEntry<V> {

    private int x;
    private int y;
    private final ModelRenderer[] renderers;

    protected BasicLightEntry(float lightIntensity, ModelRenderer... renderers) {
        this.recalculateForIntensity(lightIntensity);
        this.renderers = renderers;
    }

    public void recalculateForIntensity(float intensity) {
        int value = (int) (0xF * intensity);
        int totalLight = 0xF00000 | value << 4;
        this.setLightmapX(totalLight % 0x10000);
        this.setLightmapY(totalLight / 0x10000);
    }

    @Override
    public int getLightmapX() {
        return x;
    }

    @Override
    public int getLightmapY() {
        return y;
    }

    @Override
    public void setLightmapX(int x) {
        this.x = x;
    }

    @Override
    public void setLightmapY(int y) {
        this.y = y;
    }

    @Override
    public ModelRenderer[] getModels() {
        return renderers;
    }

    @Override
    public boolean shouldApplyLight(V vehicle) {
        return true;
    }
}
