package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import dev.toma.vehiclemod.vehicle.entity.VehicleBeamerS120;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class ItemSpecialSprayCan extends ItemSprayCan {

    static final Predicate<EntityVehicle> VALIDATOR = v -> !(v instanceof VehicleBeamerS120);
    String variant;

    public ItemSpecialSprayCan(String variant) {
        super("special_spray_can_" + variant, null);
        this.variant = variant;
        setMaxDamage(5);
    }

    @Override
    public void applyColor(EntityVehicle vehicle, ItemStack stack, EntityPlayer player) {
        vehicle.setSpecialVariant(variant);
    }
}
