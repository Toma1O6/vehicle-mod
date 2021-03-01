package dev.toma.vehiclemod.common.items;

import dev.toma.vehiclemod.common.tunning.StatModifierType;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemPerk extends VMItem {

    final StatModifierType statModifierType;
    final float value;

    public ItemPerk(String name, StatModifierType type, float value) {
        super(name);
        this.statModifierType = type;
        this.value = value;
        setMaxStackSize(1);
    }

    public float getValue() {
        return value;
    }

    public StatModifierType getModifierType() {
        return statModifierType;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        this.statModifierType.addToTooltip(tooltip, value);
    }
}
