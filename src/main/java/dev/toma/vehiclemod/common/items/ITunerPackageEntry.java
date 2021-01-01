package dev.toma.vehiclemod.common.items;

import java.util.function.Function;

public interface ITunerPackageEntry {

    int getTier();

    Category getCategory();

    enum Category {
        NEON(t -> 35),
        NITRO(t -> 20),
        CLOUD(t -> t == 0 ? 45 : 40),
        MISC(t -> t == 0 ? 0 : 5);

        final Function<Integer, Integer> chance;

        Category(Function<Integer, Integer> chance) {
            this.chance = chance;
        }

        public int getChance(int in) {
            return chance.apply(in);
        }
    }
}
