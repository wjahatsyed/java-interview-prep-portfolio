package com.wjahatsyed.others;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionExampleTest {
    @Test
    void testFactorial() {
        assertEquals(120, RecursionExample.factorial(5));
        assertEquals(1, RecursionExample.factorial(0));
        assertEquals(1, RecursionExample.factorial(1));
    }
}
