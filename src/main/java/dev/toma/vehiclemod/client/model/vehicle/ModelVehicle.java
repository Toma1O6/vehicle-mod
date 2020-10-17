package dev.toma.vehiclemod.client.model.vehicle;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public abstract class ModelVehicle extends ModelBase {
	
	public abstract void doVehicleRender();
	
	public static void setRotationAngle(ModelRenderer renderer, float x, float y, float z) {
		renderer.rotateAngleX = x;
		renderer.rotateAngleY = y;
		renderer.rotateAngleZ = z;
	}
}
