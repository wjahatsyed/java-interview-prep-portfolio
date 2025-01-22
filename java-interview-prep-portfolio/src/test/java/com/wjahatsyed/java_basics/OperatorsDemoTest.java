package com.wjahatsyed.java_basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperatorsDemoTest {

    @Test
    void testArithmeticOperations() {
        OperatorsDemo demo = new OperatorsDemo();
        assertEquals(15, demo.add(10, 5), "Addition should return 15");
        assertEquals(5, demo.subtract(10, 5), "Subtraction should return 5");
        assertEquals(50, demo.multiply(10, 5), "Multiplication should return 50");
        assertEquals(2, demo.divide(10, 5), "Division should return 2");
    }
}
