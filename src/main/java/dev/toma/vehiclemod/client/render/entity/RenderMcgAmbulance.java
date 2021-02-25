package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelMcgAmbulance;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.VehicleTexture;
import dev.toma.vehiclemod.common.entity.vehicle.special.VehicleMcgAmbulance;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMcgAmbulance extends RenderVehicle<VehicleMcgAmbulance> {

    private final ModelMcgAmbulance model;

    public RenderMcgAmbulance(RenderManager manager) {
        super(manager);
        this.model = new ModelMcgAmbulance();
    }

    @Override
    public ModelVehicle<VehicleMcgAmbulance> getVehicleModel() {
        return model;
    }

    @Override
    protected ResourceLocation getDefaultResource() {
        return VehicleTexture.RED.getResource();
    }

    @Override
    public void prepareRender(VehicleMcgAmbulance entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.06, 0.06, 0.06);
        GlStateManager.rotate(180f, 1f, 0f, 0f);
        GlStateManager.translate(0, -24, 0);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
    }
}
