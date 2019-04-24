package com.company;

public class Calculator {

    private double aDouble;
    private double bDouble;

    public Calculator() {
        this.aDouble = 0;
        this.bDouble = 0;
    }

    public Calculator(double aDouble, double bDouble) {
        this.aDouble = aDouble;
        this.bDouble = bDouble;
    }

    public double plus() {
        return aDouble + bDouble;
    }

    public double subscribe() {
        return aDouble - bDouble;
    }

    public double multiplication() {
        return aDouble * bDouble;
    }

    public double division() {
        return aDouble / bDouble;
    }

    public double mod() {
        return aDouble % bDouble;
    }
}


