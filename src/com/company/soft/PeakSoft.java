package com.company.soft;

import java.util.Arrays;

public class PeakSoft {
    String[] groups;
    String[] students;
    String[] mentors;
    String[] instructors;

    public PeakSoft() {}

    public PeakSoft(String[] groups, String[] students, String[] mentors, String[] instructors) {
        this.groups = groups;
        this.students = students;
        this.mentors = mentors;
        this.instructors = instructors;
    }

    @Override
    public String toString() {
        return "PeakSoft groups: \n" + Arrays.toString(groups) + "\n" + "\n" +
                "Students: \n" + Arrays.toString(students) + "\n" + "\n" +
                "Mentors: \n" + Arrays.toString(mentors) + "\n" + "\n" +
                "Instructors: \n" + Arrays.toString(instructors);
    }
}
