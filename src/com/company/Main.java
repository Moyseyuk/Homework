package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[20];

        employee[0] = new Worker("Антон", "Иванушкин", 0.9, POSITION.WORKER);
        employee[1] = new Worker("Владислав", "Груздь", 3.2, POSITION.WORKER);
        employee[2] = new Worker("Миша", "Ювелир", 40, POSITION.WORKER);
        employee[3] = new Director("Олег", "Задорожный", 0.2, POSITION.DIRECTOR);

        for (int count = 0; count < employee.length; count++) {
            if (employee[count] != null) {
                System.out.println("Сотрудник: " + employee[count].getName() +
                        " " + employee[count].getSurname() +
                        " Зароботная плата: " + employee[count].wage());
            }
        }



        employee[3].setChild(employee[0]);
        employee[3].setChild(employee[1]);
        System.out.println(employee[3]);

        employee[4] = new Director("Анна", "Петрова", 2.5, POSITION.DIRECTOR);
        employee[5] = new Worker("Иван", "Иванов", 1.5, POSITION.WORKER);
        employee[4].setChild(employee[5]);
        employee[3].setChild(employee[4]);
        System.out.println(employee[3]);
        System.out.println(employee[3].search("Иван"));
        System.out.println(employee[2].search("Анна"));
    }
}
