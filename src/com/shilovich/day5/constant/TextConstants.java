package com.shilovich.day5.constant;

public final class TextConstants {
    public static final String SPLIT_REGEX = "\\s*(\\s|,|!|\\.)\\s*";
    public static final String PATH = "src\\resources\\text.txt";
    public static final String SPACE = " ";
    public static final String EMPTY_LINE = "";
    public static final String VOWELS = "[^аАоОиИеЕёЁэЭыЫуУюЮяЯaAeEiIoOuUyY]";
    public static final String LETTERS = "\\w*";
    public static final char CHAR_SPACE = ' ';
    public static final String PUNCT = "\\p{Punct}";
    public static final String WORDS_SIZE_REGEX = "\\b\\p{L}{%d}\\b";
    public static final String REPLACE = "$1%s$3";
    public static final String LETTER_INDEX_REGEX = "(\\b\\S{%d})(\\S)(\\S*\\b)";
}
