package com.wjahatsyed.frameworks_and_libraries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MavenGradleDemoTest {
    @Test
    void testGetDependencyDetails() {
        MavenGradleDemo demo = new MavenGradleDemo();
        assertEquals("Maven and Gradle are popular build tools for Java. Maven uses XML for configuration, while Gradle uses Groovy or Kotlin.", demo.getDependencyDetails());
    }
}
