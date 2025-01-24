package com.wjahatsyed.multithreading;
/*
This class demonstrates the creation and execution of threads using the Thread class and Runnable interface.
 */
public class ThreadDemo {
    public String runThread() throws InterruptedException {
        StringBuilder result = new StringBuilder();

        Thread thread1 = new Thread(() -> result.append("Thread 1 executed. "));
        Thread thread2 = new Thread(() -> result.append("Thread 2 executed. "));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        return result.toString().trim();
    }
}
