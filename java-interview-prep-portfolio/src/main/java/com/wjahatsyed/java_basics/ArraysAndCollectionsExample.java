package com.wjahatsyed.java_basics;

// Class to demonstrate arrays and collections in Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndCollectionsExample {
    public static void main(String[] args) {
        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers_2 = new int[5];
        for(int i=0; i<5; i++){
            numbers_2[i] = i+1;
        }
        System.out.println("Array elements: " + Arrays.toString(numbers));
        System.out.println("Array elements: " + Arrays.toString(numbers_2));

        // ArrayList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("ArrayList elements: " + names);
    }
}
