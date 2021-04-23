package dev.toma.vehiclemod.common.entity.vehicle.sport;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleUpgrades;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleBeamerS320RS extends EntityVehicleSport {

    public VehicleBeamerS320RS(World world) {
        super(world);
    }

    public VehicleBeamerS320RS(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 2);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.beamers320rs;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.BEAMERB1_ACC).brk(VMSounds.BEAMERB1_BRAKE).rls(VMSounds.BEAMERB1_GAS).str(VMSounds.BEAMERB1_START).honk(VMSounds.HORN_13).starting(VMSounds.CAR_START_C).build();
    }
}
