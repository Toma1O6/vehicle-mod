package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelFedorattiVulcan;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiVulcan;
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
    public void prepareRender(VehicleFedorattiVulcan entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.035, 0.035, 0.035);
        GlStateManager.rotate(180F, 1F, 0F, 0F);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.translate(0, -17, 0);
    }
}
