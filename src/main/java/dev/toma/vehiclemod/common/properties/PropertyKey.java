package dev.toma.vehiclemod.common.properties;

import java.util.function.Consumer;

public class PropertyKey<T extends Property<?, ?>> {

    final String key;

    PropertyKey(String key) {
        this.key = key;
    }

    public T getProperty() {
        return Properties.instance().getProperty(this);
    }

    public void safeAccess(Consumer<T> consumer) {
        Properties.instance().modify(this, consumer);
    }
}
