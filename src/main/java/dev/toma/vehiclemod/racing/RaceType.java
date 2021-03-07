package dev.toma.vehiclemod.racing;

import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.racing.argument.Argument;
import dev.toma.vehiclemod.racing.argument.ArgumentMap;
import dev.toma.vehiclemod.racing.argument.ArgumentType;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class RaceType<R extends Race> {

    private static final Map<ResourceLocation, RaceType<?>> TYPE_REGISTRY = new HashMap<>();
    final ArgumentMap map;
    final BiFunction<RaceType<R>, RaceTrack, R> factory;

    RaceType(Builder<R> builder) {
        this.map = builder.map;
        this.factory = builder.factory;
    }

    public R createInstance(RaceTrack track) {
        return factory.apply(this, track);
    }

    public static <R extends Race> RaceType<R> registerType(String name, RaceType<R> type) {
        return registerType(VehicleMod.getResource(name), type);
    }

    public static <R extends Race> RaceType<R> registerType(ResourceLocation location, RaceType<R> type) {
        TYPE_REGISTRY.put(location, type);
        return type;
    }

    @SuppressWarnings("unchecked")
    public static <R extends Race> RaceType<R> getType(ResourceLocation resourceLocation) {
        return (RaceType<R>) TYPE_REGISTRY.get(resourceLocation);
    }

    public static class Builder<R extends Race> {

        ArgumentMap map = new ArgumentMap();
        BiFunction<RaceType<R>, RaceTrack, R> factory;

        public Builder<R> factory(BiFunction<RaceType<R>, RaceTrack, R> factory) {
            this.factory = factory;
            return this;
        }

        public Builder<R> registerArgument(ArgumentType<?> type) {
            map.registerArgument(type);
            return this;
        }

        public <T> Builder<R> registerArgument(ArgumentType<T> type, Argument<T> argument) {
            map.registerArgument(type, argument);
            return this;
        }

        public RaceType<R> build() {
            return new RaceType<>(this);
        }
    }
}
