package com.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextReplacement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.shilovich.day5.constant.TextConstants.LETTER_INDEX_REGEX;
import static com.shilovich.day5.constant.TextConstants.REPLACE;
import static com.shilovich.day5.constant.TextConstants.WORDS_SIZE_REGEX;

public class TextReplacementByRegexImpl implements TextReplacement {
    @Override
    public String replaceGivenLetter(String text, int letterIndex, char newLetter) {
        String regex = String.format(LETTER_INDEX_REGEX, letterIndex - 1);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(String.format(REPLACE, newLetter));
    }

    @Override
    public String replaceLetterCombination(String text, char letterBefore, char wrongLetter, char correctLetter) {
        String wrong = String.valueOf(letterBefore) + wrongLetter;
        String correct = String.valueOf(letterBefore) + correctLetter;
        return text.replaceAll(wrong, correct);
    }

    @Override
    public String replaceWordsBySubstring(String text, int size, String substring) {
        String regex = String.format(WORDS_SIZE_REGEX, size);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(substring);
    }
}
