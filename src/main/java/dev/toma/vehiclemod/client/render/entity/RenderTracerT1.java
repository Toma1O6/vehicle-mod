package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelTracerT1;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleTracerT1;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderTracerT1 extends RenderVehicle<VehicleTracerT1> {

    private final ModelTracerT1 model;

    public RenderTracerT1(RenderManager manager) {
        super(manager);
        this.model = new ModelTracerT1();
    }

    @Override
    public ModelVehicle<VehicleTracerT1> getVehicleModel() {
        return model;
    }

    @Override
    public void prepareRender(VehicleTracerT1 entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.rotate(180F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.035F, 0.035F, 0.035F);
        GlStateManager.translate(0, -8, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
    }
}
