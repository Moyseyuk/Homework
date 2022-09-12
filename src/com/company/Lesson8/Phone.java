package com.company.Lesson8;

public class Phone {

    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public String receiveCall(String name, int number) {
        return "Звонит " + name + ". Номер телефона звонящего: " + number;
    }

    public void sendMessage(int... number) {
        System.out.println("Номера телефонов, которым необходимо отправить сообщение:");
        for (int count = 0; count < number.length; count++) {
            System.out.println((count + 1) + "-й номер телефона: " + number[count]);
        }
    }

    @Override
    public String toString() {
        return "\nnumber= " + number +
                ";\nmodel= " + model +
                ";\nweight= " + weight + ";";
    }
}
