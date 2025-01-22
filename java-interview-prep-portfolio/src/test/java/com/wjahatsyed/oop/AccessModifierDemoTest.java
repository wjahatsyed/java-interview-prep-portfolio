package com.wjahatsyed.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccessModifiersDemoTest {

    @Test
    void testAccessModifiers() {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        assertEquals("Private", demo.getPrivateMessage(), "Private message should be 'Private'");
        assertEquals("Protected", demo.protectedMessage, "Protected message should be 'Protected'");
        assertEquals("Public", demo.publicMessage, "Public message should be 'Public'");
    }
}
