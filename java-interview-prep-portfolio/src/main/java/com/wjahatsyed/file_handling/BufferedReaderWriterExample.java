package com.wjahatsyed.file_handling;

import java.io.*;

public class BufferedReaderWriterExample {

    private static final String FILE_PATH = "buffered_example.txt";

    public void writeUsingBufferedWriter(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(content);
        }
    }

    public String readUsingBufferedReader() throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString().trim();
    }
}
