package com.company.Lesson18;

public class ThreadForSearchInDatabase extends Thread {

    private boolean isRun = true;
    private DatabaseWithLock database;

    public ThreadForSearchInDatabase(DatabaseWithLock database) {
        this.database = database;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    @Override
    public void run() {
        while (isRun) {
            database.search();
        }
    }
}
