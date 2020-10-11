package dev.toma.vehiclemod.vehicle.entity;

import dev.toma.vehiclemod.Registries.VMSounds;
import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.VehicleStats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleBeamerS120 extends EntityVehicle {
	
	private VehicleSounds sounds;
	private static final String[] VARIANTS = {"beamer120_white","beamer120_orange","beamer120_magenta","beamer120_light_blue","beamer120_yellow","beamer120_lime","beamer120_pink","beamer120_gray","beamer120_silver","beamer120_cyan","beamer120_purple","beamer120_blue","beamer120_brown","beamer120_green","beamer120_red","beamer120_black"};
	private static final Vector3f[] PARTS = {new Vector3f(2.0f, 0.5f, 0f), new Vector3f(-2.0f, 0.15f, 0.47f)};
	
	public VehicleBeamerS120(World world) {
		super(world);
		setSize(2.0f, 1.5f);
		health = this.getStats().maxHealth;
	}
	
	public VehicleBeamerS120(World world, BlockPos pos) {
		this(world);
		setPosition(pos.getX(), pos.getY()+1, pos.getZ());
		health = getStats().maxHealth;
		setFuel();
	}

	@Override
	public VehicleContainer createInvetory() {
		return new VehicleContainer(this, 9);
	}

	@Override
	public double getMountedYOffset() {
		return -0.15;
	}

	@Override
	public int maximumAmountOfPassengers() {
		return 4;
	}

	@Override
	public SoundEvent getStartSound() {
		return VMSounds.BEAMER_START;
	}

	@Override
	public VehicleSounds getSounds() {
		initSounds();
		return sounds;
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
		sounds = VehicleSounds.Builder.create()
				.withAccelerateSound(VMSounds.BEAMER_ACC)
				.withBrakeSound(VMSounds.BEAMER_BRAKE)
				.withGasReleaseSound(VMSounds.BEAMER_GAS)
				.build(this);
	}
	
	@Override
	protected double getPassengerOffsetX(int id) {
		return id < 2 ? 0.6 : -0.3;
	}
	
	@Override
	protected double getPassengerOffsetZ(int id) {
		return id % 2 == 0 ? -0.4 : 0.4;
	}
}
