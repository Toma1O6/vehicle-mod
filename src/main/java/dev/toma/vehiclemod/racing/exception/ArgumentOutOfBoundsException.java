package dev.toma.vehiclemod.racing.exception;

import dev.toma.vehiclemod.racing.argument.Argument;
import dev.toma.vehiclemod.racing.argument.Bounds;

public class ArgumentOutOfBoundsException extends ArgumentException {

    public <N extends Number, T extends Argument<N> & Bounds<N>> ArgumentOutOfBoundsException(T arg) {
        super(String.format("Argument is out of bounds! Expected <%f;%f>, got %f", arg.getMin().doubleValue(), arg.getMax().doubleValue(), arg.getValue().doubleValue()));
    }
}
