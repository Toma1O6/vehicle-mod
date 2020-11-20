package dev.toma.vehiclemod.common.entity.vehicle.muscles;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.vecmath.Vector3f;

public class VehicleBeamerS120 extends EntityVehicleMuscles {

	private static final Vector3f[] PARTS = {new Vector3f(2.0f, 0.5f, 0f), new Vector3f(-2.0f, 0.15f, 0.47f)};
	
	public VehicleBeamerS120(World world) {
		super(world);
	}
	
	public VehicleBeamerS120(World world, BlockPos pos) {
		super(world, pos);
	}

	@Override
	public VehicleContainer createInvetory() {
		return new VehicleContainer(this, 9);
	}

	@Override
	public VehicleSoundPack createSoundPack() {
		return VehicleSoundPack.Builder.create(this)
				.acc(VMSounds.BEAMER_ACC)
				.brk(VMSounds.BEAMER_BRAKE)
				.rls(VMSounds.BEAMER_GAS)
				.str(VMSounds.BEAMER_START)
				.honk(VMSounds.HORN_3)
				.build();
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
	public Vector3f[] getPartVecs() {
		return PARTS;
	}
	
	@Override
	public VehicleStats getConfigStats() {
		return VMConfig.beamer_s120;
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
