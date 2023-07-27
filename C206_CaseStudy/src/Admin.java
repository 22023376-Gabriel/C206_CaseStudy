
public class Admin extends User{
	private int adminId;
	private String userRole = "Admin";
	
	public Admin(String name,int adminId, String password,String userRole, String email, String mobileNumber) {
		super(name, password, email, mobileNumber);
		this.adminId = adminId;
		this.userRole = userRole;
	}

	public Admin(String name,int adminId, String password,String userRole, String email, String mobileNumber, String homeNumber) {
		super(name, password, email, mobileNumber, homeNumber);
		this.adminId = adminId;
		this.userRole = userRole;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getUserRole() {
		return userRole;
	}


	


}
