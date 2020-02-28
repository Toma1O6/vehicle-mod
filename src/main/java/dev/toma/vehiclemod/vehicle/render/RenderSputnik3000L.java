package dev.toma.vehiclemod.vehicle.render;

import dev.toma.vehiclemod.vehicle.entity.VehicleSputnik3000L;
import dev.toma.vehiclemod.vehicle.model.ModelSputnik3000L;
import dev.toma.vehiclemod.vehicle.model.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderSputnik3000L<T extends VehicleSputnik3000L> extends RenderVehicle<T> {

    private final ModelSputnik3000L model = new ModelSputnik3000L();

    public RenderSputnik3000L(RenderManager manager) {
        super(manager);
    }

    @Override
    public ModelVehicle getVehicleModel() {
        return model;
    }

    @Override
    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        bindEntityTexture(entity);
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.045, 0.045, 0.045);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.rotate(180f, 0, 1, 0);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.disableLighting();
        getVehicleModel().doVehicleRender();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
