package com.wjahatsyed.frameworks_and_libraries;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class JavaFXDemoTest {
    @Test
    void testLaunchApplication() {
        assertDoesNotThrow(() -> JavaFXDemo.main(new String[]{}));
    }
}
