
public class User {
	private String name;
	private String password;
	private String email;
	private String mobileNumber;
	private String homeNumber;
	
	public User(String name, String password, String email, String mobileNumber) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public User(String name, String password, String email, String mobileNumber, String homeNumber) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.homeNumber = homeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	
	

	
	
}
