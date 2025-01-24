package com.wjahatsyed.multithreading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecutorsExampleTest {
    @Test
    void testRunWithExecutorService() {
        ExecutorsExample example = new ExecutorsExample();
        example.runWithExecutorService();
        assertEquals(1000, example.getCounter());
    }
}
