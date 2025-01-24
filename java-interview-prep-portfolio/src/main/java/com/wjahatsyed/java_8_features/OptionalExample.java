package com.wjahatsyed.java_8_features;

import java.util.Optional;
/*
Showcases the use of Optional to avoid null checks.
 */
public class OptionalExample {
    public String getNameWithFallback(Optional<String> name) {
        return name.orElse("Default Name");
    }
}
