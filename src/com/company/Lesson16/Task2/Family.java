package com.company.Lesson16.Task2;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private String surname;
    private String address;
    private Integer averageSalaryForOne;
    private List<Child> childList = new ArrayList<>();

    public Family(String surname, String address, Integer averageSalaryForOne, List<Child> childList) {
        this.surname = surname;
        this.address = address;
        this.averageSalaryForOne = averageSalaryForOne;
        this.childList = childList;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public Integer getAverageSalaryForOne() {
        return averageSalaryForOne;
    }

    public void setAverageSalaryForOne(Integer averageSalaryForOne) {
        this.averageSalaryForOne = averageSalaryForOne;
    }

    @Override
    public String toString() {
        return "Family{" +
                "surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", averageSalaryForOne=" + averageSalaryForOne +
                ", childList=" + childList +
                '}';
    }
}
