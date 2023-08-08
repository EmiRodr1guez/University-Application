import University.Student;
import University.Enrollment;
import University.Course;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId = 88846723;
        student.name = "Emi Rodriguez";

        Course course = new Course();
        course.courseId = 123;
        course.courseName = "Intro to Programming.";

        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;

        System.out.println("StudentID: " + enrollment.student.studentId + " || Name: " + enrollment.student.name);
        System.out.println("CourseID: " + enrollment.course.courseId + " || Name: " + enrollment.course.courseName);
    }
}