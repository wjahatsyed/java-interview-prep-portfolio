package com.wjahatsyed.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/*
This class demonstrates the use of the ExecutorService for thread pool management.
 */
public class ExecutorsExample {
    private final AtomicInteger counter = new AtomicInteger(0);

    public void runWithExecutorService() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 1000; i++) {
            executorService.execute(counter::incrementAndGet);
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // Wait for all tasks to finish
        }
    }

    public int getCounter() {
        return counter.get();
    }
}
