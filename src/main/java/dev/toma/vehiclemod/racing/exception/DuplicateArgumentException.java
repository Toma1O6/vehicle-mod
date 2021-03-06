package dev.toma.vehiclemod.racing.exception;

import dev.toma.vehiclemod.racing.argument.ArgumentType;

public class DuplicateArgumentException extends ArgumentException {

    public DuplicateArgumentException(ArgumentType<?> type) {
        super("Duplicate argument for " + type.getKey() + " key");
    }
}
