package dev.toma.vehiclemod.client.lights;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.model.ModelRenderer;

import javax.annotation.Nullable;

public interface LightEntry<V extends EntityVehicle> {

    static <V extends EntityVehicle> LightEntry<V> createBasic(float intensity, ModelRenderer... renderers) {
        return new BasicLightEntry<>(intensity, renderers);
    }

    static <V extends EntityVehicle> LightEntry<V> createLights(float intensity, ModelRenderer... renderers) {
        return new LightControllerEntry<>(intensity, renderers);
    }

    int getLightmapX();

    int getLightmapY();

    void setLightmapX(int x);

    void setLightmapY(int y);

    ModelRenderer[] getModels();

    boolean shouldApplyLight(@Nullable V vehicle);
}
