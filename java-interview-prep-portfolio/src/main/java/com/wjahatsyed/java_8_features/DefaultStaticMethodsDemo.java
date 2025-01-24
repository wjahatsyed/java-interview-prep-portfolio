package com.wjahatsyed.java_8_features;

interface Vehicle {
    default String start() {
        return "Vehicle started.";
    }

    static String fuelType() {
        return "Petrol";
    }
}

public class DefaultStaticMethodsDemo implements Vehicle {}
