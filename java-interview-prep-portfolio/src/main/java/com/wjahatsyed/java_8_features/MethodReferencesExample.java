package com.wjahatsyed.java_8_features;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReferencesExample {
    public List<String> convertToUpperCase(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
