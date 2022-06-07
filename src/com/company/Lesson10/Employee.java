package com.company.Lesson10;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected double seniority;

    public Employee(String name, String surname, double seniority) {
        this.name = name;
        this.surname = surname;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double wage() {
        return 20 * POSITION.WORKER.getKoef() * this.seniority;
    }
}
