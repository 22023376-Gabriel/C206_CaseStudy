import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		int option = 0;
		
		while (option != 2) { //Modify the quit number whenever you want
			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				
			}
		}
		
	}
	public static void menu() {
		Helper.line(80, "-");
		System.out.println("TUITION MANAGEMENT MENU");
		Helper.line(80, "-");		
		System.out.println("1. User Management");
		System.out.println("2. Quit");
		Helper.line(80, "-");

	}

}
