package dev.toma.vehiclemod.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;

public class ArgWeightedRandom<T, P> {

    protected static Random random = new Random();
    protected final T[] values;
    protected final BiFunction<T, P, Integer> toIntFunction;
    private final Map<P, Integer> cache;

    public ArgWeightedRandom(BiFunction<T, P, Integer> toIntFunction, T[] values) {
        this.toIntFunction = toIntFunction;
        this.values = values;
        this.cache = new HashMap<>();
    }

    public T getRandom(P in) {
        int total = this.getTotalValue(in);
        int weight = random.nextInt(total);
        for(int idx = values.length - 1; idx >= 0; idx--) {
            T t = values[idx];
            weight -= toIntFunction.apply(t, in);
            if(weight < 0) {
                return t;
            }
        }
        return null;
    }

    private int getTotalValue(P p) {
        Integer integer = cache.get(p);
        if(integer == null) {
            int res = gatherAll(p);
            cache.put(p, res);
            return res;
        }
        return integer;
    }

    private int gatherAll(P p) {
        int i = 0;
        for(T t : values)
            i += toIntFunction.apply(t, p);
        return i;
    }
}
