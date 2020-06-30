package com.shilovich.day5.service;

public interface TextReplacement {
    String replaceGivenLetter(String text, int letterIndex, char newLetter);

    String replaceLetterCombination(String text, char letterBefore, char wrongLetter, char correctLetter);

    String replaceWordsBySubstring(String text, int size, String substring);
}
