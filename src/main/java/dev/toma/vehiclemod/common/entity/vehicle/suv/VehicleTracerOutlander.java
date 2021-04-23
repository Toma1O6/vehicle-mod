package dev.toma.vehiclemod.common.entity.vehicle.suv;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleTracerOutlander extends EntityVehicleSUV {

    public VehicleTracerOutlander(World world) {
        super(world);
    }

    public VehicleTracerOutlander(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 18);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.tracerOutlander;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.TRACER_OUTLANDER_ACC).brk(VMSounds.TRACER_OUTLANDER_BRAKE).rls(VMSounds.TRACER_OUTLANDER_GAS).str(VMSounds.TRACER_OUTLANDER_START).starting(VMSounds.CAR_START_D).honk(VMSounds.HORN_2).build();
    }
}
