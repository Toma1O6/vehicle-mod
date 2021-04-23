package dev.toma.vehiclemod.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EventHandler<E> implements IEventHandler<E> {

    private final List<E> listeners = new ArrayList<>();

    @Override
    public void invoke(Consumer<E> invokeConsumer) {
        for (E e : listeners) {
            invokeConsumer.accept(e);
        }
    }

    @Override
    public void subscribe(E e) {
        listeners.add(e);
    }

    @Override
    public void unsubscribe(E e) {
        listeners.remove(e);
    }
}
