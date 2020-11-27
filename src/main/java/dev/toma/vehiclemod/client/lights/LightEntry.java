package dev.toma.vehiclemod.client.lights;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.model.ModelRenderer;

import javax.annotation.Nullable;

public interface LightEntry<V extends EntityVehicle> {

    int getLightmapX();

    int getLightmapY();

    void setLightmapX(int x);

    void setLightmapY(int y);

    ModelRenderer[] getModels();

    boolean shouldApplyLight(@Nullable V vehicle);
}
