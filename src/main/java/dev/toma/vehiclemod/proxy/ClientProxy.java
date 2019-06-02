package dev.toma.vehiclemod.proxy;

import dev.toma.vehiclemod.VehicleInputHandler;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicleBeamerS120;
import dev.toma.vehiclemod.vehicle.render.RenderBeamerS120;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new VehicleInputHandler());
		registerEntityRenderers();
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
		RenderingRegistry.registerEntityRenderingHandler(EntityVehicleBeamerS120.class, RenderBeamerS120::new);
	}
}
