package com.wjahatsyed.java_8_features;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StreamsExampleTest {
    @Test
    void testPartitionByEvenOdd() {
        StreamsExample example = new StreamsExample();
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> result = example.partitionByEvenOdd(input);
        assertEquals(Arrays.asList(2, 4, 6), result.get(true));
        assertEquals(Arrays.asList(1, 3, 5), result.get(false));
    }
}
