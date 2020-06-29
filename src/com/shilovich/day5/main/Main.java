package com.shilovich.day5.main;

import com.shilovich.day5.reader.CustomFileReader;
import com.shilovich.day5.service.TextService;

public class Main {
    public static void main(String[] args) {
        CustomFileReader reader = new CustomFileReader();
        TextService service = new TextService();
        String file = reader.readFile();
        String s1 = service.performTask1ByStringBuilder(file, 6, '|');
        String s2 = service.performTask2ByStringBuilder(file, 'р', 'а', 'о');
        String s3 = service.performTask3ByStringBuilder(file, 3, "шо");
        String s4 = service.performTask4ByStringBuilder(file);
        String s5 = service.performTask5ByStringBuilder(file, 5);
        System.out.println(s5);
    }
}
