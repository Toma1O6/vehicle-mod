package dev.toma.vehiclemod.util;

import java.util.function.Consumer;

public interface IEventHandler<E> {

    /**
     * Handles invoking of all subscribers
     * @param consumer Action to execute for specific {@link E} argument
     */
    void invoke(Consumer<E> consumer);

    /**
     * Subscribes specified instance to this event handler
     * @param e Subscriber
     */
    void subscribe(E e);

    /**
     * Unsubscribes specified instance from this event handler
     * @param e Subscriber
     */
    void unsubscribe(E e);
}
