package com.wjahatsyed.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
This class demonstrates the use of ReentrantLock for explicit locking.
 */
public class LocksExample {
    private int counter = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        return counter;
    }

    public void runThreads() throws InterruptedException {
        Thread thread1 = new Thread(this::incrementMultipleTimes);
        Thread thread2 = new Thread(this::incrementMultipleTimes);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    private void incrementMultipleTimes() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}
