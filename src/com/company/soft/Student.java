package com.company.soft;

public class Student extends PeakSoft{
    private String name;
    private int age;
    private char pol;

    public Student() {
    }

    public Student(String name, int age, char pol) {
        this.name = name;
        this.age = age;
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    @Override
    public String toString() {
        return "Student name: " + name + " age: " + age + " Pol: " + pol + "\n";
    }
}
