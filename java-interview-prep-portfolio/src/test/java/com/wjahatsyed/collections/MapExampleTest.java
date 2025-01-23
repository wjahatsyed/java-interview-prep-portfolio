package com.wjahatsyed.collections;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MapExampleTest {
    @Test
    void testCreateAndManipulateMap() {
        MapExample example = new MapExample();
        Map<String, Integer> result = example.createAndManipulateMap();
        assertEquals(2, result.size());
        assertEquals(26, result.get("Alice"));
        assertEquals(30, result.get("Bob"));
    }
}
