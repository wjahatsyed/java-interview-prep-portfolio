package com.wjahatsyed.others;

public class InnerClassesExample {
    private String message = "Hello from Outer Class";

    class InnerClass {
        void displayMessage() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        InnerClassesExample outer = new InnerClassesExample();
        InnerClass inner = outer.new InnerClass();
        inner.displayMessage();
    }
}
