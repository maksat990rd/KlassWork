package com.company.people;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Adam adam = new Adam("Nursultan", 25, "Africa\n");
        System.out.println(adam);
        System.out.println("Как приветствуют в разных странах!\n");
        Chine.methodChine();
        France.methodFrance();
        Italiya.methodItalia();
    }
}
