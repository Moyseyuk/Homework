package com.company.Lesson7;

import com.company.Lesson7.Task1.Circle;
import com.company.Lesson7.Task1.Interface;
import com.company.Lesson7.Task1.Rectangle;
import com.company.Lesson7.Task1.Triangle;
import com.company.Lesson7.Task2.Accountant;
import com.company.Lesson7.Task2.Director;
import com.company.Lesson7.Task2.Employee;
import com.company.Lesson7.Task2.Worker;
import com.company.Lesson7.Task3.ConsignmentNote.ConsignmentNote;
import com.company.Lesson7.Task3.ContractEmployee.ContractEmployee;
import com.company.Lesson7.Task3.ContractSupply.ContractSupply;
import com.company.Lesson7.Task3.Register.Register;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        task1();
//        task2();
        task3();
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

    public static int inputInt(String condition) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (!sc.hasNextInt()) {
            System.out.print(condition);
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        return (number);
    }

    public static void task1() {
        Interface[] perimetr = new Interface[5];
        double allPerimetr = 0;

        System.out.println("1. Треугольник");
        System.out.println("2. Прямоугольник");
        System.out.println("3. Круг");

        for (int count = 0; count < 5; count++) {
            System.out.print("Выберите " + (count + 1) + "-ю фигуру хотите внести: ");
            int i = inputInt("");
            while (!(i > 0 && i < 4)) {
                i = doubleInputInt("\nВы ввели явно не номер фигуры, попробуйте ещё раз: ");
            }
            switch (i) {
                case 1:
                    perimetr[count] = new Triangle(doubleInputInt("Введите длину стороны: "));
                    break;
                case 2:
                    perimetr[count] = new Rectangle(doubleInputInt("Введите длину: "), doubleInputInt("Введите высоту: "));
                    break;
                case 3:
                    perimetr[count] = new Circle(doubleInputInt("Введите радиус: "));
                    break;
            }
        }
        for (int count = 0; count < 5; count++) {
            allPerimetr += perimetr[count].getPerimeter();
        }
        System.out.printf("Сумма периметров всех фигур: %.2f", allPerimetr);
    }

    public static void task2() {
        int i = doubleInputInt("Выберите одного из 3-х сотрудников, чью должность хотите узнать: ");
        Employee print;
        while (!(i > 0 && i < 4)) {
            i = doubleInputInt("\nВы ввели явно не номер сотрудника, попробуйте ещё раз: ");
        }
        switch (i) {
            case (1):
                print = new Director();
                break;
            case (2):
                print = new Worker();
                break;
            default:
                print = new Accountant();
                break;
        }
        print.sout();
    }

    public static void task3() {
        Register register = new Register();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Ввод документа");
            System.out.println("2. Вывод информации обо всех документах");
            System.out.println("3. Выход");
            int i = doubleInputInt("Выберите пункт меню: ");
            while (!(i > 0 && i < 4)) {
                i = doubleInputInt("\nВыберите пункт меню: ");
            }
            switch (i) {
                case (1):
                    System.out.println("1. Контракт на поставку товаров");
                    System.out.println("2. Контракт с сотрудником");
                    System.out.println("3. Финансовая накладная");
                    System.out.println("4. Выход");
                    int j = doubleInputInt("Выберите пункт меню: ");
                    while (!(j > 0 && j < 4)) {
                        j = doubleInputInt("\nВыберите пункт меню: ");
                    }
                    switch (j) {
                        case (1):
                            int number = doubleInputInt("Введите номер документа: ");
                            System.out.println("Введите тип продукта: ");
                            String productType = sc.nextLine();
                            int productAmount = doubleInputInt("Введите количество товаров: ");
                            ContractSupply contractSupply = new ContractSupply(
                                    number, new Date(), productType,productAmount);
                            register.addDocument(contractSupply);
                            break;
                        case (2):
                            int number1 = doubleInputInt("Введите номер документа: ");
                            System.out.println("Введите имя сотрудника: ");
                            String employeeName = sc.nextLine();
                            ContractEmployee contractEmployee = new ContractEmployee(
                                    number1, new Date(), new Date(), new Date(), employeeName);
                            register.addDocument(contractEmployee);
                            break;
                        case (3):
                            int number3 = doubleInputInt("Введите номер документа: ");
                            double mounthSum = doubleInputDouble("Введите итоговую сумму за месяц: ");
                            int departmentCode = doubleInputInt("Введите код департамента: ");
                            ConsignmentNote consignmentNote = new ConsignmentNote(
                                    number3, new Date(), mounthSum, departmentCode);
                            register.addDocument(consignmentNote);
                            break;
                    }
                    break;
                case (2):
                    register.printDocument();
                    break;
                case (3):
                    return;
                default:
                    break;
            }
        }
    }
}
