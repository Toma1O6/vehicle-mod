package dev.toma.vehiclemod.common.entity.vehicle.muscles;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.PositionManager;
import dev.toma.vehiclemod.config.VMConfig;
import dev.toma.vehiclemod.config.VehicleStats;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleBeamerS120 extends EntityVehicleMuscles {

	private static final PositionManager POSITIONS = PositionManager.Builder.create().engine(2, 0.75, 0).exhaust(-2, 0.4, 0.47).build();
	
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
				.starting(VMSounds.CAR_START_D)
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
	public PositionManager getVehiclePositions() {
		return POSITIONS;
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
