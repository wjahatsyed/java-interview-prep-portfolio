package com.wjahatsyed.java_basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VariablesExampleTest {

    @Test
    void testVariablesInitialization() {
        VariablesExample variablesExample = new VariablesExample();
        assertEquals(36, variablesExample.getIntVar(), "Integer variable should be initialized to 10");
        assertEquals(90000.50, variablesExample.getDoubleVar(), 0.01, "Double variable should be initialized to 3.14");
        assertEquals('A', variablesExample.getCharVar(), "Character variable should be initialized to 'A'");
        assertEquals(true, variablesExample.getBooleanVar(), "String variable should be initialized to 'Hello'");
    }
}
