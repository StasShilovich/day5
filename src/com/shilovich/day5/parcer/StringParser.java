package com.shilovich.day5.parcer;

public class StringParser {
    public String[] parse(String string) {
        String[] result = string.trim().split("\\s+");
        return result;
    }
}
