package com.company.Lesson8;

import com.company.Lesson8.task2.Patient;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        task1();
        //task2();

    }

    public static int doubleInputInt(String condition) {
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

    public static double doubleInputDouble(String condition) {
        Scanner sc = new Scanner(System.in);
        double number;
        System.out.print(condition);
        while (!sc.hasNextDouble()) {
            System.out.print(condition);
            sc = new Scanner(System.in);
        }
        number = sc.nextDouble();
        return (number);
    }

    public static void task1() {
        Phone[] phones = new Phone[3];
        Scanner sc = new Scanner(System.in);

        for (int count = 0; count < phones.length; count++) {
            int number = doubleInputInt("Введите номер телефона: ");
            System.out.print("Введите марку телефона: ");
            String name = sc.nextLine();
            double weight = doubleInputDouble("Введите вес телефона: ");
            phones[count] = new Phone(number, name, weight);
        }

        for (Phone phone : phones) {
            System.out.println(phone);
        }

        for (Phone phone : phones) {
            System.out.print("Введите имя звонящего: ");
            String name = sc.nextLine();
            int number = doubleInputInt("Введите номер телефона зваонящего: ");
            System.out.println(phone.receiveCall(name) + ". Номер телефона: " + phone.getNumber());
            System.out.println(phone.receiveCall(name, number));
        }

        Phone phone = new Phone();
        phone.sendMessage(6045642, 4568115, 531565168, 161981);
    }

    public static void task2(){
        Patient patient = new Patient();
        patient.setDisease();
    }
}
