package com.company.Lesson8.task2;

public class TreatPlan {
    public void initialization(int number){
        Treat initialization;
        switch (number){
            case (1):
                initialization = new Surgeon();
                System.out.println("Назначенный врач - " + initialization.getDoctor());
                initialization.treat();
                break;
            case (2):
                initialization = new Dentist();
                System.out.println("Назначенный врач - " + initialization.getDoctor());
                initialization.treat();
                break;
            default:
                initialization = new Therapist();
                System.out.println("Назначенный врач - " + initialization.getDoctor());
                initialization.treat();
                break;
        }
    }
}
