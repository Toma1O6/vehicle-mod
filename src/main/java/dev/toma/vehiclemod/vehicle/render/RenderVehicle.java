package dev.toma.vehiclemod.vehicle.render;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public abstract class RenderVehicle<E extends EntityVehicle> extends Render<E> {
	
	public int textureVariant = -1;
	
	public RenderVehicle(RenderManager manager) {
		super(manager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(E entity) {
		if(textureVariant == -1) {
			textureVariant = initVariant(entity);
		}
		return entity.getVariants()[textureVariant].getTexturePath();
	}
	
	protected int initVariant(E vehicle) {
		return VehicleMod.getRNG().nextInt(vehicle.getVariants().length);
	}
}
