package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.entity.vehicle.internals.LockManager;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemWrench extends VMItem implements IVehicleAction {

    public ItemWrench(String name) {
        super(name);
        setMaxStackSize(1);
    }

    @Override
    public void apply(EntityPlayer player, World world, ItemStack stack, EntityVehicle vehicle) {
        LockManager lock = vehicle.lockManager;
        if ((vehicle.getPassengers().size() == 0 && lock.isUnlocked()) || player.capabilities.isCreativeMode) {
            vehicle.setDead();
        } else {
            if(!world.isRemote) {
                player.sendStatusMessage(new TextComponentString(TextFormatting.RED + "You cannot remove locked vehicle in non-creative mode!"), true);
            }
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Shift-Right click on vehicle to remove it");
    }
}
