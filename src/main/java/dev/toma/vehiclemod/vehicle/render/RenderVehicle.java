package dev.toma.vehiclemod.vehicle.render;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import dev.toma.vehiclemod.vehicle.model.ModelVehicle;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public abstract class RenderVehicle<E extends EntityVehicle> extends Render<E> {

	private ResourceLocation location;
	
	public RenderVehicle(RenderManager manager) {
		super(manager);
	}
	
	public abstract ModelVehicle getVehicleModel();
	
	@Override
	protected ResourceLocation getEntityTexture(E entity) {
		return entity.getTextures().get(entity.getVariantType());
	}
}
