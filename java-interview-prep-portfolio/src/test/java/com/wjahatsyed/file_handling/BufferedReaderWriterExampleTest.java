package com.wjahatsyed.file_handling;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BufferedReaderWriterExampleTest {

    @Test
    void testBufferedReadAndWrite() throws IOException {
        BufferedReaderWriterExample example = new BufferedReaderWriterExample();
        String content = "Buffered File Handling Example";

        // Write to file using BufferedWriter
        example.writeUsingBufferedWriter(content);

        // Read from file using BufferedReader
        assertEquals(content, example.readUsingBufferedReader(), "Buffered read content should match written content");
    }
}
