package dev.toma.vehiclemod.vehicle.entity;

import javax.vecmath.Vector3f;

import dev.toma.vehiclemod.vehicle.VehicleVariant;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public abstract class EntityVehicle extends Entity implements IEntityAdditionalSpawnData {
	
	public EntityVehicle(World world) {
		super(world);
	}
	
	public EntityVehicle(World world, BlockPos pos) {
		this(world);
	}
	
	public abstract VehicleVariant[] getVariants();
	
	public abstract Vector3f[] getPartVecs();
	
	public void updateVehicle() {
		
	}
}
