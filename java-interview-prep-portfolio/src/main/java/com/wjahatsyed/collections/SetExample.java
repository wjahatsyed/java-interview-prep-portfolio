package com.wjahatsyed.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public Set<String> createAndManipulateSet() {
        Set<String> items = new HashSet<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Apple"); // Duplicate, won't be added
        items.add("Orange");
        return items;
    }
}
