package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleTracerOutlander;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderTracerOutlander<V extends VehicleTracerOutlander, M extends ModelVehicle<V>> extends RenderVehicle<V> {

    final M model;

    public RenderTracerOutlander(RenderManager manager, M modelVehicle) {
        super(manager);
        this.model = modelVehicle;
    }

    @Override
    public ModelVehicle<V> getVehicleModel() {
        return model;
    }

    @Override
    public void prepareRender(V entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.055, 0.055, 0.055);
        GlStateManager.rotate(180F, 1F, 0F, 0F);
        GlStateManager.rotate(180F, 0F, 1F, 0F);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.translate(0, -25, 0);
    }
}
