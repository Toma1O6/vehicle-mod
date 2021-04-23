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

public class VehicleProtonP9X extends EntityVehicleSport {

    public VehicleProtonP9X(World world) {
        super(world);
    }

    public VehicleProtonP9X(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    protected VehicleUpgrades createVehicleUpgrades() {
        return new VehicleUpgrades(this, 3);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.protonP9X;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.PROTON_P9X_ACC).brk(VMSounds.PROTON_P9X_BRAKE).rls(VMSounds.PROTON_P9X_GAS).str(VMSounds.PROTON_P9X_START).starting(VMSounds.CAR_START_G).honk(VMSounds.HORN_1).build();
    }
}
