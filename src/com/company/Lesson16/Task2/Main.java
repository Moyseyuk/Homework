package com.company.Lesson16.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Family> familiesList = Arrays.asList(
                new Family("Петров", "Минск", 420, Arrays.asList(
                        new Child("Ваня", 12, SEX.MALE),
                        new Child("Петя", 8, SEX.MALE)
                )),
                new Family("Иванов", "Брест", 740, List.of(
                        new Child("Валя", 16, SEX.FEMALE)
                )),
                new Family("Дубовик", "Витебск", 230, Arrays.asList(
                        new Child("Миша", 15, SEX.MALE),
                        new Child("Галя", 2, SEX.FEMALE),
                        new Child("Дима", 6, SEX.MALE),
                        new Child("Таня", 8, SEX.FEMALE)
                ))
        );

        Map<String, Integer> generatedMap = familiesList.stream()
                .collect(Collectors.toMap(Family::getSurname, Family::getAverageSalaryForOne));
        System.out.println(generatedMap);

        long maleCount = familiesList.stream()
                .flatMap(family -> family.getChildList().stream())
                .filter(child -> child.getSex() == SEX.MALE)
                .count();
        System.out.println(maleCount);

        List<Child> childFemaleList = familiesList.stream()
                .flatMap(family -> family.getChildList().stream())
                .filter(child -> child.getSex() == SEX.FEMALE)
                .collect(Collectors.toList());
        System.out.println(childFemaleList);

        Map<String, Integer> childsCount = familiesList.stream()
                .collect(Collectors.toMap(Family::getSurname, Family -> Family.getChildList().size()));
        System.out.println(childsCount);

        boolean searchChild = familiesList.stream()
                .flatMap(family -> family.getChildList().stream())
                .anyMatch(child -> child.getName().equals("Миша"));
        System.out.println(searchChild);
    }
}
