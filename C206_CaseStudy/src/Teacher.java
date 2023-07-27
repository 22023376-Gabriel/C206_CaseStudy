
public class Teacher extends User{
	private int teacherId;
	private String userRole = "Teacher";
	
	public Teacher(String name,int teacherId, String password,String userRole, String email, String mobileNumber) {
		super(name, password, email, mobileNumber);
		this.teacherId = teacherId;
		this.userRole = userRole;
	}

	public Teacher(String name,int teacherId, String password,String userRole, String email, String mobileNumber, String homeNumber) {
		super(name, password, email, mobileNumber, homeNumber);
		this.teacherId = teacherId;
		this.userRole = userRole;
	}



}
