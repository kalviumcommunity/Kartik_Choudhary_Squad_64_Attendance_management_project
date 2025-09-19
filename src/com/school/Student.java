package com.school;

public class Student {
    private int studentId;
    private String name;

    // Constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Public getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
