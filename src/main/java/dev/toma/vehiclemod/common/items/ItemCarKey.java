package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.LockManager;
import dev.toma.vehiclemod.init.VMSounds;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

import java.util.List;
import java.util.UUID;

public class ItemCarKey extends VMItem {

    public ItemCarKey(String name) {
        super(name);
        setMaxStackSize(1);
    }

    public static ItemStack createKeysFor(EntityVehicle vehicle, EntityPlayer player) {
        ItemStack stack = new ItemStack(Registries.VMItems.CAR_KEY);
        stack.setStackDisplayName(vehicle.getDisplayName().getFormattedText());
        setUUID(stack, vehicle.lockManager.getLinkedUUID());
        return stack;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack stack = playerIn.getHeldItem(handIn);
        UUID uuid = getStoredUUID(stack);
        int keyRange = 30;
        List<EntityVehicle> nearbyVehicles = worldIn.getEntitiesWithinAABB(EntityVehicle.class, playerIn.getEntityBoundingBox().grow(keyRange));
        for (EntityVehicle vehicle : nearbyVehicles) {
            LockManager manager = vehicle.lockManager;
            if(manager.test(uuid)) {
                NBTTagCompound nbt = stack.getTagCompound();
                if(nbt.hasKey("state", Constants.NBT.TAG_BYTE)) {
                    boolean state = nbt.getBoolean("state");
                    if(state != manager.isUnlocked() && !worldIn.isRemote) {
                        playerIn.sendStatusMessage(new TextComponentString(TextFormatting.RED.toString() + TextFormatting.BOLD + "[WARNING] Someone has broken into your car"), true);
                    }
                }
                manager.setUnlocked(!manager.isUnlocked());
                nbt.setBoolean("state", manager.isUnlocked());
                worldIn.playSound(null, vehicle.posX, vehicle.posY, vehicle.posZ, manager.isUnlocked() ? VMSounds.CAR_UNLOCKED : VMSounds.CAR_LOCKED, SoundCategory.MASTER, 2.0F, 1.0F);
                break;
            }
        }
        return ActionResult.newResult(EnumActionResult.PASS, stack);
    }

    private static UUID getStoredUUID(ItemStack stack) {
        return stack.hasTagCompound() && stack.getTagCompound().hasKey("vehicle", Constants.NBT.TAG_STRING) ? UUID.fromString(stack.getTagCompound().getString("vehicle")) : null;
    }

    private static void setUUID(ItemStack stack, UUID uuid) {
        if(!stack.hasTagCompound()) {
            stack.setTagCompound(new NBTTagCompound());
        }
        NBTTagCompound nbt = stack.getTagCompound();
        nbt.setString("vehicle", uuid.toString());
    }
}
