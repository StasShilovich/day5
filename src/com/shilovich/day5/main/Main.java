package com.shilovich.day5.main;

import com.shilovich.day5.exception.TextReaderException;
import com.shilovich.day5.reader.TextReader;
import com.shilovich.day5.service.TextDeletion;
import com.shilovich.day5.service.TextReplacement;
import com.shilovich.day5.service.impl.TextDeletionByCharacterImpl;
import com.shilovich.day5.service.impl.TextDeletionByStringImpl;
import com.shilovich.day5.service.impl.TextReplacementByCharacterImpl;
import com.shilovich.day5.service.impl.TextReplacementByStringImpl;

import javax.xml.soap.Text;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.shilovich.day5.constant.TextConstants.EMPTY_LINE;

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
            String s3 = replacement.replaceWordsBySubstring(s, 5, "lol");
            String s4 = deletion.deleteAllNonLetterCharacters(s);
            String s5 = deletion.deleteSpecificWords(s, 5);
            System.out.println(s4);

            TextReplacement charReplacement = new TextReplacementByCharacterImpl();
            TextDeletion charDeletion = new TextDeletionByCharacterImpl();
            String s11 = charReplacement.replaceGivenLetter(s, 4, '$');
            String s12 = charReplacement.replaceLetterCombination(s, 'н',
                    'е', 'ё');
            String s13 = charReplacement.replaceWordsBySubstring(s, 5, "lol");
            String s14 = charDeletion.deleteAllNonLetterCharacters(s);
            System.out.println(s14);
        } catch (TextReaderException e) {
            System.out.println(e.getMessage());
        }
        String text = "Через несокрушимый, высеченный из камня лабиринт" +
                " течет Нева с ее притоками, протоками и каналами.";
        String regex = "\\p{Punct}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(",");


    }
}
