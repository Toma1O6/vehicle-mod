package dev.toma.vehiclemod.proxy;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy {

	void preInit(FMLPreInitializationEvent e);
	
	void init(FMLInitializationEvent e);
	
	void postInit(FMLPostInitializationEvent e);
	
	void playSoundAt(EntityVehicle v);
}
