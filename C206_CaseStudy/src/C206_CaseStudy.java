import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<User> userList = new ArrayList<User>();
		
		studentList.add(new Student(1, "Jack Park"));
		studentList.add(new Student(2, "Tom Roger", 500.00, "25/09/23"));
		
		int option = 0;
		
		while (option != 3) { //Modify the quit number whenever you want
			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				
			}
			else if (option == 2) {
				viewAllStudents(studentList);
				
			}
		}
		
	}
	public static void menu() {
		Helper.line(80, "-");
		System.out.println("TUITION MANAGEMENT MENU");
		Helper.line(80, "-");		
		System.out.println("1. User Management");
		System.out.println("2. Display All Students");
		System.out.println("3. Quit");
		Helper.line(80, "-");

	}
	public static void viewAllStudents(ArrayList<Student> studentList) {
		String output = "";
		output += String.format("%-5s %-15s %-15s %-10s" , "ID", "Name", "Amount Fee", "Due Date");
		for (int i = 0; i< studentList.size(); i++) {
			output += String.format("\n%-5d %-15s %-15.2f %-10s", studentList.get(i).getStudentID(), studentList.get(i).getStudentName(), studentList.get(i).getAmountfee(), studentList.get(i).getDueDate());
		}
		System.out.println(output);
	}

}
