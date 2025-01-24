package com.wjahatsyed.multithreading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreadDemoTest {
    @Test
    void testRunThread() throws InterruptedException {
        ThreadDemo demo = new ThreadDemo();
        String result = demo.runThread();
        assertTrue(result.contains("Thread 1 executed."));
        assertTrue(result.contains("Thread 2 executed."));
    }
}
