
public class Student {
	private int studentID;
	private String studentName;
	private double amountfee;
	private String dueDate;
	
	public Student(int studentID, String studentName, double amountfee, String dueDate) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.amountfee = amountfee;
		this.dueDate = dueDate;
	}
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.amountfee =0;
		this.dueDate ="";
	}
	
	
	
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getAmountfee() {
		return amountfee;
		
	}
	public String getDueDate() {
		return dueDate;
	}
}
