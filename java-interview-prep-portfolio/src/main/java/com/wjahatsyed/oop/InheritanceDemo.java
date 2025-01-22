package com.wjahatsyed.oop;

class Animal {
    public String sound() {
        return "Some generic sound";
    }
}

public class InheritanceDemo extends Animal {
    @Override
    public String sound() {
        return "Woof Woof";
    }
}

