package com.company.soft;

public class Instructor extends PeakSoft {
    private String instructorName;
    private String lesson;

    public Instructor() {}

    public Instructor(String instructorName, String lesson) {
        this.instructorName = instructorName;
        this.lesson = lesson;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Instructor instructorName: " + instructorName + " Lesson: " + lesson + "\n";
    }
}
