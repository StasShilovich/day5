package com.shilovich.day5.main;

import com.shilovich.day5.reader.CustomFileReader;
import com.shilovich.day5.service.TextService;

public class Main {
    public static void main(String[] args) {
        CustomFileReader reader=new CustomFileReader();
        TextService service=new TextService();
        service.processingString(reader.readFile(),1,'c');
    }
}
