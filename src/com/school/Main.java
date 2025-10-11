public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        Teacher teacher = new Teacher("Mr. Brown", "Mathematics");
        Staff staff = new Staff("John", "Librarian");

        System.out.println("\n--- Student Details ---");
        student.displayDetails();

        System.out.println("\n--- Teacher Details ---");
        teacher.displayDetails();

        System.out.println("\n--- Staff Details ---");
        staff.displayDetails();

        // Example AttendanceRecord usage
        AttendanceRecord record = new AttendanceRecord(student.getId(), "2025-10-11", true);
        record.displayRecord();
    }
}
