package com.company.Lesson7.Task1;

public class Triangle extends Figure implements Interface {

    public Triangle(int line) {
        super.line = line;
    }

    public double getArea() {
        return (Math.sqrt(3) * Math.pow(super.line, 2)) / 4;
    }

    public double getPerimeter() {
        return super.line * 3;
    }

    @Override
    public String toString() {
        return "Сторона треугольника: " + super.line + "\n" +
                "Периметр треугольника: " + getPerimeter() + "\n" +
                "Площадь треугольника: " + getArea() + "\n";
    }
}
