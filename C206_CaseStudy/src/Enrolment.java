//Krishna

public class Enrolment {
    private int enrolmentId;
    private int courseId;
    private int studentId;
    private String enrolmentDate;

    public Enrolment(int enrolmentId, int courseId, int studentId, String enrolmentDate) {
        this.enrolmentId = enrolmentId;
        this.courseId = courseId;
        this.studentId = studentId;
        this.enrolmentDate = enrolmentDate;
    }

    public int getEnrolmentId() {
        return enrolmentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getEnrolmentDate() {
        return enrolmentDate;
    }
}
