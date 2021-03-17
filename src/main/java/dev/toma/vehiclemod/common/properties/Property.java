package dev.toma.vehiclemod.common.properties;

import java.util.function.Function;

public interface Property<T, U> {

    void set(Function<U, T> function);

    T get(U u);
}
