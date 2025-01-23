package com.wjahatsyed.exception_handling;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ThrowsAndThrowDemoTest {

    @Test
    void testRiskyOperation() {
        ThrowsAndThrowDemo demo = new ThrowsAndThrowDemo();
        assertThrows(IOException.class, demo::riskyOperation);
    }

    @Test
    void testSafeOperation() {
        ThrowsAndThrowDemo demo = new ThrowsAndThrowDemo();
        assertDoesNotThrow(demo::safeOperation); // Exception should be caught internally
    }
}
