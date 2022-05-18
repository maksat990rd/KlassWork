package com.company;

public class Koy extends Jayloo{
    String name;
    int age;
    int massa;

    public  Koy() {}

    public Koy(String name, int age, int massa) {
        this.name = name;
        this.age = age;
        this.massa = massa;
    }

    @Override
    public String toString() {
        return "Koy name: " + name + " age: " + age + " massa: " + massa + " kg |";
    }
}
