package dev.toma.vehiclemod.proxy;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
	@Override
	public void playSoundAt(EntityVehicle v) {
		SoundHandler handler = Minecraft.getMinecraft().getSoundHandler();
		if(!handler.isSoundPlaying(v.getVehicleSound())) {
			v.getSounds().stopPlaying();
			handler.playSound(v.getVehicleSound());
		}
	}
	
	private static void registerEntityRenderers() {
		
	}
}
