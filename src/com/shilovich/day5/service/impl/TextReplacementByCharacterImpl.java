package com.shilovich.day5.service.impl;

import com.shilovich.day5.service.TextReplacement;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static com.shilovich.day5.constant.TextConstants.*;

public class TextReplacementByCharacterImpl implements TextReplacement {
    @Override
    public String replaceGivenLetter(String text, int letterIndex, char newLetter) {
        char[] chars = text.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != CHAR_SPACE) {
                count++;
                if (count == letterIndex) {
                    chars[i] = newLetter;
                }
            } else {
                count = 0;
            }
        }
        return new String(chars);
    }

    @Override
    public String replaceLetterCombination(String text, char letterBefore, char wrongLetter, char correctLetter) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1 && Character.toLowerCase(chars[i]) == letterBefore &&
                    Character.toLowerCase(chars[i + 1]) == wrongLetter) {
                chars[i + 1] = correctLetter;
            }
        }
        return new String(chars);
    }

    @Override
    public String replaceWordsBySubstring(String text, int size, String substring) {
        char[] chars = text.toCharArray();
        List<String> result = new ArrayList();
        Pattern pattern = Pattern.compile(PUNCT);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != CHAR_SPACE && !pattern.matcher(Character.toString(chars[i])).matches()) {
                builder.append(chars[i]);
            } else if (builder.toString().length() == size) {
                result.add(substring);
                result.add(Character.toString(chars[i]));
                builder.setLength(0);
            } else {
                result.add(builder.toString());
                result.add(Character.toString(chars[i]));
                builder.setLength(0);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            builder.append(result.get(i));
        }
        return builder.toString();
    }
}
