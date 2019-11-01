package dev.toma.vehiclemod.vehicle.render;

import dev.toma.vehiclemod.vehicle.entity.VehicleSputnik2000L;
import dev.toma.vehiclemod.vehicle.model.ModelSputnik2000L;
import dev.toma.vehiclemod.vehicle.model.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderSputnik2000L extends RenderVehicle<VehicleSputnik2000L> {

    private final ModelSputnik2000L sputnik2000L;

    public RenderSputnik2000L(RenderManager manager) {
        super(manager);
        this.sputnik2000L = new ModelSputnik2000L();
    }

    @Override
    public ModelVehicle getVehicleModel() {
        return sputnik2000L;
    }

    @Override
    public void doRender(VehicleSputnik2000L entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        GlStateManager.color(1f, 1f, 1f);
        bindEntityTexture(entity);
        GlStateManager.translate(x, y, z);
        GlStateManager.scale(0.035, 0.035, 0.035);
        GlStateManager.rotate(180F, 1F, 0F, 0F);
        GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
        GlStateManager.translate(0, -20, 0);
        GlStateManager.disableLighting();
        sputnik2000L.doVehicleRender();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
