package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.text.DecimalFormat;

public abstract class ItemVehicleAccessory extends VMItem {

    protected int time;
    static DecimalFormat df = new DecimalFormat("##0.00");

    public ItemVehicleAccessory(String name, int seconds) {
        super(name);
        this.setMaxStackSize(1);
        this.time = seconds * 20;
    }

    @Override
    public abstract ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entityLivingBase);

    public String getActionMessage() {
        return "";
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return time;
    }

    @Override
    public void onUsingTick(ItemStack stack, EntityLivingBase player, int count) {
        if(!player.world.isRemote) {
            if(player.isRiding() && player.getRidingEntity() instanceof EntityVehicle) {
                if(((EntityVehicle) player.getRidingEntity()).currentSpeed != 0) {
                    player.sendMessage(new TextComponentString(TextFormatting.RED + "Vehicle must be stationary!"));
                    player.resetActiveHand();
                    return;
                }
            }
        }
        if(player instanceof EntityPlayer && player.world.isRemote) {
            String left = df.format(count / 20.0F) + "s";
            ((EntityPlayer)player).sendStatusMessage(new TextComponentString(this.getActionMessage() + ": " + left), true);
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(playerIn.isRiding() && playerIn.getRidingEntity() instanceof EntityVehicle) {
            if(((EntityVehicle) playerIn.getRidingEntity()).currentSpeed != 0) {
                if(!worldIn.isRemote) {
                    playerIn.sendStatusMessage(new TextComponentString(TextFormatting.RED + "Vehicle must be stationary!"), true);
                    return new ActionResult<>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
                }
            }
            playerIn.setActiveHand(handIn);
            return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
        } else {
            playerIn.sendStatusMessage(new TextComponentString(TextFormatting.RED + "You must be in vehicle in order to use this!"), true);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
