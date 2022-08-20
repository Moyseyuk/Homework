package com.company.Lesson15.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        date = simpleDateFormat.parse("12.05.2022");

        System.out.printf("День недели: %tA", date);
    }
}
