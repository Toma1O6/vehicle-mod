package dev.toma.vehiclemod.util;

import dev.toma.vehiclemod.client.gui.GuiFuelMaker;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.container.ContainerFuelMaker;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int FUEL_MAKER = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			default: return null;
			case 0: return new ContainerFuelMaker(player.inventory, (TileEntityFuelMaker) world.getTileEntity(new BlockPos(x, y, z)));
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			default: return null;
			case 0: return new GuiFuelMaker(player.inventory, (TileEntityFuelMaker) world.getTileEntity(new BlockPos(x, y, z)));
		}
	}
}
