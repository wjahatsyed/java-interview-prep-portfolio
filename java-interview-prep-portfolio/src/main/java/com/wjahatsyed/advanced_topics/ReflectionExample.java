package com.wjahatsyed.advanced_topics;

import java.lang.reflect.Method;

public class ReflectionExample {
    public void greet() {
        System.out.println("Hello from ReflectionExample!");
    }

    public static void main(String[] args) {
        try {
            ReflectionExample example = new ReflectionExample();
            Class<?> clazz = example.getClass();
            System.out.println("Class Name: " + clazz.getName());

            Method method = clazz.getMethod("greet");
            method.invoke(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
