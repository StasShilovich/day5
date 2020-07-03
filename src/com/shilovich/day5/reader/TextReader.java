package com.shilovich.day5.reader;

import com.shilovich.day5.exception.TextReaderException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static com.shilovich.day5.constant.TextConstants.PATH;

public class TextReader {
    public String readFile() throws TextReaderException {
        String result = "";
        try {
            result = new String(Files.readAllBytes(Paths.get(PATH)));
        } catch (IOException e) {
            throw new TextReaderException("Text reading fail!", e);
        }
        return result;
    }

    public String readConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        StringBuilder builder = new StringBuilder();
        if (scanner.hasNext()) {
            builder.append(scanner.nextLine());
        }
        if (builder.capacity() == 0) {
            System.out.println("Reading file from console fail! Empty text");
        }
        return builder.toString();
    }
}
