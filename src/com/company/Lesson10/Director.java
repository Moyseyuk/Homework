package com.company.Lesson10;

import java.util.Arrays;

public class Director extends Employee {

    POSITION position;
    Employee[] childs;

    public Director(String name, String surname, double seniority) {
        super(name, surname, seniority);
        position = POSITION.DIRECTOR;
        childs = new Employee[20];
    }

    @Override
    public double wage() {
        return (20 * POSITION.DIRECTOR.getKoef() * this.seniority) + (checkChilds() * 5);
    }

    public void setChilds(Employee child) {
        for (int count = 0; count < this.childs.length; count++) {
            if (this.childs[count] == null) {
                this.childs[count] = child;
                break;
            }
        }
    }

    private int checkChilds() {
        int count = 0;
        for (Employee child : this.childs) {
            if (child != null) {
                count++;
            }
        }
        return count;
    }

    private Employee[] childsToString(int count) {
        Employee[] child = new Employee[count];
        for (int i = 0; i < count; i++) {
            child[i] = this.childs[i];
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
                "\n     Подчинённые:" + Arrays.toString(childsToString(checkChilds()));
    }
}
