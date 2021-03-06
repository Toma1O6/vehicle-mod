package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.common.entity.vehicle.special.VehicleBeamerPickup;
import dev.toma.vehiclemod.client.model.vehicle.ModelBeamerPickup;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderBeamerPickup extends RenderVehicle<VehicleBeamerPickup> {

    private final ModelBeamerPickup model = new ModelBeamerPickup();

    public RenderBeamerPickup(RenderManager manager) {
        super(manager);
    }

    @Override
    public ModelVehicle<VehicleBeamerPickup> getVehicleModel() {
        return model;
    }

    @Override
    public void prepareRender(VehicleBeamerPickup entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.045, 0.045, 0.045);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
    }
}
