package dev.toma.vehiclemod.vehicle;

import com.google.common.base.Preconditions;

import dev.toma.vehiclemod.VehicleMod;
import net.minecraft.util.ResourceLocation;

public class VehicleVariant {

	private final int id;
	private final ResourceLocation texture;
	
	private VehicleVariant(int index, ResourceLocation location) {
		this.id = index;
		this.texture = location;
	}
	
	public int getIndex() {
		return id;
	}
	
	public ResourceLocation getTexturePath() {
		return texture;
	}
	
	public static final class Builder {
		
		private ResourceLocation location;
		private int id;
		
		private Builder() {}
		
		public static Builder create() {
			return new Builder();
		}
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		
		public Builder texture(String vehicleName, String color) {
			ResourceLocation rl = new ResourceLocation(VehicleMod.Constants.ID + ":textures/vehicle/" + vehicleName + "_" + color + ".png");
			this.location = rl;
			return this;
		}
		
		public VehicleVariant build() {
			if(id < 0)
				throw new IllegalArgumentException("ID cannot be < 0");
			location = Preconditions.checkNotNull(location);
			return new VehicleVariant(id, location);
		}
	}
}
