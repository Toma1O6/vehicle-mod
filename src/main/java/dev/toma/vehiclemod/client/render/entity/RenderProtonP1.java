package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderProtonP1<V extends EntityVehicle, M extends ModelVehicle<V>> extends RenderVehicle<V> {

    final M model;

    public RenderProtonP1(RenderManager manager, M model) {
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
        GlStateManager.scale(0.06, 0.06, 0.06);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
    }
}
