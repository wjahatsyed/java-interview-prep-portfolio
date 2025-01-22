package com.wjahatsyed.oop;

public class ClassesAndObjectsDemo {
    private String message;

    public ClassesAndObjectsDemo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }
}

