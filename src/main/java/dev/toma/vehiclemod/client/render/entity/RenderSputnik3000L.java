package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderSputnik3000L<T extends EntityVehicle, M extends ModelVehicle<T>> extends RenderVehicle<T> {

    private final M model;

    public RenderSputnik3000L(RenderManager manager, M model) {
        super(manager);
        this.model = model;
    }

    @Override
    public ModelVehicle<T> getVehicleModel() {
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
        getVehicleModel().render(entity);
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
