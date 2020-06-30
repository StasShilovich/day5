package com.shilovich.day5.main;

import com.shilovich.day5.exception.TextReaderException;
import com.shilovich.day5.reader.TextReader;
import com.shilovich.day5.service.impl.TextReplacementByStringImpl;

public class Main {
    public static void main(String[] args) {
        try {
            TextReader reader1 = new TextReader();
            String s = reader1.readFile();
            TextReplacementByStringImpl replacement = new TextReplacementByStringImpl();
            String s1 = replacement.replaceGivenLetter(s, 4, '$');
            System.out.println(s1);
        } catch (TextReaderException e) {
            System.out.println(e.getMessage());
        }
    }
}
