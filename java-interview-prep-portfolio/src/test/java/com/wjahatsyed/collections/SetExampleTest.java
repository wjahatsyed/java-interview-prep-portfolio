package com.wjahatsyed.collections;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class SetExampleTest {
    @Test
    void testCreateAndManipulateSet() {
        SetExample example = new SetExample();
        Set<String> result = example.createAndManipulateSet();
        assertEquals(3, result.size());
        assertTrue(result.contains("Apple"));
        assertTrue(result.contains("Banana"));
        assertTrue(result.contains("Orange"));
    }
}
