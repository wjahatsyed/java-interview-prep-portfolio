// Package to demonstrate basic Java concepts
package com.wjahatsyed.java_basics;

// Class to demonstrate the use of variables in Java
public class VariablesExample {
    // Declaring and initializing variables
    int age = 36;
    double salary = 90000.50;
    char grade = 'A';
    boolean isEmployee = true;

    public static void main(String[] args) {
        VariablesExample ve = new VariablesExample();
        // Printing variables
        System.out.println("Age: " + ve.age);
        System.out.println("Salary: " + ve.salary);
        System.out.println("Grade: " + ve.grade);
        System.out.println("Is Employee: " + ve.isEmployee);
    }

    public int getIntVar() {
        return age;
    }

    public double getDoubleVar() {
        return salary;
    }

    public char getCharVar() {
        return grade;
    }

    public Boolean getBooleanVar() {
        return isEmployee;
    }
}
