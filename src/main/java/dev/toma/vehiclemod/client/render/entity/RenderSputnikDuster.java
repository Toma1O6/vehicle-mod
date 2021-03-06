package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelSputnikDuster;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleSputnikDuster;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderSputnikDuster extends RenderVehicle<VehicleSputnikDuster> {

    final ModelSputnikDuster duster;

    public RenderSputnikDuster(RenderManager manager) {
        super(manager);
        this.duster = new ModelSputnikDuster();
    }

    @Override
    public ModelVehicle<VehicleSputnikDuster> getVehicleModel() {
        return duster;
    }

    @Override
    public void prepareRender(VehicleSputnikDuster entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.06, 0.06, 0.06);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
    }
}
