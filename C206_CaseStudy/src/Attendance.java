import java.sql.Date;

public class Attendance {
    private int attendanceId;
    private Student student;
    private Course course;
    private Date date;

    public Attendance(int attendanceId, Student student, Course course, Date date) {
        this.attendanceId = attendanceId;
        this.student = student;
        this.course = course;
        this.date = date;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
