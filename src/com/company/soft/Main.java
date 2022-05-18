package com.company.soft;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        PeakSoft peakSoft = new PeakSoft();

        Group group1 = new Group("Java 5", "01.31.2020");
        Group group2 = new Group("Java Script 5", "01.31.2020");
        Group group3 = new Group("Java 6", "01.03.2021");
        Group group4 = new Group("Java Script 6", "01.03.2021");

        Student student = new Student("Nursultan", 25, 'M');
        Student student1 = new Student("Aziza", 21, 'W');
        Student student2 = new Student("Azat", 23, 'W');
        Student student3 = new Student("Datka", 22, 'W');
        Student student4 = new Student("Aynura", 24, 'W');
        Student student5 = new Student("Joodar", 19, 'M');

        Mentor mentor = new Mentor(group1.getGroupName() + " Beksultan", "Middle\n");
        Mentor mentor1 = new Mentor(group1.getGroupName() + " Ayjan", " Middle\n");
        Mentor mentor2 = new Mentor(group3.getGroupName() + " Maksat", " Senior\n");
        Mentor mentor3 = new Mentor(group3.getGroupName() + " Ayjamal", " Senior");

        Instructor instructor = new Instructor(group3.getGroupName() + " Muhammed Allanov", "Java");
        Instructor instructor1 = new Instructor(group4.getGroupName() + " Maykl Jekson", "JavaScript");
        peakSoft.groups = new String[] {group1.toString(), group2.toString(), group3.toString(),group4.toString()};
        peakSoft.students = new String[] {student.toString(),student1.toString(), student2.toString(),student3.toString(),student4.toString(),student5.toString()};
        peakSoft.mentors = new String[] {mentor.toString(),mentor1.toString(),mentor2.toString(),mentor3.toString()};
        peakSoft.instructors = new String[] {instructor.toString(), instructor1.toString()};

        System.out.println(peakSoft);
    }
}
