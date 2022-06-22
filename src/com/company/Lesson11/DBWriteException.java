package com.company.Lesson11;

public class DBWriteException extends RuntimeException{

    private Database database;

    public DBWriteException(Database database) {
        this.database = database;
    }

    @Override
    public String getMessage() {
        return "Database is full!";
    }
}
