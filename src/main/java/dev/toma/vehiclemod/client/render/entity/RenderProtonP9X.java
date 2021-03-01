package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP9X;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderProtonP9X<V extends VehicleProtonP9X, M extends ModelVehicle<V>> extends RenderVehicle<V> {

    final M model;

    public RenderProtonP9X(RenderManager manager, M model) {
        super(manager);
        this.model = model;
    }

    @Override
    public ModelVehicle<V> getVehicleModel() {
        return model;
    }

    @Override
    public void prepareRender(V entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.050, 0.053, 0.053);
        GlStateManager.rotate(180F, 1F, 0F, 0F);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.translate(0, -25, 0);
    }
}
