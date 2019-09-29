package dev.toma.vehiclemod.proxy;

import dev.toma.vehiclemod.common.tileentity.TileEntityMusicPlayer;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy implements IProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {}
	
	@Override
	public void init(FMLInitializationEvent e) {}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {}
	
	@Override
	public void playSoundAt(EntityVehicle v) {}
	
	@Override
	public void displayGuiMusicPlayer(TileEntityMusicPlayer te, BlockPos pos) {}
}
