package com.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextDeletion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.shilovich.day5.constant.TextConstants.EMPTY_LINE;
import static com.shilovich.day5.constant.TextConstants.PUNCT;
import static com.shilovich.day5.constant.TextConstants.WORDS_SIZE_REGEX;

public class TextDeletionByRegexImpl implements TextDeletion {
    @Override
    public String deleteAllNonLetterCharacters(String text) {
        return text.replaceAll(PUNCT, EMPTY_LINE);
    }

    @Override
    public String deleteSpecificWords(String text, int size) {
        String regex = String.format(WORDS_SIZE_REGEX, size);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(EMPTY_LINE);
    }
}
