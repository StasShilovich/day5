package com.shilovich.day5.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader {
    private final static String PATH = "src\\resources\\text.txt";

    public String readFile() {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                builder.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return builder.toString();
    }
}
