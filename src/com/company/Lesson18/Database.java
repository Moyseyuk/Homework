package com.company.Lesson18;

import java.util.List;

public class Database{

    private List<String> database = null;

    public Database(List<String> database) {
        this.database = database;
    }

    public synchronized Boolean search() {
        System.out.println("Поиск элемента");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поиск завершён");
        return true;
    }

    public synchronized void add() {
        System.out.println("Добавление элемента");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Элемент добавлен");
    }

}
