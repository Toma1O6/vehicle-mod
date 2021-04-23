package dev.toma.vehiclemod.common.entity.vehicle.supersport;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleUpgrades;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleFedorattiNightStalker extends EntityVehicleSuperSport {

    public VehicleFedorattiNightStalker(World world) {
        super(world);
    }

    public VehicleFedorattiNightStalker(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 5);
    }

    @Override
    protected VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 5);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.fedorattiNightStalker;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.FEDORATTI_NIGHTSTALKER_ACC).brk(VMSounds.FEDORATTI_NIGHTSTALKER_BRAKE).rls(VMSounds.FEDORATTI_NIGHTSTALKER_GAS).str(VMSounds.FEDORATTI_NIGHTSTALKER_START).honk(VMSounds.HORN_5).starting(VMSounds.CAR_START_B).build();
    }
}
