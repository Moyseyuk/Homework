package com.company.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Увеличение массива на заданное число");
        System.out.println("2. Шахматная доска");
        System.out.println("3. Умножение матриц");
        System.out.println("4. Сумма всех элементов массива");
        System.out.println("5. Вывод диагоналей массива");
        System.out.println("6. Сортировка строк массива по возрастанию");
        System.out.print("Выберите какой пункт домашнего задания хотите проверить:");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int scr1 = sc.nextInt();
            switch (scr1){
                case (1):
                    task1();
                    break;
                case (2):
                    chess();
                    break;
                case (3):
                    multiplicationMatrix();
                    break;
                case (4):
                    massSum();
                    break;
                case (5):
                    diagonals();
                    break;
                case (6):
                    sort();
                    break;

                default:
                    System.out.println("Выберите один из 6-nи пунктов");
                    break;
            }
        } else {
            System.out.println("Извините, но вы ввели явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void task1() {
        int[][][] mass = new int[5][5][5];
        initialization3l(mass);
        int a = input();
        increase(mass, a);
    }

    public static void chess() {
        String[][] mass = new String[8][8];
        for (int count1 = 0; count1 < mass.length; count1++) {
            for (int count = 0; count < mass[count1].length; count++) {
                if (count1 % 2 == 0) {
                    if (count % 2 == 0) {
                        mass[count1][count] = "W";
                    } else {
                        mass[count1][count] = "B";
                    }
                } else {
                    if (count % 2 == 0) {
                        mass[count1][count] = "B";
                    } else {
                        mass[count1][count] = "W";
                    }
                }
            }
        }
        for (String[] strings : mass) {
            for (int count = 0; count < mass.length; count++) {
                System.out.print(strings[count] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int input() {
        System.out.print("Введите число на которое необходимо увеличить все элементы массива: ");
        Scanner sc = new Scanner(System.in);
        int number;
        while (!sc.hasNextInt()) {
            System.out.print("Введите число на которое необходимо увеличить все элементы массива: ");
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        return (number);
    }

    public static void initialization3l(int[][][] mass) {
        for (int count3 = 0; count3 < mass.length; count3++) {
            for (int count2 = 0; count2 < mass[count3].length; count2++) {
                for (int count = 0; count < mass[count3][count2].length; count++) {
                    mass[count3][count2][count] = (int) (Math.random() * 10);
                }
            }
        }
        for (int count3 = 0; count3 < mass.length; count3++) {
            for (int count2 = 0; count2 < mass[count3].length; count2++) {
                for (int count = 0; count < mass.length; count++) {
                    System.out.print("[" + count3 + "][" + count2 + "][" + count + "] = " + mass[count3][count2][count] + "; ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }

    public static void increase(int[][][] mass, int a) {
        for (int count3 = 0; count3 < mass.length; count3++) {
            for (int count2 = 0; count2 < mass[count3].length; count2++) {
                for (int count = 0; count < mass[count3][count2].length; count++) {
                    mass[count3][count2][count] += a;
                }
            }
        }
        for (int count3 = 0; count3 < mass.length; count3++) {
            for (int count2 = 0; count2 < mass[count3].length; count2++) {
                for (int count = 0; count < mass.length; count++) {
                    System.out.print("[" + count3 + "][" + count2 + "][" + count + "] = " + mass[count3][count2][count] + "; ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }

    public static void multiplicationMatrix() {
        int[][] mass1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] mass2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] mmass = new int[3][3];


        for (int count = 0; count < mmass.length; count++) {
            for (int counter = 0; counter < mmass[count].length; counter++) {
                for (int count1 = 0; count1 < mass1.length; count1++){
                    mmass[count][counter] += mass1[count][count1] * mass2[count1][counter];
                }
            }
        }

        for (int[] ints : mmass) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
        }
    }

    public static void initialization2l(int[][] mass) {
        for (int count = 0; count < mass.length; count++) {
            for (int counter = 0; counter < mass[count].length; counter++) {
                mass[count][counter] = (int) (Math.random() * 10);
            }
        }
        for (int count = 0; count < mass.length; count++) {
            for (int counter = 0; counter < mass[count].length; counter++) {
                System.out.print("[" + count + "][" + counter + "] = " + mass[count][counter] + "; ");
            }
            System.out.println("\n");
        }
    }

    public static void massSum() {
        int sum = 0;
        int[][] mass = new int[5][5];
        initialization2l(mass);

        for (int[] ints : mass) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    public static int massSize() {
        System.out.print("Введите количество строк и столбцов в массиве: ");
        Scanner sc = new Scanner(System.in);
        int number;
        while (!sc.hasNextInt()) {
            System.out.print("Введите количество строк и столбцов в массиве: ");
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        return (number);
    }

    public static void diagonals() {
        int massSize = massSize();
        int[][] mass = new int[massSize][massSize];
        int[] masslr = new int[massSize];
        int[] massrl = new int[massSize];

        initialization2l(mass);
        int i = mass.length - 1;

        for (int count = 0; count < mass.length; count++) {
            for (int counter = 0; counter < mass[count].length; counter++) {
                if (count == counter) {
                    masslr[counter] = mass[count][counter];
                }
            }
        }

        for (int count = 0; count < mass.length; count++) {
            while (i >= 0) {
                massrl[count] = mass[count][i];
                break;
            }
            i--;
        }

        for (int j : masslr) {
            System.out.print(j + "; ");
        }
        System.out.print("\n");
        for (int j : massrl) {
            System.out.print(j + "; ");
        }
    }

    public static void sort() {
        int massSize = massSize();
        int[][] mass = new int[massSize][massSize];
        initialization2l(mass);

        for (int[] ints : mass) {
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints));
        }
    }
}