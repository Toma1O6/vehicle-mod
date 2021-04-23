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

public class VehicleFedorattiVulcan extends EntityVehicleSuperSport {

    public VehicleFedorattiVulcan(World world) {
        super(world);
    }

    public VehicleFedorattiVulcan(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 5);
    }

    @Override
    protected VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 4);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.fedoratti_vulcan;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.FEDORATTI_ACC).brk(VMSounds.FEDORATTI_BRAKE).rls(VMSounds.FEDORATTI_GAS).str(VMSounds.FEDORATTI_START).honk(VMSounds.HORN_2).starting(VMSounds.CAR_START_F).build();
    }
}
