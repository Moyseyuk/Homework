package com.company.Lesson7.Task3.ContractEmployee;

import com.company.Lesson7.Task3.Document;

import java.util.Date;

public class ContractEmployee extends Document {

    private Date startContract;
    private Date endContract;
    private String employeeName;

    public ContractEmployee() {
    }

    public ContractEmployee(int number, Date date, Date startContract, Date endContract, String employeeName) {
        super(number, date);
        this.startContract = startContract;
        this.endContract = endContract;
        this.employeeName = employeeName;
    }

    @Override
    public void printInfo() {
        System.out.println("Контракт сотрудника\nНомер документа: " + super.number +
                "\nДата документа: " + super.date.toString() +
                "\nДата трудоустройства: " + this.startContract.toString() +
                "\nДата окончания контракта: " + this.endContract.toString() +
                "\nИмя сотрудника: " + this.employeeName + "\n");
    }
}
