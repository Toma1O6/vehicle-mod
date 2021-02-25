package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelMcgFiretruck;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.common.entity.vehicle.special.VehicleMcgFiretruck;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMcgFiretruck extends RenderVehicle<VehicleMcgFiretruck> {

    private final ModelMcgFiretruck model;

    public RenderMcgFiretruck(RenderManager manager) {
        super(manager);
        this.model = new ModelMcgFiretruck();
    }

    @Override
    protected ResourceLocation getDefaultResource() {
        return VehicleTexture.RED.getResource();
    }

    @Override
    public ModelVehicle<VehicleMcgFiretruck> getVehicleModel() {
        return model;
    }

    @Override
    public void prepareRender(VehicleMcgFiretruck entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.06, 0.06, 0.06);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
    }
}
