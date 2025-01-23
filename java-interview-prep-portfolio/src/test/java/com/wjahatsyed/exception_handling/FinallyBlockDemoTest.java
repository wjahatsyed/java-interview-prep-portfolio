package com.wjahatsyed.exception_handling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinallyBlockDemoTest {

    @Test
    void testReadFile() {
        FinallyBlockDemo demo = new FinallyBlockDemo();
        assertDoesNotThrow(() -> demo.readFile("valid_path.txt"));
        assertDoesNotThrow(() -> demo.readFile(null)); // Should log error and execute finally block
    }
}
