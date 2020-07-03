package com.shilovich.day5.service;

public interface TextDeletion {
    String deleteAllNonLetterCharacters(String text);

    String deleteSpecificWords(String text, int size);
}
