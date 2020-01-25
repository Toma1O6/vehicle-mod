package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRepairKit extends ItemVehicleAccessory {

    private final Tier tier;

    public ItemRepairKit(String name, Tier tier) {
        super(tier.name().toLowerCase() + "_" + name, tier.getRepairTime());
        this.setMaxStackSize(1);
        this.tier = tier;
    }

    @Override
    public String getActionMessage() {
        return "Repairing";
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if(entityLiving.isRiding() && entityLiving.getRidingEntity() instanceof EntityVehicle) {
            ((EntityVehicle)entityLiving.getRidingEntity()).repair(tier.getAmount());
            stack.shrink(1);
        }
        return stack;
    }

    public enum Tier {
        IRON(50, 80),
        GOLD(30, 60),
        DIAMOND(40, 150),
        EMERALD(25, 120),
        REDSTONE(10, 15),
        OBSIDIAN(90, 225);

        int repairTime;
        int amount;

        Tier(int time, int amount) {
            this.repairTime = time;
            this.amount = amount;
        }

        public int getRepairTime() {
            return repairTime;
        }

        public int getAmount() {
            return amount;
        }
    }
}
