package com.company;

import java.util.Arrays;

public class Jayloo {
    String name;
    String adres;
    String chabanName;
    String[] yular;
    String[] koylor;
    String[] attar;

    public Jayloo() {}

    public Jayloo(String name, String adres, String chabanName, String[] yular, String[] koylor, String[] attar) {
        this.name = name;
        this.adres = adres;
        this.chabanName = chabanName;
        this.yular = yular;
        this.koylor = koylor;
        this.attar = attar;
    }

    @Override
    public String toString() {
        return "Jayloo name: " + name + '\'' +
                ", adres: " + adres + '\'' +
                ", chabanName: " + chabanName + "\n" +
                "Yular: " + Arrays.toString(yular) + "\n" +
                "Koylor: " + Arrays.toString(koylor) + "\n" +
                "Attar: " + Arrays.toString(attar);
    }
}
