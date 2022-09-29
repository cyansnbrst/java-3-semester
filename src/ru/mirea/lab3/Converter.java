package ru.mirea.lab3;

public class Converter {
    double rubles;

    Converter(double rubles) {
        this.rubles = rubles;
    }

    public double countDollars() {
        return rubles / 57.50;
    }

    public double countEuros() {
        return rubles / 56.32;
    }

    public double countPounds() {
        return rubles / 63.61;
    }


}