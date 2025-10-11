package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        Course course1 = new Course(101, "Math");
        Course course2 = new Course(102, "Science");

        // Attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Add records (one invalid)
        attendanceLog.add(new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(student2.getStudentId(), course2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(student1.getStudentId(), course2.getCourseId(), "Late")); // Invalid

        // Display all records
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
