package com.wjahatsyed.advanced_topics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class GenericsExampleTest {
    @Test
    void testPrintListElements() {
        List<String> stringList = Arrays.asList("Test", "Generics");
        GenericsExample.printListElements(stringList);

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        GenericsExample.printListElements(integerList);
    }
}
