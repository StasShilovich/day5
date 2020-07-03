package com.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextDeletion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.shilovich.day5.constant.TextConstants.LETTERS;
import static com.shilovich.day5.constant.TextConstants.SPACE;
import static com.shilovich.day5.constant.TextConstants.SPLIT_REGEX;
import static com.shilovich.day5.constant.TextConstants.VOWELS;

public class TextDeletionByStringImpl implements TextDeletion {
    @Override
    public String deleteAllNonLetterCharacters(String text) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(SPLIT_REGEX);
        for (String string : strings) {
            Pattern pattern = Pattern.compile(LETTERS);
            Matcher matcher = pattern.matcher(string);
            if (matcher.lookingAt()) {
                builder.append(string).append(SPACE);
            }
        }
        return builder.toString();
    }

    @Override
    public String deleteSpecificWords(String text, int size) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(SPLIT_REGEX);
        for (String string : strings) {
            Pattern pattern = Pattern.compile(VOWELS);
            Matcher matcher = pattern.matcher(string);
            if (!matcher.lookingAt() || string.length() != size) {
                builder.append(string).append(SPACE);
            }
        }
        return builder.toString();
    }
}
