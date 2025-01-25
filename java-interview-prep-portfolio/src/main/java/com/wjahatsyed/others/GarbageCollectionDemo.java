package com.wjahatsyed.others;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null; // Eligible for garbage collection
        obj2 = null; // Eligible for garbage collection

        System.out.println("Requesting garbage collection...");
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collection called on: " + this);
    }
}
