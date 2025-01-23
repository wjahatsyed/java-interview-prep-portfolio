package com.wjahatsyed.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public List<String> createAndManipulateList() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.remove("Bob");
        names.add(1, "David");
        return names;
    }
}
