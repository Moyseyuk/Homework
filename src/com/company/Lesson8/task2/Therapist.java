package com.company.Lesson8.task2;

public class Therapist implements Treat {

    private String doctor = "Терапевт";

    @Override
    public void treat() {
        System.out.println("ОРВИ вылечен");
    }

    public String getDoctor() {
        return doctor;
    }
}
