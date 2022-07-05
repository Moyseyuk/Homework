package com.company.Lesson10;

import java.util.Arrays;

public class Director extends Employee {

    Employee[] employees;

    public Director(String name, String surname, double seniority) {
        super(name, surname, seniority);
        super.position = POSITION.DIRECTOR;
        employees = new Employee[20];
    }

    @Override
    public double wage() {
        return (20 * POSITION.DIRECTOR.getKoef() * this.seniority) + (checkChilds() * 5);
    }

    public void addEmployees(Employee child) {
        for (int count = 0; count < this.employees.length; count++) {
            if (this.employees[count] == null) {
                this.employees[count] = child;
                break;
            }
        }
    }

    private int checkChilds() {
        int count = 0;
        for (Employee child : this.employees) {
            if (child != null) {
                count++;
            }
        }
        return count;
    }

    private Employee[] emploeesToMass(int count) {
        Employee[] child = new Employee[count];
        for (int i = 0; i < count; i++) {
            child[i] = this.employees[i];
        }
        return child;
    }

    @Override
    public String toString() {
        return "Директор: " +
                "Имя = " + name +
                ", Фмилия = " + surname +
                ", Стаж = " + seniority +
                ", Должность = " + position +
                ", Зарплата = " + this.wage() +
                "\n     Подчинённые:" + Arrays.toString(emploeesToMass(checkChilds()));
    }
}
