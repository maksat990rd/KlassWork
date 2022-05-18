package com.company;

public class Yu extends Jayloo{
    String name;
    int age;
    int massa;

    public Yu() {}

    public Yu(String name, int age, int massa) {
        this.name = name;
        this.age = age;
        this.massa = massa;
    }

    @Override
    public String toString() {
        return "Yular name: " + name + " age: " + age + " massa: " + massa + " kg |";
    }
}
