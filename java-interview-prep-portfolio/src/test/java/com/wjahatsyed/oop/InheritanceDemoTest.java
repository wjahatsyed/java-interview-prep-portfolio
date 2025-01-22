package com.wjahatsyed.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InheritanceDemoTest {

    @Test
    void testSound() {
        InheritanceDemo dog = new InheritanceDemo();
        assertEquals("Woof Woof", dog.sound(), "Sound should be 'Woof Woof'");
    }

    @Test
    void testParentSound() {
        Animal animal = new Animal();
        assertEquals("Some generic sound", animal.sound(), "Sound should be 'Some generic sound'");
    }
}

