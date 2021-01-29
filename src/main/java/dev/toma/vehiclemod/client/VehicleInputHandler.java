package dev.toma.vehiclemod.client;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
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
				if(player.getRidingEntity() instanceof EntityVehicle && player.getRidingEntity().getControllingPassenger() == player) {
					EntityVehicle vehicle = (EntityVehicle) player.getRidingEntity();
					int value = gs.keyBindForward.isKeyDown() ? 0b0001 : 0;
					if(gs.keyBindBack.isKeyDown())
						value |= 0b0010;
					if(gs.keyBindRight.isKeyDown())
						value |= 0b0100;
					if(gs.keyBindLeft.isKeyDown())
						value |= 0b1000;
					vehicle.updateInput(value, player);
					VMNetworkManager.instance().sendToServer(new SPacketInput(value));
				}
			}
		}
	}
}
