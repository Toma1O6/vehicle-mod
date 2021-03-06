package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelMCGMultiVan;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.special.VehicleMCGMultiVan;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderMCGMultiVan extends RenderVehicle<VehicleMCGMultiVan> {

    private final ModelMCGMultiVan model = new ModelMCGMultiVan();

    public RenderMCGMultiVan(RenderManager manager) {
        super(manager);
    }

    @Override
    public ModelVehicle<VehicleMCGMultiVan> getVehicleModel() {
        return model;
    }

    @Override
    public void prepareRender(VehicleMCGMultiVan entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.045, 0.045, 0.045);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
    }
}
