package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSprayCan extends VMItem {

    private EnumDyeColor colorVar;

    public ItemSprayCan(String name, EnumDyeColor color) {
        super(name);
        this.setMaxStackSize(1);
        setMaxDamage(3);
        this.colorVar = color;
    }

    public final void applyOnVehicle(EntityVehicle vehicle, World world, EntityPlayer player) {
        ItemStack stack = player.getHeldItemMainhand();
        boolean flg = stack.getItemDamage() == stack.getMaxDamage();
        applyColor(vehicle, stack, player);
        if(!player.isCreative()) {
            if(flg) {
                stack.shrink(1);
                player.addItemStackToInventory(new ItemStack(Registries.VMItems.EMPTY_SPRAY_CAN));
            } else player.getHeldItemMainhand().damageItem(1, player);
        }
    }

    public void applyColor(EntityVehicle vehicle, ItemStack stack, EntityPlayer player) {
        vehicle.setVariant(this.colorVar.ordinal());
    }
}
