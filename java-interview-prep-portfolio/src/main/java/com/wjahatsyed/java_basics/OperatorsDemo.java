package com.wjahatsyed.java_basics;

// Class to demonstrate operators in Java
public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));

        // Relational operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a greater than b? " + (a > b));

        // Logical operators - Half check with double operator
        System.out.println("Logical AND: " + (a > 5 && b > 15));
        System.out.println("Logical OR: " + (a < 5 || b > 15));

        //Logical operators - Full check with single operator
        System.out.println("Logical AND Single operator: " + (a > 5 & b > 15));
        System.out.println("Logical OR Single operator: " + (a < 5 | b > 15));
    }

    public int add(int i, int i1) {
        return i + i1;
    }

    public int subtract(int i, int i1) {
        return i - i1;
    }

    public int multiply(int i, int i1) {
        return i * i1;
    }

    public int divide(int i, int i1) {
        return i / i1;
    }
}

