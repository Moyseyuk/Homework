package com.company.Lesson11;

import com.company.Input;

public class Main {

    public static void main(String[] args) {

        Database str = new Database();
        DBWriteService writeService = new DBWriteService();
        DBReadService readService = new DBReadService();

        String inputString = Input.inputString("Введите строку: ");

        while (!inputString.equals("exit")) {
            if (!inputString.equals("get")) {
                try {
                    writeService.check(str);
                    str.setStrings(inputString);
                } catch (DBWriteException exc) {
                    System.out.println(exc.getMessage());
                }

            } else {
                try {
                    readService.check(str);
                    System.out.println(str.getStrings());
                } catch (DBReadException exc) {
                    System.out.println(exc.getMessage());
                }
            }
            inputString = Input.inputString("Введите строку: ");
        }

        System.out.println(str);
    }

}
