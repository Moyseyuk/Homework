package com.company.Lesson11;

public class DBReadException extends RuntimeException{

    private Database database;

    public DBReadException(Database database) {
        this.database = database;
    }

    @Override
    public String getMessage() {
        return "Database is empty!";
    }
}
