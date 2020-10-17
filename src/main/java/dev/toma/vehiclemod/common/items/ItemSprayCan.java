package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.util.VehicleTexture;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSprayCan extends VMItem {

    private final VehicleTexture texture;

    public ItemSprayCan(String name, VehicleTexture texture) {
        super(name);
        this.setMaxStackSize(1);
        setMaxDamage(3);
        this.texture = texture;
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
        vehicle.setTexture(this.texture);
    }
}
