package dev.toma.vehiclemod.proxy;

import dev.toma.vehiclemod.client.VMKeybinds;
import dev.toma.vehiclemod.client.VMTickableSound;
import dev.toma.vehiclemod.client.VehicleInputHandler;
import dev.toma.vehiclemod.client.gui.GuiLockpicking;
import dev.toma.vehiclemod.client.model.vehicle.ModelProtonP1;
import dev.toma.vehiclemod.client.model.vehicle.ModelProtonP1Tunned;
import dev.toma.vehiclemod.client.model.vehicle.ModelSputnik3000L;
import dev.toma.vehiclemod.client.model.vehicle.ModelSputnik3000LEnforcer;
import dev.toma.vehiclemod.client.render.entity.*;
import dev.toma.vehiclemod.common.ILockpickable;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleBeamerS120;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleTracerT1;
import dev.toma.vehiclemod.common.entity.vehicle.special.*;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleBeamerS320RS;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP1Tunned;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleProtonP1;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik2000L;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik3000L;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiNightStalker;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiVulcan;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleSputnikDuster;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new VehicleInputHandler());
		VMKeybinds.init();
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
		SoundEvent event = v.getVehicleSound();
		if(v.currentSound != null && handler.isSoundPlaying(v.currentSound)) {
			handler.stopSound(v.currentSound);
		}
		if(event == null) {
			return;
		}
		VMTickableSound sound = new VMTickableSound(event, v);
		v.currentSound = sound;
		handler.playSound(sound);
	}

	@Override
	public <L extends ILockpickable> void openLockpickUI(L lockpickable) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiLockpicking<>(lockpickable));
	}

	private static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(VehicleBeamerS120.class, RenderBeamerS120::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleFedorattiVulcan.class, RenderFedorattiVulcan::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleTracerT1.class, RenderTracerT1::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnik2000L.class, RenderSputnik2000L::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleBeamerS320RS.class, RenderBeamerS320RS::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleMCGMultiVan.class, RenderMCGMultiVan::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleBeamerPickup.class, RenderBeamerPickup::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnik3000L.class, manager -> new RenderSputnik3000L<>(manager, new ModelSputnik3000L()));
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnik3000LEnforcer.class, manager -> new RenderSputnik3000L<>(manager, new ModelSputnik3000LEnforcer()));
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnikDuster.class, RenderSputnikDuster::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleFedorattiNightStalker.class, RenderFedorattiNightStalker::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleProtonP1.class, manager -> new RenderProtonP1<>(manager, new ModelProtonP1()));
		RenderingRegistry.registerEntityRenderingHandler(VehicleProtonP1Tunned.class, manager -> new RenderProtonP1<>(manager, new ModelProtonP1Tunned()));
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnikAmbulance.class, RenderSputnikAmbulance::new);
		RenderingRegistry.registerEntityRenderingHandler(VehicleSputnikFiretruck.class, RenderSputnikFiretruck::new);
	}
}
