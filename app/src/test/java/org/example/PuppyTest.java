package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PuppyTest {

    @Test
    void testDescription() {
        Puppy puppy = new Puppy();
        assertEquals("A little puppy with big, sad eyes", puppy.description());
    }

    @Test
    void testCutenessRating() {
        Puppy puppy = new Puppy();
        assertEquals(11, puppy.cutenessRating());
    }
}
