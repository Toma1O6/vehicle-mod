package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.LightEntry;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.OpenGlHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ModelVehicle<V extends EntityVehicle> extends ModelBase {

	private final List<LightEntry<V>> lights = new ArrayList<>();

	@SafeVarargs
	public final void registerLightEntries(LightEntry<V>... entries) {
		lights.addAll(Arrays.asList(entries));
	}

	public final void render(V vehicle) {
		this.renderModel();
		for (LightEntry<V> entry : lights) {
			if(entry.shouldApplyLight(vehicle)) {
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, entry.getLightmapX(), entry.getLightmapY());
			} else OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 0, 0);
			for (ModelRenderer renderer : entry.getModels())
				renderer.render(1.0F);
		}
	}

	protected abstract void renderModel();
	
	public static void setRotationAngle(ModelRenderer renderer, float x, float y, float z) {
		renderer.rotateAngleX = x;
		renderer.rotateAngleY = y;
		renderer.rotateAngleZ = z;
	}
}
