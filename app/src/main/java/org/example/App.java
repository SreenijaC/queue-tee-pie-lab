package org.example;

public class App {
    public static void main(String[] args) {
        QueueTees<Cutie> queue = new QueueTees<>(); // creating queue which stores cutie objects

        // making cutie objects
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();
        Puppy pup2 = new Puppy();
        Kitty kitty2 = new Kitty();
        PygmyMarmoset marmoset2 = new PygmyMarmoset();

        System.out.println("Initial size: " + queue.size());
        System.out.println();

        // adding 3 items to queue
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        System.out.println("Size after 3 enqueues: " + queue.size());
        System.out.println();

        // removing and printing first item
        Cutie first = queue.dequeue();
        if (first != null) {
            System.out.println("Dequeued: " + first.description() + ", rating: " + first.cutenessRating());
        }
        System.out.println();

        // removing and printing second item
        Cutie second = queue.dequeue();
        if (second != null) {
            System.out.println("Dequeued: " + second.description() + ", rating: " + second.cutenessRating());
        }
        System.out.println();

        // remove and print 3rd item
        Cutie third = queue.dequeue();
        if (third != null) {
            System.out.println("Dequeued: " + third.description() + ", rating: " + third.cutenessRating());
        }
        System.out.println();

        System.out.println("Size after 3 dequeues: " + queue.size());
        System.out.println();

        // to dequeue when queue is empty
        Cutie emptyTry = queue.dequeue();
        if (emptyTry == null) {
            System.out.println("Tried to dequeue from empty queue, result is null");
        }
        System.out.println();

        // filling queue to max
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);
        queue.enqueue(pup2);
        queue.enqueue(kitty2);

        System.out.println("Queue size after filling: " + queue.size());
        System.out.println();

        queue.enqueue(marmoset2); // should print full message
        System.out.println();

        queue.dequeue(); // one item removed
        queue.enqueue(marmoset2); // will work
        System.out.println();

        System.out.println("Queue size after interleaving: " + queue.size());
        System.out.println();

        queue.clear();
        System.out.println("Queue size after clear: " + queue.size());
        System.out.println();

        // reuse queue after clearing
        queue.enqueue(new Kitty());
        queue.enqueue(new Puppy());

        System.out.println("Queue size after reusing: " + queue.size());
        System.out.println();

        // dequeue and print after reuse
        Cutie c1 = queue.dequeue();
        if (c1 != null) {
            System.out.println("Dequeued after reuse: " + c1.description());
        }
        System.out.println();

        Cutie c2 = queue.dequeue();
        if (c2 != null) {
            System.out.println("Dequeued after reuse: " + c2.description());
        }
        System.out.println();

        System.out.println("Final queue size: " + queue.size());
        System.out.println();
    }
}
