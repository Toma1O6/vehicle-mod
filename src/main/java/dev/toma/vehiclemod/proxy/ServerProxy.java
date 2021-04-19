package dev.toma.vehiclemod.proxy;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.UserListOpsEntry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {}
	
	@Override
	public void init(FMLInitializationEvent e) {}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {}
	
	@Override
	public void playSoundAt(EntityVehicle v) {}

	@Override
	public boolean isOp(EntityPlayer player) {
		EntityPlayerMP mp = (EntityPlayerMP) player;
		MinecraftServer server = mp.getServer();
		GameProfile profile = mp.getGameProfile();
		UserListOpsEntry entry = server.getPlayerList().getOppedPlayers().getEntry(profile);
		return entry != null ? entry.getPermissionLevel() >= server.getOpPermissionLevel() : server.getOpPermissionLevel() >= 2;
	}
}
