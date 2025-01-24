package com.wjahatsyed.java_8_features;
/*
Demonstrates custom functional interfaces.
 */
@FunctionalInterface
interface StringTransformer {
    String transform(String input);
}

public class FunctionalInterfacesExample {
    public String applyTransformation(String input, StringTransformer transformer) {
        return transformer.transform(input);
    }
}
