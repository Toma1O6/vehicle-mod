package dev.toma.vehiclemod.racing.argument;

import dev.toma.vehiclemod.racing.Race;
import dev.toma.vehiclemod.racing.exception.ArgumentException;

import java.util.Objects;

public interface Argument<T> {

    T getValue();

    void setValue(T t, Race race) throws ArgumentException;

    class Impl<T> implements Argument<T> {

        T t;

        Impl(T t) {
            this.t = t;
        }

        @Override
        public T getValue() {
            return t;
        }

        @Override
        public void setValue(T t, Race race) throws ArgumentException {
            this.t = Objects.requireNonNull(t);
        }
    }
}
