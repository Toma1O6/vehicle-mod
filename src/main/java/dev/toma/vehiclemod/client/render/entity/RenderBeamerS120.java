package dev.toma.vehiclemod.client.render.entity;

import dev.toma.vehiclemod.client.model.vehicle.ModelBeamerS120;
import dev.toma.vehiclemod.client.model.vehicle.ModelVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleBeamerS120;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderBeamerS120 extends RenderVehicle<VehicleBeamerS120> {
	
	private final ModelBeamerS120 model = new ModelBeamerS120();
	
	public RenderBeamerS120(RenderManager manager) {
		super(manager);
	}
	
	@Override
	public ModelVehicle<VehicleBeamerS120> getVehicleModel() {
		return model;
	}

	@Override
	public void prepareRender(VehicleBeamerS120 entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GlStateManager.translate(x, y, z);
		GlStateManager.scale(0.035, 0.035, 0.035);
		GlStateManager.rotate(180f, 1f, 0f, 0f);
		GlStateManager.translate(0, -5, 0);
		GlStateManager.rotate(entityYaw, 0f, 1f, 0f);
	}
}
