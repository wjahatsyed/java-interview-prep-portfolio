package com.wjahatsyed.advanced_topics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExample {
    public static void main(String[] args) {
        String input = "Contact me at example@gmail.com or admin@domain.com";
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }
}
