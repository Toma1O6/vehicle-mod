package dev.toma.vehiclemod.racing;

import dev.toma.vehiclemod.racing.argument.Argument;
import dev.toma.vehiclemod.racing.argument.ArgumentMap;
import dev.toma.vehiclemod.racing.argument.ArgumentType;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class RaceType extends IForgeRegistryEntry.Impl<RaceType> {

    final ArgumentMap map;

    RaceType(Builder builder) {
        this.map = builder.map;
    }

    public static class Builder {

        ArgumentMap map = new ArgumentMap();

        public <T> Builder registerArgument(ArgumentType<T> type) {
            map.registerArgument(type);
            return this;
        }

        public <T> Builder registerArgument(ArgumentType<T> type, Argument<T> argument) {
            map.registerArgument(type, argument);
            return this;
        }

        public RaceType build() {
            return new RaceType(this);
        }
    }
}
