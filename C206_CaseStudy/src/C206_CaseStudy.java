import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<User> userList = new ArrayList<User>();
		ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<Enrolment> enrolmentList = new ArrayList<Enrolment>();

		
		studentList.add(new Student(1, "Jack Park"));
		studentList.add(new Student(2, "Tom Roger", 500.00, "25/09/23"));
        userList.add(new Admin("admin 1", 1, "adminP@ss", "Admin", "TuitionManagement@gmail.com", "9123 4567"));
        userList.add(new Teacher("Jessica Eng", 1, "123JE", "Teacher", "JessEng@gmail.com", "9321 3888", "8990 5902"));
        
		int option = 0;
		
		while (option != 7) { //Modify the quit number whenever you want
			menu();
			option = Helper.readInt("Enter an option > ");

            if (option == 1) {
                int userOption = 0;
                while (userOption != 2) {
                    Helper.line(70, "-");
                    System.out.println("USER MANAGEMENT");
                    Helper.line(70, "-");
                    System.out.println("1.View users");
                    System.out.println("2.Quit");

                    userOption = Helper.readInt("Enter an option > ");
                    if (userOption == 1) {
                        viewAllUsers(userList);
                    }
                }
            }
			else if (option == 2) {
				viewAllStudents(studentList);
				
			}
			else if (option == 3) {
				viewAllCourses(courseList);
			}
			else if (option == 4) {
	                addNewEnrolment(enrolmentList, studentList, courseList);
	        } else if (option == 5) {
	                viewAllEnrolments(enrolmentList);
	        } else if (option == 6) {
	                deleteEnrolment(enrolmentList);
	            }
		}
		
	}
	public static void menu() {
		Helper.line(80, "-");
		System.out.println("TUITION MANAGEMENT MENU");
		Helper.line(80, "-");		
		System.out.println("1. User Management");
		System.out.println("2. Display All Students");
		System.out.println("3. Display All Course");
		System.out.println("4. Quit");
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
	
	public static void viewAllCourses(ArrayList<Course> courseList) {
		String output = "";
		output += String.format("%-5s %-15s %-10s", "ID", "Name", "Course Fee");
		for (int i = 0; i < courseList.size(); i++) {
			output += String.format("%-5d %-15s %-10.2f\n", courseList.get(i).getCourseID(), courseList.get(i).getCourseName(), courseList.get(i).getCourseFee());
		}
		System.out.println(output);
	}
	
	public static void addNewCourse(ArrayList<Course> courseList) {
		int courseID = Helper.readInt("Enter Course ID > ");
		String courseName = Helper.readString("Enter Course Name > ");
		double courseFee = Helper.readDouble("Enter Course Fees > ");
		
		boolean courseAvaliable = false;
		
		for (Course course : courseList) {
            if (course.getCourseID() != courseID) {
            	courseAvaliable = true;
                break;
            }
        }

        if (courseAvaliable) {
            Course course = new Course(courseID, courseName, courseFee);
            courseList.add(course);
            System.out.println("Course added successfully.");
        } else {
            System.out.println("Error: Course ID is not available.");
        }
	}
	
	public static void deleteCourse(ArrayList<Course> courseList) {
		int removeCourseID = Helper.readInt("Enter Course to be removed > ");
		boolean courseExist = false;
		
		for (int i = 0; i < courseList.size(); i++) {
			if (removeCourseID == courseList.get(i).getCourseID()) {
				courseExist = true;
			}
		}
		
		if (courseExist) {
			String output = "";
			output += String.format("%-5s %-15s %-10s", "ID", "Name", "Course Fee");
			for (int e = 0; e < courseList.size(); e++) {
				output += String.format("%-5d %-15s %-10.2f\n", courseList.get(e).getCourseID(), courseList.get(e).getCourseName(), courseList.get(e).getCourseFee());
			}
			System.out.println(output);
			
			char comfirmation = Helper.readChar("Are you sure? (y|n) > ");
			
			if (comfirmation == 'y' || comfirmation == 'Y') {
				courseList.remove(removeCourseID);
				System.out.println("Course " + removeCourseID + " has been removed.");
				
			}
			
		} else {
			System.out.println("Course doesn't exist.");
		}
	}
	
	 public static void addNewEnrolment(ArrayList<Enrolment> enrolmentList, ArrayList<Student> studentList,
	            ArrayList<Course> courseList) {
	        int enrolmentId = Helper.readInt("Enter Enrolment ID: ");
	        int studentId = Helper.readInt("Enter Student ID: ");
	        int courseId = Helper.readInt("Enter Course ID: ");
	        String enrolmentDate = Helper.readString("Enter Enrolment Date (dd/mm/yyyy): ");

	        // Check if the student and course exist
	        boolean studentExists = false;
	        boolean courseExists = false;

	        for (Student student : studentList) {
	            if (student.getStudentID() == studentId) {
	                studentExists = true;
	                break;
	            }
	        }

	        for (Course course : courseList) {
	            if (course.getCourseID() == courseId) {
	                courseExists = true;
	                break;
	            }
	        }

	        if (studentExists && courseExists) {
	            Enrolment enrolment = new Enrolment(enrolmentId, courseId, studentId, enrolmentDate);
	            enrolmentList.add(enrolment);
	            System.out.println("Enrolment added successfully.");
	        } else {
	            System.out.println("Error: Student ID or Course ID not found.");
	        }
	    }

	    // View all enrolments
	    public static void viewAllEnrolments(ArrayList<Enrolment> enrolmentList) {
	        String output = "";
	        output += String.format("%-10s %-10s %-10s %-15s\n", "Enrolment ID", "Course ID", "Student ID", "Enrolment Date");
	        for (Enrolment enrolment : enrolmentList) {
	            output += String.format("%-12d %-10d %-10d %-15s\n", enrolment.getEnrolmentId(), enrolment.getCourseId(),
	                    enrolment.getStudentId(), enrolment.getEnrolmentDate());
	        }
	        System.out.println(output);
	    }

	    // Delete an existing enrolment
	    public static void deleteEnrolment(ArrayList<Enrolment> enrolmentList) {
	        int enrolmentId = Helper.readInt("Enter Enrolment ID to delete: ");
	        boolean found = false;

	        for (int i = 0; i < enrolmentList.size(); i++) {
	            if (enrolmentList.get(i).getEnrolmentId() == enrolmentId) {
	                enrolmentList.remove(i);
	                found = true;
	                System.out.println("Enrolment with ID " + enrolmentId + " has been deleted.");
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Error: Enrolment ID not found.");
	        }
	    }
	    public static void viewAllUsers(ArrayList<User> userList) {
	        System.out.println(String.format("\n%-20s %-20s %-30s %-10s %-10s", "User Name", "Role", "Email", "Mobile No.", "Home No."));
	        for (User u : userList) {
	            System.out.println(String.format("%-20s %-20s %-30s %-10s %-10s", u.getName(), u.getUserRole(), u.getEmail(), u.getMobileNumber(), u.getHomeNumber()));
	        }
	    }
	}
