package com.wjahatsyed.exception_handling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinallyBlockDemo {

    private static final Logger logger = LoggerFactory.getLogger(FinallyBlockDemo.class);

    public void readFile(String filePath) {
        try {
            logger.info("Opening file at path: {}", filePath);
            // Simulating file reading
            if (filePath == null) {
                throw new NullPointerException("File path cannot be null");
            }
            logger.info("File read successfully");
        } catch (NullPointerException e) {
            logger.error("Error: {}", e.getMessage(), e);
        } finally {
            logger.info("Closing file resources (simulated)");
        }
    }
}