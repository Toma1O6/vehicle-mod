package dev.toma.vehiclemod.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IVehicleAction {

    void apply(EntityPlayer player, World world, ItemStack stack, EntityVehicle vehicle);
}
