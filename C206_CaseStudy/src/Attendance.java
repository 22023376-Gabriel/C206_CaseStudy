public class Attendance {
    private int attendanceId;
    private int enrolmentId;
    private String attendanceDate;
    
    public Attendance(int attendanceId, int enrolmentId, String attendanceDate) {
        this.attendanceId = attendanceId;
        this.enrolmentId = enrolmentId;
        this.attendanceDate = attendanceDate;
    }
    
    public int getAttendanceId() {
        return attendanceId;
    }
    
    public int getEnrolmentId() {
        return enrolmentId;
    }
    
    public String getAttendanceDate() {
        return attendanceDate;
    }
}
