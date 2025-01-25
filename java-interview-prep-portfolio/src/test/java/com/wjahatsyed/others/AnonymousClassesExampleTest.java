package com.wjahatsyed.others;

import org.junit.jupiter.api.Test;

public class AnonymousClassesExampleTest {
    @Test
    void testAnonymousClass() {
        AnonymousClassesExample.Greeting greeting = () -> System.out.println("Hello from Anonymous Class!");
        greeting.sayHello(); // Should output "Hello from Anonymous Class!"
    }
}
