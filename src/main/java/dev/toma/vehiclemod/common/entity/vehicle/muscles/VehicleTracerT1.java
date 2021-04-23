package dev.toma.vehiclemod.common.entity.vehicle.muscles;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.NeonHandler;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleUpgrades;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleTracerT1 extends EntityVehicleMuscles {

    public VehicleTracerT1(World world) {
        super(world);
    }

    public VehicleTracerT1(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    protected VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 1);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.tracer_t1;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.TRACER_ACC).brk(VMSounds.TRACER_BRAKE).rls(VMSounds.TRACER_GAS).str(VMSounds.TRACER_START).honk(VMSounds.HORN_11).starting(VMSounds.CAR_START_D).build();
    }
}
