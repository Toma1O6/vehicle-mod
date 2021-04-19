package dev.toma.vehiclemod.client.lights;

import net.minecraft.client.model.ModelRenderer;

public class BrakeLights<V extends EntityVehicle> extends BasicLightEntry<V> {

    public BrakeLights(ModelRenderer... renderers) {
        super(1.0F, renderers);
    }

    @Override
    public boolean shouldApplyLight(V vehicle) {
        return vehicle != null && vehicle.lightController.isBraking(vehicle);
    }
}
