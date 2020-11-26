package dev.toma.vehiclemod.proxy;

import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.tileentity.TileEntityMechanicPackage;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {}

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}

    public void playSoundAt(EntityVehicle vehicle) {}

    public void playNitroSound(EntityVehicle vehicle) {

    }

    public <L extends ILockpickable> void openLockpickUI(L lockpickable) {}
}
