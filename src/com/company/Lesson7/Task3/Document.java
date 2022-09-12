package com.company.Lesson7.Task3;

import java.util.Date;

public abstract class Document {
    protected int number;
    protected Date date;

    public Document() {

    }

    public Document(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    public abstract void printInfo();
}
