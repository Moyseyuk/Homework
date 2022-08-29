package com.company.Lesson18;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        DatabaseWithLock database = new DatabaseWithLock(Arrays.asList("first", "second", "third", "last"));

        ThreadForAddToDatabase threadForAddToDatabase1 = new ThreadForAddToDatabase(database);
        ThreadForAddToDatabase threadForAddToDatabase2 = new ThreadForAddToDatabase(database);
        ThreadForAddToDatabase threadForAddToDatabase3 = new ThreadForAddToDatabase(database);

        ThreadForSearchInDatabase threadForSearchInDatabase1 =
                new ThreadForSearchInDatabase(database);
        ThreadForSearchInDatabase threadForSearchInDatabase2 =
                new ThreadForSearchInDatabase(database);
        ThreadForSearchInDatabase threadForSearchInDatabase3 =
                new ThreadForSearchInDatabase(database);

        threadForAddToDatabase1.start();
        threadForAddToDatabase2.start();
        threadForAddToDatabase3.start();
        threadForSearchInDatabase1.start();
        threadForSearchInDatabase2.start();
        threadForSearchInDatabase3.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadForAddToDatabase1.setRun(false);
        threadForAddToDatabase2.setRun(false);
        threadForAddToDatabase3.setRun(false);
        threadForSearchInDatabase1.setRun(false);
        threadForSearchInDatabase2.setRun(false);
        threadForSearchInDatabase3.setRun(false);

    }

}
