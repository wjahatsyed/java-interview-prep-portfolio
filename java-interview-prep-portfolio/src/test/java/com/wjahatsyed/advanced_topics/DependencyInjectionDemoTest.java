package com.wjahatsyed.advanced_topics;

import org.junit.jupiter.api.Test;

class DependencyInjectionDemoTest {
    @Test
    void testDependencyInjection() {
        Service service = new EmailService();
        ServiceConsumer consumer = new ServiceConsumer(service);
        consumer.process(); // Should print "Executing Email Service..."
    }
}
