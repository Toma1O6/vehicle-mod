package dev.toma.vehiclemod.vehicle.entity;

import javax.vecmath.Vector3f;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.Registries.VMSounds;
import dev.toma.vehiclemod.vehicle.VMTickableSound;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityVehicleBeamerS120 extends EntityVehicle {
	
	private static VehicleSounds sounds;
	private static final String[] VARIANTS = {"beamer120_black","beamer120_blue","beamer120_brown","beamer120_green","beamer120_grey","beamer120_light_blue","beamer120_orange","beamer120_red","beamer120_white","beamer120_yellow"};
	private static final Vector3f[] PARTS = {};
	
	public EntityVehicleBeamerS120(World world) {
		super(world);
		setSize(2.0f, 1.5f);
		health = this.getStats().maxHealth;
	}
	
	public EntityVehicleBeamerS120(World world, BlockPos pos) {
		this(world);
		setPosition(pos.getX(), pos.getY()+1, pos.getZ());
		health = getStats().maxHealth;
		setFuel();
	}
	
	@Override
	public int maximumAmountOfPassengers() {
		return 4;
	}
	
	@Override
	public VehicleSounds getSounds() {
		return sounds;
	}
	
	@Override
	public String[] getVariants() {
		return VARIANTS;
	}
	
	@Override
	public Vector3f[] getPartVecs() {
		return PARTS;
	}
	
	@Override
	public VehicleStats getStats() {
		return VMConfig.beamer_s120;
	}
	
	@Override
	public void initSounds() {
		sounds = new VehicleSounds(
				new VMTickableSound(VMSounds.VEHICLE_IDLE, this),
				new VMTickableSound(VMSounds.VEHICLE_IDLE, this),
				new VMTickableSound(VMSounds.VEHICLE_IDLE, this),
				new VMTickableSound(VMSounds.VEHICLE_IDLE, this)
		);
	}
}
