package com.company.people;

public class Adam {
    protected String name;
    protected int age;
    protected String from;

    public Adam() {
    }

    public Adam(String name, int age, String from) {
        this.name = name;
        this.age = age;
        this.from = from;
    }

    @Override
    public String toString() {
        return "Adam name: " + name + ", age: " + age +
                ", from: " + from;
    }
}
