package com.company.Lesson15.Task3;

import com.company.Input;

public class Main {

    public static void main(String[] args) {

        int input = Input.inputInt("Введите число 1 или 2: ");

        TaskService taskService = new TaskService();

        FunctionalInterface functionalInterface = (v11, v21) -> {
            if (input == 1) {
                return new StringBuilder(v21).reverse();
            } else if (input == 2){
                return factorial(v11);
            }
            return "Вы ввели неверное число";
        };

        taskService.process(functionalInterface, 1, "Строка");


    }

    public static int factorial(int number) {
        int result = 1;
        if (number != 0) {
            result = number * factorial(number - 1);
        }
        return result;
    }
}
