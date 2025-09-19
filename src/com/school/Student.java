public class Student {
    private static int nextStudentIdCounter = 1; // Auto-increment counter
    private int studentId;
    private String name;

    // Constructor
    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Student ID: S" + studentId + ", Name: " + name);
    }
}
