package com.wjahatsyed.java_8_features;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStaticMethodsDemoTest {
    @Test
    void testDefaultMethod() {
        DefaultStaticMethodsDemo demo = new DefaultStaticMethodsDemo();
        assertEquals("Vehicle started.", demo.start());
    }

    @Test
    void testStaticMethod() {
        assertEquals("Petrol", Vehicle.fuelType());
    }
}
