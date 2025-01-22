package com.wjahatsyed.java_basics;

// Class to demonstrate methods in Java
public class MethodsExample {
    // Method to calculate the sum of two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Sum: " + result);
    }
}
