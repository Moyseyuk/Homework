package com.company.Lesson10;

public class Main {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Антон", "Иванушкин", 0.9);
        Worker worker2 = new Worker("Владислав", "Груздь", 3.2);
        Worker worker3 = new Worker("Миша", "Ювелир", 40);
        Director director1 = new Director("Олег", "Задорожный", 0.2);

        System.out.println(worker1.getName() + " " + worker1.getSurname() + ", Зарплата:" + worker1.wage());
        System.out.println(worker2.getName() + " " + worker2.getSurname() + ", Зарплата:" + worker2.wage());
        System.out.println(worker3.getName() + " " + worker3.getSurname() + ", Зарплата:" + worker3.wage());
        System.out.println(director1.getName() + " " + director1.getSurname() + ", Зарплата:" + director1.wage());

        director1.addEmployees(worker1);
        director1.addEmployees(worker2);

        System.out.println(director1);

        Director director2 = new Director("Андрей", "Цымбал", 5);
        director2.addEmployees(worker3);
        director1.addEmployees(director2);
        System.out.println(director1);

        Search.search(director1, "Миша");
    }
}
