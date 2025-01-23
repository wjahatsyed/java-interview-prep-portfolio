package com.wjahatsyed.collections;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListExampleTest {
    @Test
    void testCreateAndManipulateList() {
        ListExample example = new ListExample();
        List<String> result = example.createAndManipulateList();
        assertEquals(3, result.size());
        assertEquals("Alice", result.get(0));
        assertEquals("David", result.get(1));
        assertEquals("Charlie", result.get(2));
    }
}
