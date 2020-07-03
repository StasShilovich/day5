package com.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextDeletion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.shilovich.day5.constant.TextConstants.CHAR_SPACE;
import static com.shilovich.day5.constant.TextConstants.PUNCT;
import static com.shilovich.day5.constant.TextConstants.VOWELS;

public class TextDeletionByCharacterImpl implements TextDeletion {
    @Override
    public String deleteAllNonLetterCharacters(String text) {
        char[] chars = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile(PUNCT);
        for (char aChar : chars) {
            Matcher matcher = pattern.matcher(Character.toString(aChar));
            if (!matcher.matches()) {
                builder.append(aChar);
            }
        }
        return builder.toString();
    }

    @Override
    public String deleteSpecificWords(String text, int size) {
        char[] chars = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile(PUNCT);
        Pattern patternVowels = Pattern.compile(VOWELS);
        for (char aChar : chars) {
            if (aChar != CHAR_SPACE && !pattern.matcher(Character.toString(aChar)).matches()) {
                builder.append(aChar);
            } else if (builder.toString().length() == size &&
                    patternVowels.matcher(builder.toString()).lookingAt()) {
                builder.setLength(0);
            } else {
                result.append(builder.toString());
                result.append(aChar);
                builder.setLength(0);
            }
        }
        return result.toString();
    }
}
