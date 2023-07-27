
public class Course {
	private int courseID;
	private String courseName;
	private double courseFee;
	
	public Course(int courseID, String courseName, double courseFee) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
}
