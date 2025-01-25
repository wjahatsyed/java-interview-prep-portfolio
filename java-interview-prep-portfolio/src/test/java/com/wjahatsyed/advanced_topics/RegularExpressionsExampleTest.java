package com.wjahatsyed.advanced_topics;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RegularExpressionsExampleTest {
    @Test
    void testRegex() {
        String input = "Test email test@test.com";
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        assertTrue(matcher.find());
    }
}
