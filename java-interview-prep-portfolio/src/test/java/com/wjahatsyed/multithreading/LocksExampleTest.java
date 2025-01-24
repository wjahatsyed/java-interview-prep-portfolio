package com.wjahatsyed.multithreading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocksExampleTest {
    @Test
    void testRunThreads() throws InterruptedException {
        LocksExample example = new LocksExample();
        example.runThreads();
        assertEquals(2000, example.getCounter());
    }
}
