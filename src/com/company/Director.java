package com.company;

public class Director extends Employee {

    Employee[] child;
    private static int count = 0;
    static String tab = "   ";
    static String ret = "Сотрудник не в подчинении у введённого вами дирректора";

    public Director(String name, String surname, double seniority, POSITION position) {
        super(name, surname, seniority, position);
        this.child = new Employee[20];
    }

    public double wage(int number) {
        return super.wage() * number;
    }

    public void setChild(Employee child) {
        this.child[count] = child;
        count++;
    }

    private String hi(Employee[] child) {
        String str = "";
        for (int i = 0; i < child.length; i++) {
            if (child[i] != null && child[i].position == POSITION.DIRECTOR) {
                tab = tab.concat(tab);
                str = str.concat("   " + child[i] + "\n");
            } else {
                if (child[i] != null) {
                    str = str.concat(tab + child[i] + "\n");
                }
            }
        }
        return str;
    }

    @Override
    public String search(String name) {
        for (int i = 0; i < this.child.length; i++) {
            if (this.child[i] != null) {
                if (this.child[i].position == POSITION.DIRECTOR) {
                    this.child[i].search(name);
                } else {
                    if (child[i].name.equals(name)) {
                        ret= "Сотрудник подчиняется введённому вами дирректору";
                    }
                }
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                " фамилия: " + surname +
                " стаж: " + seniority +
                " должность: " + position +
                "\n" + tab +
                "подчинённые: \n" + hi(child);
    }
}
