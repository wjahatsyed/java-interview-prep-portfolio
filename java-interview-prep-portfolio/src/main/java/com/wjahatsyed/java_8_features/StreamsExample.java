package com.wjahatsyed.java_8_features;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Showcases advanced use of Java 8 Streams.
 */
public class StreamsExample {
    public Map<Boolean, List<Integer>> partitionByEvenOdd(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }
}
