package dev.toma.vehiclemod.util;

import dev.toma.vehiclemod.client.gui.GuiFuelMaker;
import dev.toma.vehiclemod.client.gui.GuiPetrolPump;
import dev.toma.vehiclemod.client.gui.GuiVehicleInventory;
import dev.toma.vehiclemod.common.blocks.BlockPetrolPump;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.container.ContainerFuelMaker;
import dev.toma.vehiclemod.common.container.ContainerPetrolPump;
import dev.toma.vehiclemod.common.container.ContainerVehicle;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int FUEL_MAKER = 0;
	public static final int PETROL_PUMP = 1;
	public static final int VEHICLE = 2;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			default: return null;
			case 0: return new ContainerFuelMaker(player.inventory, (TileEntityFuelMaker) world.getTileEntity(new BlockPos(x, y, z)));
			case 1: return new ContainerPetrolPump(player.inventory, (TileEntityPetrolPump) world.getTileEntity(getBooleanProperty(BlockPetrolPump.UP, world, x, y, z)));
			case 2:	return new ContainerVehicle(player.inventory, (EntityVehicle) world.getEntityByID(x));
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			default: return null;
			case 0: return new GuiFuelMaker(player.inventory, (TileEntityFuelMaker) world.getTileEntity(new BlockPos(x, y, z)));
			case 1: return new GuiPetrolPump(player.inventory, (TileEntityPetrolPump) world.getTileEntity(getBooleanProperty(BlockPetrolPump.UP, world, x, y, z)));
			case 2: return new GuiVehicleInventory(player.inventory, (EntityVehicle) world.getEntityByID(x));
		}
	}

	private static BlockPos pos(int x, int y, int z) {
		return new BlockPos(x, y, z);
	}

	private static BlockPos getBooleanProperty(PropertyBool property, World world, BlockPos pos) {
		return world.getBlockState(pos).getValue(property) ? pos : pos.up();
	}

	private static BlockPos getBooleanProperty(PropertyBool property, World world, int x, int y, int z) {
		return getBooleanProperty(property, world, pos(x, y, z));
	}
}
