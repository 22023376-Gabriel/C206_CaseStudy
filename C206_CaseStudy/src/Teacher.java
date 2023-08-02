import java.util.ArrayList;

public class Teacher extends User{
	private int teacherId;
	public ArrayList<Course> assignedCourses = new ArrayList<Course>();
	
	public Teacher(String name,int teacherId, String password,String userRole, String email, String mobileNumber) {
		super(name, password,userRole, email, mobileNumber);
		this.teacherId = teacherId;
	}

	public Teacher(String name,int teacherId, String password,String userRole, String email, String mobileNumber, String homeNumber) {
		super(name, password,userRole, email, mobileNumber, homeNumber);
		this.teacherId = teacherId;
	}



}
