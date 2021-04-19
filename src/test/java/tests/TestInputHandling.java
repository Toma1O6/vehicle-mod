package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestInputHandling {

    private byte input;

    @Test
    public void testKeys() {
        byte w = 1;
        byte s = 1 << 1;
        byte d = 1 << 2;
        byte a = 1 << 3;
        byte space = 1 << 4;

        press(s);
        press(space);

        assertFalse(isPressed(w));
        assertTrue(isPressed(s));
        assertTrue(isPressed(space));

        clear();

        press(w);
        press(d);

        assertTrue(isPressed(w));
        assertFalse(isPressed(s));
        assertTrue(isPressed(d));
    }

    boolean isPressed(byte key) {
        return (input & key) == key;
    }

    void press(byte key) {
        input |= key;
    }

    void clear() {
        input = 0;
    }
}
