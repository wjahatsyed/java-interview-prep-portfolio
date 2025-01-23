package com.wjahatsyed.file_handling;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileReadWriteExample {

    private static final String FILE_PATH = "example.txt";

    public void writeToFile(String content) throws IOException {
        Files.writeString(Paths.get(FILE_PATH), content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public String readFromFile() throws IOException {
        return Files.readString(Paths.get(FILE_PATH));
    }
}
