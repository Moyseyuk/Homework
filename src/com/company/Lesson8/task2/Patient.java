package com.company.Lesson8.task2;

import java.util.Scanner;

public class Patient {
    private int disease;

    public void setDisease() {
        TreatPlan treatPlan = new TreatPlan();
        this.disease = doubleInputInt("Введите код болезни от 1 до 3: ");
        treatPlan.initialization(this.disease);
    }

    protected int doubleInputInt(String condition) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print(condition);
        while (!sc.hasNextInt()) {
            System.out.print(condition);
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        return (number);
    }
}