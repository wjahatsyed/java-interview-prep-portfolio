package com.wjahatsyed.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public List<String> iterateAndModifyList() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Bob")) {
                iterator.remove();
            }
        }
        return names;
    }
}
