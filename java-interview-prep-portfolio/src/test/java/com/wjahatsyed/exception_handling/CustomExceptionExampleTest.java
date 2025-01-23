package com.wjahatsyed.exception_handling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomExceptionExampleTest {

    @Test
    void testValidateAge() {
        CustomExceptionExample example = new CustomExceptionExample();
        assertDoesNotThrow(() -> example.validateAge(20));
        Exception exception = assertThrows(CustomException.class, () -> example.validateAge(16));
        assertEquals("Age must be 18 or older", exception.getMessage());
    }
}
