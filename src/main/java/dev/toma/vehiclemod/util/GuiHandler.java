package dev.toma.vehiclemod.util;

import dev.toma.vehiclemod.client.gui.GuiFuelMaker;
import dev.toma.vehiclemod.client.gui.GuiPetrolPump;
import dev.toma.vehiclemod.client.gui.GuiVehicleInventory;
import dev.toma.vehiclemod.client.gui.tunning.GuiNeons;
import dev.toma.vehiclemod.client.gui.tunning.GuiNitro;
import dev.toma.vehiclemod.client.gui.tunning.GuiVehicleComponents;
import dev.toma.vehiclemod.common.blocks.BlockPetrolPump;
import dev.toma.vehiclemod.common.blocks.fuel.TileEntityFuelMaker;
import dev.toma.vehiclemod.common.container.*;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.inventory.InventoryComponents;
import dev.toma.vehiclemod.common.tileentity.TileEntityPetrolPump;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    public static final int FUEL_MAKER = 0;
    public static final int PETROL_PUMP = 1;
    public static final int VEHICLE = 2;
    public static final int VEHICLE_COMPONENT = 3;
    public static final int VEHICLE_NEON = 4;
    public static final int VEHICLE_NITRO = 5;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            default:
                return null;
            case FUEL_MAKER:
                return new ContainerFuelMaker(player.inventory, (TileEntityFuelMaker) world.getTileEntity(new BlockPos(x, y, z)));
            case PETROL_PUMP:
                return new ContainerPetrolPump(player.inventory, (TileEntityPetrolPump) world.getTileEntity(getBooleanProperty(BlockPetrolPump.UP, world, x, y, z)));
            case VEHICLE:
                return new ContainerVehicle(player.inventory, (EntityVehicle) world.getEntityByID(x));
            case VEHICLE_COMPONENT:
                return new ContainerVehicleComponents(player.inventory, new InventoryComponents(player));
            case VEHICLE_NEON:
                if(player.getRidingEntity() instanceof EntityVehicle)
                    return new ContainerNeons(player.inventory, ((EntityVehicle) player.getRidingEntity()).getNeonHandler().getNeons());
                return null;
            case VEHICLE_NITRO:
                if(player.getRidingEntity() instanceof EntityVehicle)
                    return new ContainerNitro(player.inventory, ((EntityVehicle) player.getRidingEntity()).getNitroHandler());
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            default:
                return null;
            case FUEL_MAKER:
                return new GuiFuelMaker(player.inventory, (TileEntityFuelMaker) world.getTileEntity(new BlockPos(x, y, z)));
            case PETROL_PUMP:
                return new GuiPetrolPump(player.inventory, (TileEntityPetrolPump) world.getTileEntity(getBooleanProperty(BlockPetrolPump.UP, world, x, y, z)));
            case VEHICLE:
                return new GuiVehicleInventory(player.inventory, (EntityVehicle) world.getEntityByID(x));
            case VEHICLE_COMPONENT:
                return new GuiVehicleComponents(player.inventory, new InventoryComponents(player));
            case VEHICLE_NEON:
                if(player.getRidingEntity() instanceof EntityVehicle)
                    return new GuiNeons(player.inventory, ((EntityVehicle) player.getRidingEntity()).getNeonHandler().getNeons());
                return null;
            case VEHICLE_NITRO:
                if(player.getRidingEntity() instanceof EntityVehicle)
                    return new GuiNitro(player.inventory, ((EntityVehicle) player.getRidingEntity()).getNitroHandler());
                return null;
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
