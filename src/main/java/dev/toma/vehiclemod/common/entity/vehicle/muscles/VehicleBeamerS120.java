package dev.toma.vehiclemod.common.entity.vehicle.muscles;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleBeamerS120 extends EntityVehicleMuscles {

    public VehicleBeamerS120(World world) {
        super(world);
    }

    public VehicleBeamerS120(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 9);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.beamer_s120;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(this.getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.BEAMER_ACC).brk(VMSounds.BEAMER_BRAKE).rls(VMSounds.BEAMER_GAS).str(VMSounds.BEAMER_START).honk(VMSounds.HORN_3).starting(VMSounds.CAR_START_D).build();
    }
}
