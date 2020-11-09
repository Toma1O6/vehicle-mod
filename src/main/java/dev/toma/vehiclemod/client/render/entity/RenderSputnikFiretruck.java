package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelSputnikFiretruck;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.special.VehicleSputnikFiretruck;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderSputnikFiretruck extends RenderVehicle<VehicleSputnikFiretruck> {

    private final ModelVehicle model;

    public RenderSputnikFiretruck(RenderManager manager) {
        super(manager);
        this.model = new ModelSputnikFiretruck();
    }

    @Override
    public ModelVehicle getVehicleModel() {
        return model;
    }

    @Override
    public void doRender(VehicleSputnikFiretruck entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        bindEntityTexture(entity);
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.045, 0.045, 0.045);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.disableLighting();
        model.doVehicleRender();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
