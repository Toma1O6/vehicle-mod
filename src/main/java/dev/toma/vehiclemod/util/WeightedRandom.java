package dev.toma.vehiclemod.util;

import dev.toma.vehiclemod.util.function.LazyLoad;

import java.util.Random;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class WeightedRandom<T> {

    protected static Random random = new Random();
    protected final T[] values;
    protected final ToIntFunction<T> toIntFunction;
    protected final LazyLoad<Integer> totalValue;

    public WeightedRandom(ToIntFunction<T> toIntFunction, T[] values) {
        this.toIntFunction = toIntFunction;
        this.values = values;
        this.totalValue = new LazyLoad<>(this::gatherAll);
    }

    public T getRandom() {
        int total = totalValue.get();
        int weight = random.nextInt(total);
        for(int idx = values.length - 1; idx >= 0; idx--) {
            T t = values[idx];
            weight -= toIntFunction.applyAsInt(t);
            if(weight < 0) {
                return t;
            }
        }
        return null;
    }

    private int gatherAll() {
        int i = 0;
        for(T t : values)
            i += toIntFunction.applyAsInt(t);
        return i;
    }

    public static class NullableWeightedRandom<T> extends WeightedRandom<T> {

        private final Function<Integer, Float> nullChance;

        public NullableWeightedRandom(ToIntFunction<T> toIntFunction, T[] values, Function<Integer, Float> nullChance) {
            super(toIntFunction, values);
            this.nullChance = nullChance;
        }

        @Override
        public T getRandom() {
            if(random.nextFloat() <= nullChance.apply(totalValue.get()))
                return null;
            return super.getRandom();
        }
    }
}
