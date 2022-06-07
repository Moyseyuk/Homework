package com.company.Lesson10;

public abstract class Search {

    private static int count = 0;

    public static void find(Director director, String name) {
        for (int i = 0; i < director.childs.length; i++) {
            if (director.childs[i] != null) {
                if (director.childs[i] instanceof Director) {
                    find(((Director) director.childs[i]), name);
                } else {
                    if (director.childs[i].name.equals(name)) {
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
