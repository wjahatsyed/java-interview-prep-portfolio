package com.wjahatsyed.java_basics;

// Class to demonstrate data types in Java
public class DataTypesDemo {
    // Primitive data types
    byte b = 127;
    short s = 32000;
    int i = 100000;
    long l = 1000000000L;
    float f = 10.5f;
    float f_1 = 10;
    double d = 99.99;
    char c = 'J';
    boolean bool = true;
    public static void main(String[] args) {
        DataTypesDemo dataTypesDemo = new DataTypesDemo();
        // Printing data types
        System.out.println("Byte: " + dataTypesDemo.b);
        System.out.println("Short: " + dataTypesDemo.s);
        System.out.println("Int: " + dataTypesDemo.i);
        System.out.println("Long: " + dataTypesDemo.l);
        System.out.println("Float: " + dataTypesDemo.f);
        System.out.println("Float without f" + dataTypesDemo.f_1);
        System.out.println("Double: " + dataTypesDemo.d);
        System.out.println("Char: " + dataTypesDemo.c);
        System.out.println("Boolean: " + dataTypesDemo.bool);
    }

    public boolean isBooleanType() {
        return bool;
    }

    public long getLongType() {
        return l;
    }

    public float getFloatType() {
        return f;
    }
}
