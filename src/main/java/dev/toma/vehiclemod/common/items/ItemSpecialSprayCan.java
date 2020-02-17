package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.util.AlwaysNonnull;
import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import dev.toma.vehiclemod.vehicle.entity.VehicleBeamerS120;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.util.function.Predicate;

public class ItemSpecialSprayCan extends ItemSprayCan {

    static final String DEFAULT_SPECIAL_VARIANT = "idk yet";
    static final Predicate<EntityVehicle> VALIDATOR = v -> !(v instanceof VehicleBeamerS120);

    public ItemSpecialSprayCan(String name) {
        super(name, null);
        setMaxDamage(5);
    }

    @Override
    public void applyColor(EntityVehicle vehicle, ItemStack stack, EntityPlayer player) {
        if(!stack.hasTagCompound()) {
            createDefaultTag(stack);
        } else {
            boolean f = VALIDATOR.test(vehicle);
            if(!f) {
                if(!player.world.isRemote) player.sendStatusMessage(new TextComponentString(TextFormatting.RED + "Cannot apply on this vehicle!"), true);
                return;
            }
            vehicle.setSpecialVariant(new AlwaysNonnull<>(() -> stack.getTagCompound().getString("var"), DEFAULT_SPECIAL_VARIANT).get());
        }
    }

    private static void createDefaultTag(ItemStack apply) {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setString("var", DEFAULT_SPECIAL_VARIANT);
        apply.setTagCompound(nbt);
    }
}
