package org.example;

import java.util.ArrayList;

public class QueueTees<T> {
    private ArrayList<T> queue;
    private int maxSize;

    public QueueTees() {
        this.maxSize = 5; // fixed max size
        this.queue = new ArrayList<>();
    }

    // add item to the queue if there is space
    public void enqueue(T item) {
        if (queue.size() >= maxSize) {
            System.out.println("Queue is full! Can't add more items.");
        } else { 
            queue.add(item); // item added at end of list (FIFO)
        }
    }

    // remove and return item at front of queue
    public T dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty! Nothing to remove.");
            return null;
        }
        return queue.remove(0); // first item removed to maintain FIFO order
    }
 
    // how many items are currently in queue
    public int size() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
    }
}
