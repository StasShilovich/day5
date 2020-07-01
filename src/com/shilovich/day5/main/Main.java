package com.shilovich.day5.main;

import com.shilovich.day5.constant.Constant;
import com.shilovich.day5.exception.TextReaderException;
import com.shilovich.day5.reader.TextReader;
import com.shilovich.day5.service.TextDeletion;
import com.shilovich.day5.service.TextReplacement;
import com.shilovich.day5.service.impl.TextDeletionByStringImpl;
import com.shilovich.day5.service.impl.TextReplacementByStringImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            TextReader reader1 = new TextReader();
            String s = reader1.readFile();
            TextReplacement replacement = new TextReplacementByStringImpl();
            TextDeletion deletion = new TextDeletionByStringImpl();
            String s1 = replacement.replaceGivenLetter(s, 4, '$');
            String s2 = replacement.replaceLetterCombination(s, 'н',
                    'е', 'ё');
            String s3 = deletion.deleteSpecificWords(s, 5);
            String s4 = deletion.deleteAllNonLetterCharacters(s);
            System.out.println(s4);
        } catch (TextReaderException e) {
            System.out.println(e.getMessage());
        }
        String text = "Через несокрушимый, высеченный из камня лабиринт" +
                " течет Нева с ее притоками, протоками и каналами.";
        String regex = "[^аАоОиИеЕёЁэЭыЫуУюЮяЯ]+";
        Pattern pattern = Pattern.compile(Constant.LETTERS);
        Matcher matcher = pattern.matcher(text);


    }
}
