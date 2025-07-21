package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PygmyMarmosetTest {

    @Test
    void testDescription() {
        PygmyMarmoset marmoset = new PygmyMarmoset();
        assertEquals("Tiny monkey with wide eyes", marmoset.description());
    }

    @Test
    void testCutenessRating() {
        PygmyMarmoset marmoset = new PygmyMarmoset();
        assertEquals(10, marmoset.cutenessRating());
    }
}
