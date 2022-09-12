package com.company.Lesson7.Task1;

public class Circle extends Figure implements Interface {

    public Circle(int line) {
        super.line = line;
    }

    public double getArea() {
        return (3.14 * super.line * super.line);
    }

    public double getPerimeter() {
        return (3.14 * super.line) * 2;
    }

    @Override
    public String toString() {
        return "Radius: " + super.line + "\n" +
                "Perimetr: " + getPerimeter() + "\n";
    }
}
