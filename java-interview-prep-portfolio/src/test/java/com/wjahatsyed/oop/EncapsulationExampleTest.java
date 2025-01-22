package com.wjahatsyed.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EncapsulationExampleTest {

    @Test
    void testSetAge() {
        EncapsulationExample example = new EncapsulationExample();
        example.setAge(25);
        assertEquals(25, example.getAge(), "Age should be 25");
    }

    @Test
    void testSetAgeNegative() {
        EncapsulationExample example = new EncapsulationExample();
        assertThrows(IllegalArgumentException.class, () -> example.setAge(-5), "Should throw exception for negative age");
    }
}

