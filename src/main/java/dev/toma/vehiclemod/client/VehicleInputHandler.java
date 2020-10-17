package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketInput;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class VehicleInputHandler {
	
	@SubscribeEvent
	public void onClientTick(TickEvent.ClientTickEvent e) {
		EntityPlayer player = Minecraft.getMinecraft().player;
		if(player != null) {
			GameSettings gs = Minecraft.getMinecraft().gameSettings;
			if(e.phase == Phase.END) {
				if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle) {

					((EntityVehicle)player.getRidingEntity()).updateInput(gs.keyBindForward.isKeyDown(), gs.keyBindBack.isKeyDown(),
							gs.keyBindRight.isKeyDown(), gs.keyBindLeft.isKeyDown(), player);
					VMNetworkManager.instance().sendToServer(new SPacketInput(gs.keyBindForward.isKeyDown(), 
							gs.keyBindBack.isKeyDown(), gs.keyBindRight.isKeyDown(), gs.keyBindLeft.isKeyDown()));
				}
			}
		}
	}
}
