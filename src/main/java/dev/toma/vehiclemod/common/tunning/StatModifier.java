package dev.toma.vehiclemod.common.tunning;

public class StatModifier {

    private final StatModifierType type;
    private final float[] values;

    StatModifier(Builder builder) {
        this.type = builder.type;
        this.values = builder.values;
    }

    public StatModifierType getType() {
        return type;
    }

    public float[] getValues() {
        return values;
    }

    public float getValue(int level) {
        return values[level];
    }

    public static class Builder {

        private final StatPackage.Builder builder;
        private StatModifierType type;
        private float[] values;

        protected Builder(StatPackage.Builder builder) {
            this.builder = builder;
        }

        public Builder type(StatModifierType type) {
            this.type = type;
            return this;
        }

        public Builder values(float... values) {
            this.values = values;
            return this;
        }

        public StatPackage.Builder build() {
            StatModifier modifier = new StatModifier(this);
            builder.registerModifier(modifier);
            return builder;
        }
    }
}
