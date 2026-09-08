package com.oop;

public class Student {

    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void updateGrade(int newGrade) {
        if (newGrade < 0 || newGrade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }

        this.grade = newGrade;
    }
}
