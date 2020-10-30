package dev.toma.vehiclemod.common.tunning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StatPackage {

    private final StatModifier[] modifiers;

    StatPackage(List<StatModifier> modifiers) {
        this.modifiers = modifiers.toArray(new StatModifier[0]);
    }

    public StatModifier[] getModifiers() {
        return modifiers;
    }

    public void forEachModifier(Consumer<StatModifier> action) {
        for (StatModifier modifier : modifiers) {
            action.accept(modifier);
        }
    }

    public static class Builder {

        private final List<StatModifier> modifierList = new ArrayList<>();

        public StatModifier.Builder attribute() {
            return new StatModifier.Builder(this);
        }

        public StatPackage createPackage() {
            return new StatPackage(modifierList);
        }

        void registerModifier(StatModifier modifier) {
            modifierList.add(modifier);
        }
    }
}
