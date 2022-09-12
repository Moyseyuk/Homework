package com.company.Lesson8.task2;

public class Surgeon implements Treat{

    private String doctor = "Хирург";

    @Override
    public void treat() {
        System.out.println("Вырезана опухоль");
    }

    public String getDoctor() {
        return doctor;
    }
}
