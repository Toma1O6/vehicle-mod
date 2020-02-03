package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.vehicle.entity.EntityVehicle;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemRepairKit extends ItemVehicleAccessory {

    private final Tier tier;

    public ItemRepairKit(String name, Tier tier) {
        super(tier.name().toLowerCase() + "_" + name, tier.getRepairTime());
        this.setMaxStackSize(10);
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

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Time: " + tier.getRepairTime() + "s");
        tooltip.add("Amount: " + tier.getAmount() + "HP");
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
