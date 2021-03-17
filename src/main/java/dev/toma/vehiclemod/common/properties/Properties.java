package dev.toma.vehiclemod.common.properties;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public final class Properties {

    private static final Properties INSTANCE = new Properties();
    private final Map<PropertyKey<?>, Property<?, ?>> map;

    public static Properties instance() {
        return INSTANCE;
    }

    Properties() {
        map = Maps.newHashMap();
        register(DefaultProperties.CREATE_RACE, new PropertyRaceCreation());
    }

    public <T extends Property<?, ?>> T getProperty(PropertyKey<T> key) {
        return (T) map.get(key);
    }

    public <T extends Property<?, ?>> void modify(PropertyKey<T> key, Consumer<T> consumer) {
        T t = getProperty(key);
        if(t != null) {
            consumer.accept(t);
        }
    }

    public <T extends Property<?, ?>> void register(PropertyKey<T> key, T value) {
        map.put(key, value);
    }
}
