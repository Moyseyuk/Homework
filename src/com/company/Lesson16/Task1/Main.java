package com.company.Lesson16.Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int number = (int) (Math.random() * 20 + 1);
            listOfIntegers.add(number);
        }
        System.out.println(listOfIntegers);

        listOfIntegers.stream()
                .distinct()
                .filter(el -> el >= 7 && el <= 17)
                .filter(el -> el % 2 == 0)
                .forEach(el -> System.out.print(el + "; "));
        System.out.println();

        listOfIntegers.stream()
                .map(el -> el * 2)
                .sorted()
                .limit(4)
                .forEach(el -> System.out.print(el + "; "));
        System.out.println();

        long countListOfIntegers = listOfIntegers.stream()
                .count();
        System.out.println(countListOfIntegers);

        double average = listOfIntegers.stream()
                .mapToInt(el -> el)
                .average().orElse(0);
        System.out.println(average);
    }
}
