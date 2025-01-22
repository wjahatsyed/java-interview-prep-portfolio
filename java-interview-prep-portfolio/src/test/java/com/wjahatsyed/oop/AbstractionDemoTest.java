package com.wjahatsyed.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbstractionDemoTest {

    @Test
    void testArea() {
        AbstractionDemo circle = new AbstractionDemo(2);
        assertEquals(12.566, circle.area(), 0.001, "Area of circle with radius 2 should be approximately 12.566");
    }
}
