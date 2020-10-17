package dev.toma.vehiclemod.util.function;

import java.util.Objects;
import java.util.function.Supplier;

public class LazyLoad<T> implements Supplier<T> {

    private T t;
    private Supplier<T> loader;

    public LazyLoad(Supplier<T> loader) {
        this.loader = loader;
    }

    @Override
    public T get() {
        if(t == null) {
            t = Objects.requireNonNull(loader.get(), "Loaded value cannot be null!");
            loader = null;
        }
        return t;
    }
}
