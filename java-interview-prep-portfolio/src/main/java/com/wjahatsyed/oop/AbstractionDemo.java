package com.wjahatsyed.oop;

abstract class Shape {
    public abstract double area();
}

public class AbstractionDemo extends Shape {
    private double radius;

    public AbstractionDemo(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

