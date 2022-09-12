package com.company.Lesson7.Task3.ContractSupply;

import com.company.Lesson7.Task3.Document;

import java.util.Date;

public class ContractSupply extends Document {
    private String productType;
    private int productAmount;

    public ContractSupply() {
    }

    public ContractSupply(int number, Date date, String productType, int productAmount) {
        super(number, date);
        this.productType = productType;
        this.productAmount = productAmount;
    }

    @Override
    public void printInfo() {
        System.out.println("Контракст на поставку товаров\nНомер документа: " + super.number +
                "\nДата документа: " + super.date.toString() +
                "\nТип продукта: " + this.productType +
                "\nКоличество продукта: " + this.productAmount + "\n");
    }
}
