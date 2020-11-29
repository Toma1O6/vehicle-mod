package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleBeamerS320RS;
import dev.toma.vehiclemod.client.model.vehicle.ModelBeamerS320RS;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderBeamerS320RS extends RenderVehicle<VehicleBeamerS320RS> {

    private final ModelBeamerS320RS model = new ModelBeamerS320RS();

    public RenderBeamerS320RS(RenderManager manager) {
        super(manager);
    }

    @Override
    public ModelVehicle<VehicleBeamerS320RS> getVehicleModel() {
        return model;
    }

    @Override
    public void doRender(VehicleBeamerS320RS entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        bindEntityTexture(entity);
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.04, 0.043, 0.043);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.rotate(180f, 0, 1, 0);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.disableLighting();
        model.render(entity);
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
