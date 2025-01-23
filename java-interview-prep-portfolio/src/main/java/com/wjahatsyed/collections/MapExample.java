package com.wjahatsyed.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public Map<String, Integer> createAndManipulateMap() {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Alice", 26); // Overrides the previous value
        return ageMap;
    }
}
