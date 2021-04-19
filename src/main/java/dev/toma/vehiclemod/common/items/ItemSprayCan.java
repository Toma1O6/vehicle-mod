package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.entity.vehicle.internals.VehicleTexture;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemSprayCan extends VMItem implements IVehicleAction {

    private final VehicleTexture texture;

    public ItemSprayCan(String name, VehicleTexture texture) {
        super(name);
        this.setMaxStackSize(1);
        setMaxDamage(3);
        this.texture = texture;
    }

    @Override
    public void apply(EntityPlayer player, World world, ItemStack stack, EntityVehicle vehicle) {
        if(vehicle.canRepaint(texture)) {
            vehicle.setTexture(texture);
            boolean flag = stack.getItemDamage() == stack.getMaxDamage();
            if(!player.isCreative()) {
                if(flag) {
                    stack.shrink(1);
                    player.addItemStackToInventory(new ItemStack(Registries.VMItems.EMPTY_SPRAY_CAN));
                } else {
                    stack.damageItem(1, player);
                }
            }
        } else {
            if (!player.world.isRemote) {
                player.sendStatusMessage(new TextComponentString(TextFormatting.RED + "You cannot apply this color on vehicle"), true);
            }
        }
    }
}
