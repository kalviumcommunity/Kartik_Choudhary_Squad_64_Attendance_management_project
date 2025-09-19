public class Course {
    private static int nextCourseIdCounter = 101; // Start IDs from 101
    private int courseId;
    private String courseName;

    // Constructor
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Course ID: C" + courseId + ", Name: " + courseName);
    }
}
