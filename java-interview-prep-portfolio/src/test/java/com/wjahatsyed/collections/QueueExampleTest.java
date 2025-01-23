package com.wjahatsyed.collections;

import org.junit.jupiter.api.Test;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class QueueExampleTest {
    @Test
    void testCreateAndManipulateQueue() {
        QueueExample example = new QueueExample();
        Queue<String> result = example.createAndManipulateQueue();
        assertEquals(2, result.size());
        assertEquals("Bob", result.peek());
    }
}
