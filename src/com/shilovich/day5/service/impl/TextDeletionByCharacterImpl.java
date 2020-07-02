package com.shilovich.day5.service.impl;

import com.shilovich.day5.constant.TextConstants;
import com.shilovich.day5.service.TextDeletion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.shilovich.day5.constant.TextConstants.*;

public class TextDeletionByCharacterImpl implements TextDeletion {
    @Override
    public String deleteAllNonLetterCharacters(String text) {
        char[] chars = text.toCharArray();
        Pattern pattern = Pattern.compile(PUNCT);
        for (int i = 0; i < chars.length; i++) {
            Matcher matcher = pattern.matcher(Character.toString(chars[i]));
            if (matcher.matches()) {
                chars[i] = CHAR_EMPTY_LINE;
            }
        }
        return new String(chars);
    }

    @Override
    public String deleteSpecificWords(String text, int size) {
        char[] chars = text.toCharArray();
        Pattern pattern = Pattern.compile(VOWELS);
        for (int i = 0; i < chars.length; i++) {
            
        }
        return new String(chars);
    }
}
