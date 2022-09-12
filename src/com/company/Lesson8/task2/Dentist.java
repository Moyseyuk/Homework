package com.company.Lesson8.task2;

public class Dentist implements Treat {

    private String doctor = "Дантист";

    @Override
    public void treat() {
        System.out.println("Пломба поставлена");
    }

    public String getDoctor() {
        return doctor;
    }
}
