package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik2000L;
import dev.toma.vehiclemod.client.model.vehicle.ModelSputnik2000L;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderSputnik2000L extends RenderVehicle<VehicleSputnik2000L> {

    private final ModelSputnik2000L sputnik2000L;

    public RenderSputnik2000L(RenderManager manager) {
        super(manager);
        this.sputnik2000L = new ModelSputnik2000L();
    }

    @Override
    public ModelVehicle<VehicleSputnik2000L> getVehicleModel() {
        return sputnik2000L;
    }

    @Override
    public void prepareRender(VehicleSputnik2000L entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.03, 0.03, 0.03);
        GlStateManager.rotate(180F, 1F, 0F, 0F);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.translate(0, -20, 0);
    }
}
