package com.company.Lesson10;

public abstract class Search {

    private static int count = 0;

    public static void find(Director director, String name) {
        for (int i = 0; i < director.employees.length; i++) {
            if (director.employees[i] != null) {
                if (director.employees[i] instanceof Director) {
                    find(((Director) director.employees[i]), name);
                } else {
                    if (director.employees[i].name.equals(name)) {
                        count++;
                    }
                }
            }
        }
    }

    public static void search(Director director, String name) {

        Search.find(director, name);

        if (count > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
