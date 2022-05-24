package com.company;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected double seniority;
    POSITION position;
    Employee[] child;

    public Employee(String name, String surname, double seniority, POSITION position) {
        this.name = name;
        this.surname = surname;
        this.seniority = seniority;
        this.position = position;
    }

    public double wage() {
        return 1.85 * this.position.getKoef() * this.seniority;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract void setChild(Employee child);

    public abstract String search(String name);

    @Override
    public String toString() {
        return "Имя: " + name +
                " фамилия: " + surname +
                " стаж: " + seniority +
                " должность: " + position;
    }
}
