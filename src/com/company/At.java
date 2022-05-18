package com.company;

public class At extends Jayloo{
    String name;
    int age;
    int massa;

    public At() {}

    public At(String name, int age, int massa) {
        this.name = name;
        this.age = age;
        this.massa = massa;
    }

    @Override
    public String toString() {
        return "At name: " + name + " age: " + age + " massa: " + massa + " kg |";
    }
}
