package dev.toma.vehiclemod;

import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketInput;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VehicleMod.MODID, value = Dist.CLIENT)
public class VehicleInputHandler {
	
	@SubscribeEvent
	public static void onClientTick(TickEvent.ClientTickEvent e) {
		PlayerEntity player = Minecraft.getInstance().player;
		if(player != null) {
			GameSettings gs = Minecraft.getInstance().gameSettings;
			if(e.phase == TickEvent.Phase.END) {
				if(player.getRidingEntity() instanceof EntityVehicle) {

					((EntityVehicle)player.getRidingEntity()).updateInput(gs.keyBindForward.isKeyDown(), gs.keyBindBack.isKeyDown(),
							gs.keyBindRight.isKeyDown(), gs.keyBindLeft.isKeyDown(), player);
					VMNetworkManager.instance().sendToServer(new SPacketInput(gs.keyBindForward.isKeyDown(), 
							gs.keyBindBack.isKeyDown(), gs.keyBindRight.isKeyDown(), gs.keyBindLeft.isKeyDown()));
				}
			}
		}
	}
}
