package dev.toma.vehiclemod.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

public class VMHelper {
	
	public static void sendMessageToPlayer(EntityPlayer player, String message) {
		if(!player.world.isRemote) {
			player.sendMessage(new TextComponentString(message));
		}
	}
}
