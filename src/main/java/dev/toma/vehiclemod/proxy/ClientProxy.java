package dev.toma.vehiclemod.proxy;

import dev.toma.vehiclemod.VehicleInputHandler;
import dev.toma.vehiclemod.vehicle.VMTickableSound;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.entity.*;
import dev.toma.vehiclemod.vehicle.model.ModelProtonP1;
import dev.toma.vehiclemod.vehicle.model.ModelProtonP1Tunned;
import dev.toma.vehiclemod.vehicle.render.*;
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
		VehicleSounds sounds = v.getSounds();
		SoundEvent event = v.getVehicleSound().event;
		if(v.currentSound != null && handler.isSoundPlaying(v.currentSound)) {
			handler.stopSound(v.currentSound);
		}
		VMTickableSound sound = new VMTickableSound(event, v);
		v.currentSound = sound;
		handler.playSound(sound);
	}

	private static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(VehicleBeamerS120.class, RenderBeamerS120::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleFedorattiVulcan.class, RenderFedorattiVulcan::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleTracerT1.class, RenderTracerT1::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnik2000L.class, RenderSputnik2000L::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleBeamerS320RS.class, RenderBeamerS320RS::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleMCGMultiVan.class, RenderMCGMultiVan::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleBeamerPickup.class, RenderBeamerPickup::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnik3000L.class, RenderSputnik3000L::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnik3000LEnforcer.class, RenderSputnik3000LEnforcer::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnikDuster.class, RenderSputnikDuster::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleFedorattiNightStalker.class, RenderFedorattiNightStalker::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleProtonP1.class, manager -> new RenderProtonP1<>(manager, new ModelProtonP1()));
		RenderingRegistry.registerEntityRenderingHandler(VehicleProtonP1Tunned.class, manager -> new RenderProtonP1<>(manager, new ModelProtonP1Tunned()));
	}
}
