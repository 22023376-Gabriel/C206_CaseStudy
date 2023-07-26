
public class Student {
	private int studentID;
	private String studentName;
	private int amountfee;
	private String dueDate;
	
	public Student(int studentID, String studentName, int amountfee, String dueDate) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.amountfee = amountfee;
		this.dueDate = dueDate;
	}
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getAmountfee() {
		return amountfee;
		
	}
	public String getDueDate() {
		return dueDate;
	}
}
