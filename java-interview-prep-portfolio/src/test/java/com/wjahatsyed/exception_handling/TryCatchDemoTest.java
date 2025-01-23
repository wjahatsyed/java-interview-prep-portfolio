package com.wjahatsyed.exception_handling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TryCatchDemoTest {

    @Test
    void testDivide() {
        TryCatchDemo demo = new TryCatchDemo();
        assertDoesNotThrow(() -> demo.divide(10, 2));
        assertDoesNotThrow(() -> demo.divide(10, 0)); // Should log an error, not throw an exception
    }
}
