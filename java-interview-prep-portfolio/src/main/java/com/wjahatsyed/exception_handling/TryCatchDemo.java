package com.wjahatsyed.exception_handling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TryCatchDemo {

    private static final Logger logger = LoggerFactory.getLogger(TryCatchDemo.class);

    public void divide(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            logger.info("Result: {}", result);
        } catch (ArithmeticException e) {
            logger.error("Error: Cannot divide by zero", e);
        }
    }
}