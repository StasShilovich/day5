package com.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextDeletion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.shilovich.day5.constant.Constant.*;

public class TextDeletionByStringImpl implements TextDeletion {
    @Override
    public String deleteAllNonLetterCharacters(String text) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(SPLIT_REGEX);
        for (int i = 0; i < strings.length; i++) {
            Pattern pattern = Pattern.compile(LETTERS);
            Matcher matcher = pattern.matcher(strings[i]);
            if (matcher.lookingAt()) {
                builder.append(strings[i]).append(SPACE);
            }
        }
        return builder.toString();
    }

    @Override
    public String deleteSpecificWords(String text, int size) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(SPLIT_REGEX);
        for (int i = 0; i < strings.length; i++) {
            Pattern pattern = Pattern.compile(VOWELS);
            Matcher matcher = pattern.matcher(strings[i]);
            if (!matcher.lookingAt() || strings[i].length() != size) {
                builder.append(strings[i]).append(SPACE);
            }
        }
        return builder.toString();
    }
}
