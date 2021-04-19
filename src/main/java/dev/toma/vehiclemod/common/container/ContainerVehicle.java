package dev.toma.vehiclemod.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class ContainerVehicle extends ModContainer<EntityVehicle.VehicleContainer> {

    private final EntityVehicle vehicle;

    public ContainerVehicle(InventoryPlayer player, EntityVehicle vehicle) {
        super(vehicle.getInventory());
        this.vehicle = vehicle;
        EntityVehicle.VehicleContainer container = vehicle.getInventory();
        int rows = container.getSizeInventory() / 9 + 1;
        for(int y = 0; y < rows; y++) {
            for(int x = 0; x < 9; x++) {
                int idx = y * 9 + x;
                if(idx >= container.getSizeInventory()) break;
                addSlotToContainer(new Slot(container, idx, 8 + x * 18, 18 + y * 18));
            }
        }
        addDefaultInventory(player, rows * 18 + 35);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return dist(playerIn.posX, playerIn.posY, playerIn.posZ, vehicle.posX, vehicle.posY, vehicle.posZ) < 7.5D;
    }

    private double dist(double ax, double ay, double az, double bx, double by, double bz) {
        return Math.sqrt(sqr(ax - bx) + sqr(ay - by) + sqr(az - bz));
    }

    private double sqr(double n) {
        return n*n;
    }
}
