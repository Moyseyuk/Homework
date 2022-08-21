package com.company.Lesson15.Task2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        int dif = Calendar.TUESDAY - calendar.get(Calendar.DAY_OF_WEEK);
        if (dif >= 0) {
            dif += 7;
        }
        calendar.add(Calendar.DAY_OF_MONTH, dif);

        System.out.printf("%ta, %<te %<tb %<tY", calendar);
    }
}
