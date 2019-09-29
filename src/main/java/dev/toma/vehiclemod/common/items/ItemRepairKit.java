package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRepairKit extends ItemVehicleAccessory {

    public ItemRepairKit(String name) {
        super(name, 30);
        this.setMaxStackSize(1);
    }

    @Override
    public String getActionMessage() {
        return "Repairing";
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if(entityLiving.isRiding() && entityLiving.getRidingEntity() instanceof EntityVehicle) {
            ((EntityVehicle)entityLiving.getRidingEntity()).repair();
            stack.shrink(1);
        }
        return stack;
    }
}
