package com.shilovich.day5.service;

public class TextService {

    final private static String[] CONSTRAINT =
            {"б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п",
                    "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ"};

    public String performTask1ByStringBuilder(String text, int letterNumber, char symbol) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split("\\p{Blank}\\p{Punct}");
        for (String string : strings) {
            if (string.length() >= letterNumber) {
                builder.append(string, 0, letterNumber - 1);
                builder.append(symbol);
                builder.append(string, letterNumber, string.length());
                builder.append(" ");
            } else {
                builder.append(string).append(" ");
            }
        }
        return builder.toString();
    }

    public String performTask2ByStringBuilder(
            String text, char letterBefore, char wrongLetter, char correctLetter
    ) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(" ");
        for (String string : strings) {
            boolean isContains = string.contains("" + letterBefore + wrongLetter);
            if (isContains) {
                int indexOf = string.indexOf("" + letterBefore + wrongLetter);
                builder.append(string, 0, indexOf);
                builder.append(letterBefore).append(correctLetter);
                builder.append(string, indexOf + 2, string.length()).append(" ");
            } else {
                builder.append(string).append(" ");
            }
        }
        return builder.toString();
    }

    public String performTask3ByStringBuilder(String text, int size, String substring) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(" ");
        for (String string : strings) {
            if (string.length() == size) {
                builder.append(substring).append(" ");
            } else {
                builder.append(string).append(" ");
            }
        }
        return builder.toString();
    }

    public String performTask4ByStringBuilder(String text) {

        return null;
    }

    public String performTask5ByStringBuilder(String text, int size) {
        StringBuilder builder = new StringBuilder();
        String[] strings = text.split(" ");
        for (String string : strings) {
            if (string.length() == size) {
                for (int i = 0; i < CONSTRAINT.length; i++) {
                    if (string.startsWith(CONSTRAINT[i])) {
                        break;
                    }
                }
            } else {
                builder.append(string).append(" ");
            }
        }
        return builder.toString();
    }

}
