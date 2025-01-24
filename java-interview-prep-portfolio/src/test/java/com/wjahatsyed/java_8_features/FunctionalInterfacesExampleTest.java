package com.wjahatsyed.java_8_features;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalInterfacesExampleTest {
    @Test
    void testApplyTransformation() {
        FunctionalInterfacesExample example = new FunctionalInterfacesExample();
        String result = example.applyTransformation("hello", String::toUpperCase);
        assertEquals("HELLO", result);
    }
}
