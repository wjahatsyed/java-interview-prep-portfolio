package com.wjahatsyed.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassesAndObjectsDemoTest {

    @Test
    void testGetMessage() {
        ClassesAndObjectsDemo demo = new ClassesAndObjectsDemo("Hello");
        assertEquals("Hello", demo.getMessage(), "Message should be 'Hello'");
    }

    @Test
    void testSetMessage() {
        ClassesAndObjectsDemo demo = new ClassesAndObjectsDemo("Initial");
        demo.setMessage("Updated");
        assertEquals("Updated", demo.getMessage(), "Message should be updated to 'Updated'");
    }
}

