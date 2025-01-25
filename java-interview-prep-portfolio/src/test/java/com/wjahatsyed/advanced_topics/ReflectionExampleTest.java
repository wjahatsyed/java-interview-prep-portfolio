package com.wjahatsyed.advanced_topics;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ReflectionExampleTest {
    @Test
    void testReflection() throws Exception {
        ReflectionExample example = new ReflectionExample();
        Class<?> clazz = example.getClass();
        Method method = clazz.getMethod("greet");
        assertNotNull(method);
    }
}
