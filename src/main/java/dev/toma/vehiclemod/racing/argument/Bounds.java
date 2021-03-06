package dev.toma.vehiclemod.racing.argument;

public interface Bounds<N extends Number> {

    N getMin();

    N getMax();

    boolean isWithinBounds(N input);
}
