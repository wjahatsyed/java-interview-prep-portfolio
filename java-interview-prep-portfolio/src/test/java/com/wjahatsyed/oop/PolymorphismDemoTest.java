package com.wjahatsyed.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolymorphismDemoTest {

    @Test
    void testAddIntegers() {
        PolymorphismDemo demo = new PolymorphismDemo();
        assertEquals(5, demo.add(2, 3), "Sum of integers 2 and 3 should be 5");
    }

    @Test
    void testAddDoubles() {
        PolymorphismDemo demo = new PolymorphismDemo();
        assertEquals(5.5, demo.add(2.2, 3.3), 0.001, "Sum of doubles 2.2 and 3.3 should be 5.5");
    }
}

