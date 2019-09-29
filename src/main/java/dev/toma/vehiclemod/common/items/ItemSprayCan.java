package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.world.World;

public class ItemSprayCan extends VMItem {

    private EnumDyeColor colorVar;

    public ItemSprayCan(String name, EnumDyeColor color) {
        super(name);
        this.setMaxStackSize(1);
        this.colorVar = color;
    }

    public void applyOnVehicle(EntityVehicle vehicle, World world, EntityPlayer player) {
        vehicle.setVariant(this.colorVar.ordinal());
        if(!player.capabilities.isCreativeMode) {
            player.getHeldItemMainhand().shrink(1);
        }
    }
}
