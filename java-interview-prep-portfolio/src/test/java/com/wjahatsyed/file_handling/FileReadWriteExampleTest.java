package com.wjahatsyed.file_handling;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileReadWriteExampleTest {

    @Test
    void testWriteAndReadFromFile() throws IOException {
        FileReadWriteExample example = new FileReadWriteExample();
        String content = "Hello, File Handling!";

        // Write to file
        example.writeToFile(content);

        // Read from file and assert
        assertEquals(content, example.readFromFile(), "Content read should match written content");
    }
}
