package com.school;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 1),
            new Student("Bob", 2),
            new Student("Charlie", 3)
        };

        Course[] courses = {
            new Course("Mathematics", "MATH101"),
            new Course("Computer Science", "CS102"),
            new Course("Physics", "PHY103")
        };

        System.out.println("Students:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nCourses:");
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}
