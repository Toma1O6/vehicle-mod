package dev.toma.vehiclemod.proxy;

import dev.toma.vehiclemod.VehicleInputHandler;
import dev.toma.vehiclemod.client.gui.GuiMusicPlayer;
import dev.toma.vehiclemod.common.tileentity.TileEntityMusicPlayer;
import dev.toma.vehiclemod.vehicle.VMTickableSound;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicleBeamerS120;
import dev.toma.vehiclemod.vehicle.render.RenderBeamerS120;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
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
		/*handler.stopSound(sounds.idle);
		handler.stopSound(sounds.getAccelerateSound());
		handler.stopSound(sounds.getBrakeSound());
		handler.stopSound(sounds.getGasReleaseSound());*/
		SoundEvent event = v.getVehicleSound().event;
		handler.playSound(new VMTickableSound(event, v));
	}
	
	@Override
	public void displayGuiMusicPlayer(TileEntityMusicPlayer te, BlockPos pos) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiMusicPlayer(te, pos));
	}
	
	private static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityVehicleBeamerS120.class, RenderBeamerS120::new);
	}
}
