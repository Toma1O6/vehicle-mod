package dev.toma.vehiclemod.vehicle.render;

import dev.toma.vehiclemod.vehicle.entity.VehicleProtonP1;
import dev.toma.vehiclemod.vehicle.model.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderProtonP1<V extends VehicleProtonP1, M extends ModelVehicle> extends RenderVehicle<V> {

    final M model;

    public RenderProtonP1(RenderManager manager, M model) {
        super(manager);
        this.model = model;
    }

    @Override
    public ModelVehicle getVehicleModel() {
        return model;
    }

    @Override
    public void doRender(V entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        bindEntityTexture(entity);
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.07, 0.07, 0.07);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.disableLighting();
        getVehicleModel().doVehicleRender();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
