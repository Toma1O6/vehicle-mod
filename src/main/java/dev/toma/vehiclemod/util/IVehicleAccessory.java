package dev.toma.vehiclemod.util;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public interface IVehicleAccessory {

    void apply(EntityVehicle vehicle, World world, EntityPlayer player);
}
