package com.wjahatsyed.java_8_features;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdaExampleTest {
    @Test
    void testFilterEvenNumbers() {
        LambdaExample example = new LambdaExample();
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = example.filterEvenNumbers(input);
        assertEquals(Arrays.asList(2, 4, 6), result);
    }
}
