package dev.toma.vehiclemod.common.entity.vehicle.suv;

import dev.toma.vehiclemod.client.VehicleSoundPack;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleContainer;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleStyle;
import dev.toma.vehiclemod.config.VehicleConfig;
import dev.toma.vehiclemod.config.VehicleProperties;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VehicleSputnikDuster extends EntityVehicleSUV {

    public VehicleSputnikDuster(World world) {
        super(world);
    }

    public VehicleSputnikDuster(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    protected void setSize() {
        setSize(2.0F, 1.75F);
    }

    @Override
    protected VehicleContainer createInventory() {
        return new VehicleContainer(this, 18);
    }

    @Override
    protected VehicleProperties getPropertiesInstance(VehicleConfig config) {
        return config.sputnikDuster;
    }

    @Override
    protected VehicleStyle instantiateStyle() {
        return new VehicleStyle(getClass());
    }

    @Override
    protected VehicleSoundPack instantiateSoundPack(VehicleSoundPack.Builder builder) {
        return builder.acc(VMSounds.SPUTNIK_DUSTER_ACC).brk(VMSounds.SPUTNIK_DUSTER_BRAKE).rls(VMSounds.SPUTNIK_DUSTER_GAS).str(VMSounds.SPUTNIK_DUSTER_START).honk(VMSounds.HORN_8).starting(VMSounds.CAR_START_D).build();
    }
}
