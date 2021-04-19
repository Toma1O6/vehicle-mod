package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.common.entity.vehicle.internals.IDriveable;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.SPacketInput;
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
				if(player.getRidingEntity() instanceof IDriveable) {
					IDriveable driveable = (IDriveable) player.getRidingEntity();
					if(driveable.shouldAcceptInputFrom(player)) {
						byte input = driveable.encode(gs);
						driveable.handleInputs(input);
						VMNetworkManager.instance().sendToServer(new SPacketInput(input, player.getRidingEntity().getEntityId()));
					}
				}
			}
		}
	}
}
