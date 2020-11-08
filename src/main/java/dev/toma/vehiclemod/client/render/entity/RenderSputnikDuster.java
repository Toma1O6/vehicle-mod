package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleSputnikDuster;
import dev.toma.vehiclemod.client.model.vehicle.ModelSputnikDuster;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderSputnikDuster extends RenderVehicle<VehicleSputnikDuster> {

    final ModelSputnikDuster duster;

    public RenderSputnikDuster(RenderManager manager) {
        super(manager);
        this.duster = new ModelSputnikDuster();
    }

    @Override
    public ModelVehicle getVehicleModel() {
        return duster;
    }

    @Override
    public void doRender(VehicleSputnikDuster entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        bindEntityTexture(entity);
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.06, 0.06, 0.06);
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
