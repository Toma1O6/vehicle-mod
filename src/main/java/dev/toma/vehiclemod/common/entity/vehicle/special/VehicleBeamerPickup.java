package dev.toma.vehiclemod.common.entity.vehicle.special;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleBeamerPickup extends EntityVehicleSpecial {

    public VehicleBeamerPickup(World world) {
        super(world);
    }

    public VehicleBeamerPickup(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected void setSize() {
        setSize(1.5F, 2.0F);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 36);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.beamerPickup;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.BEAMERPICKUP_ACC).brk(VMSounds.BEAMERPICKUP_BRAKE).rls(VMSounds.BEAMERPICKUP_GAS).str(VMSounds.BEAMERPICKUP_START).honk(VMSounds.HORN_9).starting(VMSounds.CAR_START_E).build();
    }
}
