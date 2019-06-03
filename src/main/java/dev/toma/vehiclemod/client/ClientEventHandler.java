package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ClientEventHandler {
	
	public static void clientTick(TickEvent.ClientTickEvent e) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.player;
		SoundHandler sound = mc.getSoundHandler();
		if(player != null) {
			if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle) {
				EntityVehicle vehicle = (EntityVehicle)player.getRidingEntity();
				VehicleMod.proxy.playSoundAt(vehicle);
			}
		}
	}
}
