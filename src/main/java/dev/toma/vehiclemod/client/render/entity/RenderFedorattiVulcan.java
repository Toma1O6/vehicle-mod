package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiVulcan;
import dev.toma.vehiclemod.client.model.vehicle.ModelFedorattiVulcan;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderFedorattiVulcan extends RenderVehicle<VehicleFedorattiVulcan> {

    private final ModelFedorattiVulcan model;

    public RenderFedorattiVulcan(RenderManager manager) {
        super(manager);
        this.model = new ModelFedorattiVulcan();
    }

    @Override
    public ModelVehicle<VehicleFedorattiVulcan> getVehicleModel() {
        return model;
    }

    @Override
    public void doRender(VehicleFedorattiVulcan entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        GlStateManager.color(1f, 1f, 1f);
        bindEntityTexture(entity);
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.035, 0.035, 0.035);
        GlStateManager.rotate(180F, 1F, 0F, 0F);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.translate(0, -17, 0);
        GlStateManager.disableLighting();
        model.render(entity);
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
