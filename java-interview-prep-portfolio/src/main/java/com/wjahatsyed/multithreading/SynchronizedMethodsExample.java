package com.wjahatsyed.multithreading;

/*
This class demonstrates thread-safe access to shared resources using synchronized methods.
 */
public class SynchronizedMethodsExample {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public synchronized int getCounter() {
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
