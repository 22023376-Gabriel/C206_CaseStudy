import java.util.ArrayList;
import java.util.List;

public class Enrolment {
    private int enrolmentId;
    private Student student;
    private Course course;

    // Constructor
    public Enrolment(int enrolmentId, Student student, Course course) {
        this.enrolmentId = enrolmentId;
        this.student = student;
        this.course = course;
    }

    // Getters and Setters
    public int getEnrolmentId() {
        return enrolmentId;
    }

    public void setEnrolmentId(int enrolmentId) {
        this.enrolmentId = enrolmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    private static List<Enrolment> enrolments = new ArrayList<>();

    public static void addEnrolment(Enrolment enrolment) {
        enrolments.add(enrolment);
    }

    public static List<Enrolment> viewAllEnrolments() {
        return enrolments;
    }

    public static void deleteEnrolment(int enrolmentId) {
        enrolments.removeIf(e -> e.getEnrolmentId() == enrolmentId);
    }
}