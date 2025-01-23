package com.wjahatsyed.exception_handling;

import java.io.IOException;

public class ThrowsAndThrowDemo {

    public void riskyOperation() throws IOException {
        throw new IOException("Simulated IO Exception");
    }

    public void safeOperation() {
        try {
            riskyOperation();
        } catch (IOException e) {
            System.err.println("Handled exception: " + e.getMessage());
        }
    }
}