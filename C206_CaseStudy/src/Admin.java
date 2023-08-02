
public class Admin extends User{
	private int adminId;
	
	public Admin(String name,int adminId, String password,String userRole, String email, String mobileNumber) {
		super(name, password,userRole, email, mobileNumber);
		this.adminId = adminId;
	}

	public Admin(String name,int adminId, String password,String userRole, String email, String mobileNumber, String homeNumber) {
		super(name, password,userRole, email, mobileNumber, homeNumber);
		this.adminId = adminId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}




	


}
