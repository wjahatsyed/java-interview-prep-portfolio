package com.wjahatsyed.java_8_features;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalExampleTest {
    @Test
    void testGetNameWithFallback() {
        OptionalExample example = new OptionalExample();
        assertEquals("John", example.getNameWithFallback(Optional.of("John")));
        assertEquals("Default Name", example.getNameWithFallback(Optional.empty()));
    }
}
