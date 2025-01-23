package com.wjahatsyed.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public Queue<String> createAndManipulateQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.poll(); // Removes Alice
        return queue;
    }
}
