package com.wjahatsyed.collections;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class IteratorExampleTest {
    @Test
    void testIterateAndModifyList() {
        IteratorExample example = new IteratorExample();
        List<String> result = example.iterateAndModifyList();
        assertEquals(2, result.size());
        assertEquals("Alice", result.get(0));
        assertEquals("Charlie", result.get(1));
    }
}
