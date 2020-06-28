package com.shilovich.day5.service;

import com.shilovich.day5.parcer.StringParser;
import com.shilovich.day5.reader.CustomFileReader;

public class TextService {

    StringParser parser;

    public String processingString(String text, int letterNumber, char symbol) {
        parser = new StringParser();
        String[] strings = parser.parse(text);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        return null;
    }

}
