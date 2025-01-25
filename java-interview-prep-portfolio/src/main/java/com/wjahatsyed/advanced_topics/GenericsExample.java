package com.wjahatsyed.advanced_topics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static <T> void printListElements(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Generics");
        printListElements(stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        printListElements(integerList);
    }
}
