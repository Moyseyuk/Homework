package com.company;

public class Worker extends Employee{

    public Worker(String name, String surname, double seniority, POSITION position, String parent) {
        super(name, surname, seniority, position);
    }

    public Worker(String name, String surname, double seniority, POSITION position) {
        super(name, surname, seniority, position);
    }

    @Override
    public void setChild(Employee child) {

    }

    @Override
    public String search(String name) {
        return "У введённого вами сотрудника не может быть подчинённых";
    }
}
