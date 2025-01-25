package com.wjahatsyed.others;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String author();
    String version();
}

@Info(author = "Wajahat Syed", version = "1.0")
public class AnnotationsDemo {
    public static void main(String[] args) {
        if (AnnotationsDemo.class.isAnnotationPresent(Info.class)) {
            Info info = AnnotationsDemo.class.getAnnotation(Info.class);
            System.out.println("Author: " + info.author());
            System.out.println("Version: " + info.version());
        }
    }
}
