package com.wjahatsyed.java_8_features;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MethodReferenceExampleTest {
    @Test
    void testConvertToUpperCase() {
        MethodReferencesExample example = new MethodReferencesExample();
        List<String> input = Arrays.asList("hello", "world");
        List<String> result = example.convertToUpperCase(input);
        assertEquals(Arrays.asList("HELLO", "WORLD"), result);
    }
}
