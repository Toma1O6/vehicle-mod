package dev.toma.vehiclemod.vehicle.render;

import dev.toma.vehiclemod.vehicle.entity.VehicleFedorattiNightStalker;
import dev.toma.vehiclemod.vehicle.model.ModelFedorattiNightStalker;
import dev.toma.vehiclemod.vehicle.model.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderFedorattiNightStalker extends RenderVehicle<VehicleFedorattiNightStalker> {

    final ModelFedorattiNightStalker modelFedorattiNightStalker;

    public RenderFedorattiNightStalker(RenderManager manager) {
        super(manager);
        this.modelFedorattiNightStalker = new ModelFedorattiNightStalker();
    }

    @Override
    public ModelVehicle getVehicleModel() {
        return modelFedorattiNightStalker;
    }

    @Override
    public void doRender(VehicleFedorattiNightStalker entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        bindEntityTexture(entity);
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.06, 0.06, 0.06);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.rotate(180f, 0f, 1f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.disableLighting();
        getVehicleModel().doVehicleRender();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
