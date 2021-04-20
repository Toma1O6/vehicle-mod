package dev.toma.vehiclemod.client.lights;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.model.ModelRenderer;

public class ReverseLights<V extends EntityVehicle> extends BasicLightEntry<V> {

    public ReverseLights(ModelRenderer... renderers) {
        super(1.0F, renderers);
    }

    @Override
    public boolean shouldApplyLight(V vehicle) {
        return vehicle != null && vehicle.getLightController().isReversing(vehicle);
    }
}
