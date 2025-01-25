package com.wjahatsyed.others;

import org.junit.jupiter.api.Test;

public class AnnotationsDemoTest {
    @Test
    void testAnnotations() {
        boolean isAnnotationPresent = AnnotationsDemo.class.isAnnotationPresent(Info.class);
        assert isAnnotationPresent;
    }
}
