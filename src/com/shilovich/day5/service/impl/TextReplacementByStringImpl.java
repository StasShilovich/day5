package com.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextReplacement;

import static com.shilovich.day5.constant.Constant.SPACE;
import static com.shilovich.day5.constant.Constant.SPLIT_REGEX;

public class TextReplacementByStringImpl implements TextReplacement {
    @Override
    public String replaceGivenLetter(String text, int letterIndex, char newLetter) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(SPLIT_REGEX);
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            if (string.length() >= letterIndex) {
                builder.append(string, 0, letterIndex - 1);
                builder.append(newLetter);
                builder.append(string, letterIndex, string.length());
                builder.append(SPACE);
            } else {
                builder.append(string).append(SPACE);
            }
        }
        return builder.toString();
    }

    @Override
    public String replaceLetterCombination(String text, char letterBefore, char wrongLetter, char correctLetter) {
        return null;
    }

    @Override
    public String replaceWordsBySubstring(String text, int size, String substring) {
        return null;
    }
}
