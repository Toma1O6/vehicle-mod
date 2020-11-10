package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.Registries;
import dev.toma.vehiclemod.common.entity.vehicle.EntityVehicle;
import dev.toma.vehiclemod.common.entity.vehicle.LockManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
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
                manager.setUnlocked(!manager.isUnlocked());
                System.out.println(manager.isUnlocked());
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
