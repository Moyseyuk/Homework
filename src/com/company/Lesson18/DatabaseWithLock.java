package com.company.Lesson18;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseWithLock {

    private List<String> databaseWithLock = null;
    private Lock lock = new ReentrantLock();

    public DatabaseWithLock(List<String> database) {
        this.databaseWithLock = database;
    }

    public Boolean search() {
        lock.lock();
        System.out.println("Поиск элемента");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поиск завершён");
        lock.unlock();
        return true;
    }

    public void add() {
        lock.lock();
        System.out.println("Добавление элемента");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Элемент добавлен");
        lock.unlock();
    }

}
