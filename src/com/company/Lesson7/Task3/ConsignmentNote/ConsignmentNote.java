package com.company.Lesson7.Task3.ConsignmentNote;

import com.company.Lesson7.Task3.Document;

import java.util.Date;

public class ConsignmentNote extends Document {
    private double monthSum;
    private int departmentCode;

    public ConsignmentNote() {
    }

    public ConsignmentNote(int number, Date date, double monthSum, int departmentCode) {
        super(number, date);
        this.monthSum = monthSum;
        this.departmentCode = departmentCode;
    }

    @Override
    public void printInfo() {
        System.out.println("Финансовая накладная\nНомер документа: " + super.number +
                "\nДата документа: " + super.date.toString() +
                "\nИтоговая сумма за месяц: " + this.monthSum +
                "\nКод департамента: " + this.departmentCode + "\n");
    }
}
