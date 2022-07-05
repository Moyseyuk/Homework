package com.company.Lesson10;

public class Worker extends Employee {

    public Worker(String name, String surname, double seniority) {
        super(name, surname, seniority);
        position = POSITION.WORKER;
    }

    @Override
    public String toString() {
        return "Рабочий: " +
                "Имя = " + name +
                ", Фамилия = " + surname +
                ", Стаж = " + seniority +
                ", Должность = " + position +
                ", Зарплата = " + super.wage() +
                "|";
    }
}
