package com.company;

public enum POSITION {
    DIRECTOR(1.5),
    WORKER(1);

    private double koef;

    POSITION(double koef) {
        this.koef = koef;
    }

    public double getKoef() {
        return koef;
    }
}
