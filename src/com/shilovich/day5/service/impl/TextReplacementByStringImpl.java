package com.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextReplacement;

import static com.shilovich.day5.constant.TextConstants.EMPTY_LINE;
import static com.shilovich.day5.constant.TextConstants.SPACE;
import static com.shilovich.day5.constant.TextConstants.SPLIT_REGEX;

public class TextReplacementByStringImpl implements TextReplacement {
    @Override
    public String replaceGivenLetter(String text, int letterIndex, char newLetter) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(SPLIT_REGEX);
        for (String string : strings) {
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
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(SPLIT_REGEX);
        for (String string : strings) {
            boolean isContains = string.toLowerCase().contains(EMPTY_LINE + letterBefore + wrongLetter);
            if (isContains) {
                int indexOf = string.toLowerCase().indexOf(EMPTY_LINE + letterBefore + wrongLetter);
                builder.append(string, 0, indexOf);
                builder.append(letterBefore).append(correctLetter);
                builder.append(string, indexOf + 2, string.length()).append(SPACE);
            } else {
                builder.append(string).append(SPACE);
            }
        }
        return builder.toString();
    }

    @Override
    public String replaceWordsBySubstring(String text, int size, String substring) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(SPLIT_REGEX);
        for (String string : strings) {
            if (string.length() == size) {
                builder.append(substring).append(SPACE);
            } else {
                builder.append(string).append(SPACE);
            }
        }
        return builder.toString();
    }
}
