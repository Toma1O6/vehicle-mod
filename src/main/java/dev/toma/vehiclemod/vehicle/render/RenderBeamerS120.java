package dev.toma.vehiclemod.vehicle.render;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicleBeamerS120;
import dev.toma.vehiclemod.vehicle.model.ModelBeamerS120;
import dev.toma.vehiclemod.vehicle.model.ModelVehicle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;

public class RenderBeamerS120 extends RenderVehicle<EntityVehicleBeamerS120> {
	
	private final ModelBeamerS120 model = new ModelBeamerS120();
	
	public RenderBeamerS120(RenderManager manager) {
		super(manager);
	}
	
	@Override
	public ModelVehicle getVehicleModel() {
		return model;
	}
	
	@Override
	public void doRender(EntityVehicleBeamerS120 entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GlStateManager.pushMatrix();
		bindEntityTexture(entity);
		GlStateManager.translate(x, y, z);
		GlStateManager.scale(0.05, 0.05, 0.05);
		GlStateManager.rotate(180f, 1f, 0f, 0f);
		GlStateManager.translate(0, -5, 0);
		GlStateManager.rotate(entity.rotationYaw, 0f, 1f, 0f);
		model.doVehicleRender();
		GlStateManager.popMatrix();
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
}
