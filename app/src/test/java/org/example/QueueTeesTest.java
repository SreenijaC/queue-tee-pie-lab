package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTeesTest {

    @Test
    void testEnqueueDequeueSize() {
        QueueTees<Cutie> queue = new QueueTees<>();
        Puppy p = new Puppy();
        Kitty k = new Kitty();

        assertEquals(0, queue.size());
        queue.enqueue(p);
        queue.enqueue(k);
        assertEquals(2, queue.size());

        Cutie first = queue.dequeue();
        assertEquals("A little puppy with big, sad eyes", first.description());
        assertEquals(1, queue.size());

        Cutie second = queue.dequeue();
        assertEquals("Fluffy kitty with a soft purr", second.description());
        assertEquals(0, queue.size());
    }

    @Test
    void testDequeueFromEmptyQueue() {
        QueueTees<Cutie> queue = new QueueTees<>();
        assertNull(queue.dequeue());
    }

    @Test
    void testClear() {
        QueueTees<Cutie> queue = new QueueTees<>();
        queue.enqueue(new Puppy());
        queue.enqueue(new Kitty());
        assertEquals(2, queue.size());
        queue.clear();
        assertEquals(0, queue.size());
    }

    @Test
    void testReuseAfterClear() {
        QueueTees<Cutie> queue = new QueueTees<>();
        queue.enqueue(new Kitty());
        queue.clear();
        assertEquals(0, queue.size());

        queue.enqueue(new Puppy());
        assertEquals(1, queue.size());
        Cutie cutie = queue.dequeue();
        assertNotNull(cutie);
        assertEquals("A little puppy with big, sad eyes", cutie.description());
        assertEquals(0, queue.size());
    }

    @Test
    void testQueueFullCondition() {
        QueueTees<Cutie> queue = new QueueTees<>();
        queue.enqueue(new Puppy());
        queue.enqueue(new Puppy());
        queue.enqueue(new Puppy());
        queue.enqueue(new Puppy());
        queue.enqueue(new Puppy());

        int sizeBefore = queue.size();
        queue.enqueue(new Puppy()); // should not be added
        assertEquals(sizeBefore, queue.size());
    }

    @Test
    void testInterleave() {
        QueueTees<Cutie> queue = new QueueTees<>();
        queue.enqueue(new Puppy());
        queue.enqueue(new Kitty());
        queue.dequeue(); // remove one
        queue.enqueue(new PygmyMarmoset());
        assertEquals(2, queue.size());
    }
}
