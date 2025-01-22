package com.wjahatsyed.java_basics;

// Class to demonstrate loops in Java
public class LoopsExample {
    public static void main(String[] args) {
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop
        int count = 0;
        while (count < 3) {
            System.out.println("While loop count: " + count);
            count++;
        }

        // Do-while loop
        int index = 0;
        do {
            System.out.println("Do-while loop index: " + index);
            index++;
        } while (index < 2);
    }
}
