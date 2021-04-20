package dev.toma.vehiclemod.client.lights;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.model.ModelRenderer;

public class LightControllerEntry<V extends EntityVehicle> extends BasicLightEntry<V> {

    public LightControllerEntry(float intensity, ModelRenderer... renderers) {
        super(intensity, renderers);
    }

    @Override
    public boolean shouldApplyLight(V vehicle) {
        return vehicle != null && vehicle.getLightController().areLightsOn(vehicle);
    }
}
