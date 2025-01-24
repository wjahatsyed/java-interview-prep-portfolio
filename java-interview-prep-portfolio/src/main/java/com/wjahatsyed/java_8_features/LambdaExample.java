package com.wjahatsyed.java_8_features;

import java.util.List;
import java.util.stream.Collectors;

/*
Demonstrates the use of lambda expressions for concise implementation of functional interfaces.
 */
public class LambdaExample {
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
