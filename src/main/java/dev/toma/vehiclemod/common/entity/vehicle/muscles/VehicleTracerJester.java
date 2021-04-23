package dev.toma.vehiclemod.common.entity.vehicle.muscles;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleUpgrades;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleTracerJester extends EntityVehicleMuscles {

    public VehicleTracerJester(World world) {
        super(world);
    }

    public VehicleTracerJester(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 2);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.tracerJester;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.TRACER_JESTER_ACC).brk(VMSounds.TRACER_JESTER_BRAKE).rls(VMSounds.TRACER_JESTER_GAS).str(VMSounds.TRACER_JESTER_START).honk(VMSounds.HORN_8).starting(VMSounds.CAR_START_D).build();
    }
}
