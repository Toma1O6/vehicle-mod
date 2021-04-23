package dev.toma.vehiclemod.common.entity.vehicle.standart;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleSputnik3000L extends EntityVehicleStandart {

    public VehicleSputnik3000L(World world) {
        super(world);
    }

    public VehicleSputnik3000L(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.sputnik3000L;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.SPUTNIK3_ACC).brk(VMSounds.SPUTNIK3_BRAKE).rls(VMSounds.SPUTNIK3_GAS).str(VMSounds.SPUTNIK3_START).honk(VMSounds.HORN_11).starting(VMSounds.CAR_START_A).build();
    }
}
