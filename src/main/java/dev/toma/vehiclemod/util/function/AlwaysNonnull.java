package dev.toma.vehiclemod.util.function;

import java.util.function.Supplier;

public class AlwaysNonnull<T> {

    private final Supplier<T> supp;
    private final T ifn;

    public AlwaysNonnull(Supplier<T> getter, T ifNull) {
        supp = getter;
        ifn = ifNull;
    }

    public T get() {
        T t = supp.get();
        return t == null ? ifn : t;
    }
}
