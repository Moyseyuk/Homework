package com.company.Lesson7.Task1;

public class Rectangle extends Figure implements Interface{
    public int height;

    public Rectangle(int line, int height){
        super.line = line;
        this.height = height;
    }

    public double getArea(){
        return height*super.line;
    }

    public double getPerimeter() {
        return (height + super.line) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                ", height=" + height +
                ", width=" + super.line +
                '}';
    }
}
