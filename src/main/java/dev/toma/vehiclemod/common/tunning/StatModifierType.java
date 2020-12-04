package dev.toma.vehiclemod.common.tunning;

import net.minecraft.util.text.TextFormatting;

import java.util.List;

public class StatModifierType {

    public static final StatModifierType TOP_SPEED = create("Top speed", IStatApplicator.TOP_SPEED);
    public static final StatModifierType ACCELERATION = create("Acceleration", IStatApplicator.ACCELERATION);
    public static final StatModifierType BRAKING = create("Braking", IStatApplicator.BRAKING);
    public static final StatModifierType HANDLING = create("Handling", IStatApplicator.HANDLING);
    public static final StatModifierType DURABILITY = create("Durability", IStatApplicator.DURABILITY);
    public static final StatModifierType FUEL_CONSUMPTION = create("Fuel consumption", IStatApplicator.FUEL_CONSUMPTION, true);
    public static final StatModifierType FUEL_CAPACITY = create("Fuel capacity", IStatApplicator.FUEL_CAPACITY);
    public static final StatModifierType NITRO_POWER = create("Nitro power", IStatApplicator.NITRO_PW);

    final String name;
    final IStatApplicator applicator;
    final boolean isBad;

    public static StatModifierType create(String name, IStatApplicator applicator) {
        return create(name, applicator, false);
    }

    public static StatModifierType create(String name, IStatApplicator applicator, boolean isBad) {
        return new StatModifierType(name, applicator, isBad);
    }

    StatModifierType(String name, IStatApplicator applicator, boolean isBad) {
        this.name = name;
        this.applicator = applicator;
        this.isBad = isBad;
    }

    public void addToTooltip(List<String> tooltips, float value) {
        boolean flag = value > 0;
        if(isBad) {
            int v = -(int)(value * 100);
            tooltips.add(getName() + ": " + (v > 0 ? TextFormatting.RED : TextFormatting.GREEN) + (flag ? "" : "+") + v + "%");
        } else {
            int v = (int)(value * 100);
            tooltips.add(getName() + ": " + (v > 0 ? TextFormatting.GREEN : TextFormatting.RED) + (flag ? "+" : "") + v + "%");
        }
    }

    public IStatApplicator getApplicator() {
        return applicator;
    }

    public String getName() {
        return name;
    }
}
