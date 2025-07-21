package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KittyTest {

    @Test
    void testDescription() {
        Kitty kitty = new Kitty();
        assertEquals("Fluffy kitty with a soft purr", kitty.description());
    }

    @Test
    void testCutenessRating() {
        Kitty kitty = new Kitty();
        assertEquals(9, kitty.cutenessRating());
    }
}
