package com.wjahatsyed.multithreading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SynchronizedMethodsExampleTest {
    @Test
    void testRunThreads() throws InterruptedException {
        SynchronizedMethodsExample example = new SynchronizedMethodsExample();
        example.runThreads();
        assertEquals(2000, example.getCounter());
    }
}
