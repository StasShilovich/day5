package com.shilovich.day5.reader;

import com.shilovich.day5.exception.TextReaderException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.shilovich.day5.constant.Constant.PATH;

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
}
