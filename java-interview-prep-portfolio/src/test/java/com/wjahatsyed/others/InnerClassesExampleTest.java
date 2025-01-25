package com.wjahatsyed.others;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InnerClassesExampleTest {
    @Test
    void testInnerClassMessage() {
        InnerClassesExample outer = new InnerClassesExample();
        InnerClassesExample.InnerClass inner = outer.new InnerClass();
        inner.displayMessage(); // Test prints should match expectations
    }
}
