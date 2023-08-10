import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<User> userList = new ArrayList<User>();
		ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<Enrolment> enrolmentList = new ArrayList<Enrolment>();
        ArrayList<Fees> feeList = new ArrayList<Fees>();
        ArrayList<Attendance> attendanceList = new ArrayList<Attendance>(); 

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
                while (userOption != 4) {
                	userMenu();
                    userOption = Helper.readInt("Enter an option > ");
                    if (userOption == 1) {
                       String output = viewAllUsers(userList);
                        System.out.println(output);
                    }
                    else if(userOption ==2) {
                    	newUserInput(userList);
                    }
                    else if(userOption == 3) {
               		 String userType = Helper.readString("Enter usertype (Teacher/Admin) > ");
               		 int id = Helper.readInt("Enter id of user > ");
               		 deleteUser(userList,id,userType);
                    }
                }
            }
			else if (option == 2) { 
				int studentOption = 0;
				while (studentOption != 4) {
					studentMenu();
					studentOption = Helper.readInt("Enter an option > ");
					if (studentOption == 1) {
						addNewStudent(studentList);
					}else if (studentOption == 2) {
						viewAllStudents(studentList);
					}else if (studentOption == 3) {
						removeStudent(studentList);
					}
					
				}				
			}
			else if (option == 3) {
				int courseOption = 0;
				while (courseOption != 5) {
					courseMenu();
					courseOption = Helper.readInt("Enter an option > ");
					
					if (courseOption == 1) {
						viewAllCourses(courseList);
					}
					else if (courseOption == 2) {
						addNewCourse(courseList);
					}
					else if (courseOption == 3) {
						updateCourse(courseList);
					}
					else if (courseOption == 4) {
						deleteCourse(courseList);
					}
				}
			}
			else if (option == 4) {
			    int enrolmentOption = 0;
			    while (enrolmentOption != 4) {
			        enrolmentMenu();
			        enrolmentOption = Helper.readInt("Enter an option > ");

			        if (enrolmentOption == 1) {
			            addNewEnrolment(enrolmentList, studentList, courseList);
			        } else if (enrolmentOption == 2) {
			            viewAllEnrolments(enrolmentList);
			        } else if (enrolmentOption == 3) {
			            deleteEnrolment(enrolmentList);
			        }
			    }
			}
			    
		else if (option == 5) {
	        	int attendanceOption = 0;
	        	while(attendanceOption != 4) {
	        		attendanceMenu();
	        		attendanceOption = Helper.readInt("Enter an option > ");
	        		if (attendanceOption == 1) {
	        			addNewAttendance(attendanceList, enrolmentList);
	        	} else if (attendanceOption == 2) {
	                viewAllAttendances(attendanceList);
	            } else if (attendanceOption == 3) {
	                deleteAttendance(attendanceList);
	            }
	        }
		}
	            
			    
else if(option == 6) {
	        	int feeOption = 0;
	        	feeMenu();
	        	feeOption = Helper.readInt("Enter an option > ");
	        	
	        	if(feeOption == 1) {
	        		String output = viewAllFees(feeList);
	        		System.out.println(output);
	        	}
	        	else if(feeOption == 2) {
	        		Fees newFee = feeInput();
	        		addNewFee(feeList,newFee);
	        	}
	        	else if(feeOption == 3) {
	    	    	int deleteId = Helper.readInt("Enter fee id > ");
	        		deleteFee(feeList,deleteId);
	        	}
	        }
		}
			    }
			    
			

		
		
	

	//Menus
	public static void menu() {
		Helper.line(80, "-");
		System.out.println("TUITION MANAGEMENT MENU");
		Helper.line(80, "-");		
		System.out.println("1. User Management");
		System.out.println("2. Student Management");
		System.out.println("3. Course Management");
		System.out.println("4. Enrolment Management");
		System.out.println("5. Attendance Management");
		System.out.println("6. Fee Management");
		System.out.println("7. Quit");
		Helper.line(80, "-");

	}
	
	public static void courseMenu() { 
		Helper.line(80, "-");
		System.out.println("COURSE MANAGEMENT");
		Helper.line(80, "-");
		System.out.println("1. Display All Course");
		System.out.println("2. Add New Course");
		System.out.println("3. Edit Course");
		System.out.println("4. Remove Course");
		System.out.println("5. Quit");
		Helper.line(80, "-");
		
	}
	public static void enrolmentMenu() {
	    Helper.line(80, "-");
	    System.out.println("ENROLMENT MANAGEMENT");
	    Helper.line(80, "-");
	    System.out.println("1. Add New Enrolment");
	    System.out.println("2. View All Enrolments");
	    System.out.println("3. Delete Enrolment");
	    System.out.println("4. Back to Main Menu");
	    Helper.line(80, "-");
	}
	public static void userMenu() {
	    Helper.line(70, "-");
	    System.out.println("USER MANAGEMENT");
	    Helper.line(70, "-");
	    System.out.println("1. View users");
	    System.out.println("2. Add user");
	    System.out.println("3. Delete user");
	    System.out.println("4. Quit");
	}

	public static void studentMenu() {
	    Helper.line(80, "-");
	    System.out.println("STUDENT MANAGEMENT");
	    Helper.line(80, "-");
	    System.out.println("1. Add New Student");
	    System.out.println("2. View All Students");
	    System.out.println("3. Delete Student");
	    System.out.println("4. Back to Main Menu");
	    Helper.line(80, "-");
	}
	

	public static void feeMenu() {
	    Helper.line(70, "-");
	    System.out.println("FEE MANAGEMENT");
	    Helper.line(70, "-");
	    System.out.println("1. View fees");
	    System.out.println("2. Add fee");
	    System.out.println("3. Delete fee");
	    System.out.println("4. Quit");
	}
	public static void attendanceMenu() {
	    Helper.line(80, "-");
	    System.out.println("ATTENDANCE MANAGEMENT");
	    Helper.line(80, "-");
	    System.out.println("1. Add New Attendance");
	    System.out.println("2. View All Attendances");
	    System.out.println("3. Delete Attendance");
	    System.out.println("4. Back to Main Menu");
	    Helper.line(80, "-");
	}
	
	public static String viewAllStudents(ArrayList<Student> studentList) {
		
		System.out.println(String.format("%-5s %-15s %-15s %-10s" , "ID", "Name", "Amount Fee", "Due Date"));
		String output = "";
		for (int i = 0; i< studentList.size(); i++) {
			output += String.format("%-5d %-15s %-15.2f %-10s\n", studentList.get(i).getStudentID(), studentList.get(i).getStudentName(), studentList.get(i).getAmountfee(), studentList.get(i).getDueDate());
		}
		System.out.println(output);
		return output;
	}
	public static User newUserInput(ArrayList<User> userList) {
    	String userType = Helper.readString("What type of user are you adding? (Admin/Teacher)");
    	boolean validOption = false;
    	String name;
    	String email;
    	String password;
    	String mobileNum;
    	String homeNum;
    	int teacherId = 0;
    	int adminId = 0;
    	
    	while(validOption == false) {
	    	if(userType.equalsIgnoreCase("Admin")) {
	    		validOption = true;
	    		boolean validID = false;
	    		name = Helper.readString("Enter username > ");
	    		while (validID == false) {
		    		adminId = Helper.readInt("Enter adminID");
			    		for(User a : userList) {
			    			if(a instanceof Admin && ((Admin) a).getAdminId() == adminId) {
			    				System.out.println("Duplicate ID! Please enter a new one!");
			    			} else {
			    				validID = true;
			    			}
			    		}
	    		}
	    		email = Helper.readString("Enter email > ");
	    		password = Helper.readString("Enter Password > ");
	    		mobileNum = Helper.readString("Enter mobileNum > ");
	    		homeNum = Helper.readString("Enter homeNum > ");
	    		addNewUser(userList,new Admin(name, adminId, password, userType, email, mobileNum, homeNum));

	    	}
	    	else if (userType.equalsIgnoreCase("Teacher")) {
	    		validOption = true;
	    		boolean validID = false;
	    		name = Helper.readString("Enter username > ");
	    		teacherId = Helper.readInt("Enter adminID");
	    		while (validID == false) {
			    		for(User a : userList) {
			    			if(a instanceof Admin && ((Admin) a).getAdminId() == teacherId) {
			    				System.out.println("Duplicate ID! Please enter a new one!");
					    		teacherId = Helper.readInt("Enter adminID");
			    			} else {
			    				validID = true;
			    			}
			    		}
			    		email = Helper.readString("Enter email > ");
			    		password = Helper.readString("Enter Password > ");
			    		mobileNum = Helper.readString("Enter mobileNum > ");
			    		homeNum = Helper.readString("Enter homeNum > ");
			    		addNewUser(userList,new Teacher(name, teacherId, password, userType, email, mobileNum, homeNum));
	    		}
	    	} else {
	    		System.out.println("Please enter a valid option! (Admin/Teacher)");
	    	}
    	}
		return null;
		
	}
	
	 public static void addNewUser(ArrayList<User> userList, User newUser) {
		 userList.add(newUser);
	    }
	 
	 public static void deleteUser(ArrayList<User> userList, int id, String userType) {
		 boolean foundUser = false;
		 while(foundUser == false) {
			 for(User u : userList) {
				 if(u instanceof Admin && ((Admin) u).getAdminId() == id && userType.equalsIgnoreCase("Admin")) {
					 foundUser = true;
					 userList.remove(u);
					 System.out.println("User successfully deleted!");
					 break;
				 }
				 else if(u instanceof Teacher && ((Teacher) u).getTeacherId() == id && userType.equalsIgnoreCase("Teacher")) {
					 foundUser = true;
					 userList.remove(u);
					 System.out.println("User successfully deleted!");
					 break;
				 }
			 }
			 if(foundUser == false) {
	                System.out.println("Invalid user ID. Please try again.");
	                id = Helper.readInt("Enter user id > ");
			 }
		 }
	 }
	 public static void addNewAttendance(ArrayList<Attendance> attendanceList, ArrayList<Enrolment> enrolmentList) {
		    int attendanceId = Helper.readInt("Enter Attendance ID: ");
		    int enrolmentId = Helper.readInt("Enter Enrolment ID: ");
		    String attendanceDate = Helper.readString("Enter Attendance Date (dd/mm/yyyy): ");

		    // Check if the enrolment exists
		    boolean enrolmentExists = false;
		    for (Enrolment enrolment : enrolmentList) {
		        if (enrolment.getEnrolmentId() == enrolmentId) {
		            enrolmentExists = true;
		            break;
		        }
		    }

		    if (enrolmentExists) {
		        Attendance attendance = new Attendance(attendanceId, enrolmentId, attendanceDate);
		        attendanceList.add(attendance);
		        System.out.println("Attendance added successfully.");
		    } else {
		        System.out.println("Error: Enrolment ID not found.");
		    }
		}

		public static String viewAllAttendances(ArrayList<Attendance> attendanceList) {
		    String output = "";
		    output += String.format("%-10s %-10s %-15s\n", "Attendance ID", "Enrolment ID", "Attendance Date");
		    for (Attendance attendance : attendanceList) {
		        output += String.format("%-12d %-10d %-15s\n", attendance.getAttendanceId(), attendance.getEnrolmentId(),
		                attendance.getAttendanceDate());
		    }
		    return output; // Return the formatted output as a String
		}


		public static void deleteAttendance(ArrayList<Attendance> attendanceList) {
		    int attendanceId = Helper.readInt("Enter Attendance ID to delete: ");
		    boolean found = false;

		    for (int i = 0; i < attendanceList.size(); i++) {
		        if (attendanceList.get(i).getAttendanceId() == attendanceId) {
		            attendanceList.remove(i);
		            found = true;
		            System.out.println("Attendance with ID " + attendanceId + " has been deleted.");
		            break;
		        }
		    }

		    if (!found) {
		        System.out.println("Error: Attendance ID not found.");
		    }
		}
	
	public static String viewAllCourses(ArrayList<Course> courseList) {
		String output = "";
		output += String.format("%-5s %-10s %-10s", "ID", "Name", "Course Fee");
		for (int i = 0; i < courseList.size(); i++) {
			output += String.format("\n%-5d %-10s $%-10.2f", courseList.get(i).getCourseID(), courseList.get(i).getCourseName(), courseList.get(i).getCourseFee());
		}
		System.out.println(output);
		return output;
	}
	
	public static void addNewCourse(ArrayList<Course> courseList) {
		//courseID
		int courseID = Helper.readInt("Enter Course ID > ");
		boolean courseAvaliableId = true;
		
		for (Course course : courseList) {
            if (course.getCourseID() == courseID) {
            	courseAvaliableId = false;
            	}
        }
		
        if (courseAvaliableId == true) {
        	//courseName
        	String courseName = Helper.readString("Enter Course Name > ");
    		boolean courseAvaliableName = true;
    		
    		for (Course course : courseList) {
                if (course.getCourseName().equalsIgnoreCase(courseName)) {
                	courseAvaliableName = false;
                	}
            }
    		
    		if (courseAvaliableName == true) {
    			//course fees & add
    			double courseFee = Helper.readDouble("Enter Course Fees > ");
    			
                Course course = new Course(courseID, courseName, courseFee);
                courseList.add(course);
                System.out.println("Course added successfully.");
                
            } else {
            	System.out.println("Error: Course Name is not available.");
            }
        } else {
            System.out.println("Error: Course ID is not available.");
        }
	}
	
	public static void deleteCourse(ArrayList<Course> courseList) {
		String removeCourse = Helper.readString("Enter Course to be removed > ");
		boolean courseExist = false;
		
		for (int i = 0; i < courseList.size(); i++) {
			if (courseList.get(i).getCourseName().equalsIgnoreCase(removeCourse)) {
				courseExist = true;
				
				if (courseExist) {
					char comfirmation = Helper.readChar("Are you sure? (y|n) > ");
					
					if (comfirmation == 'y' || comfirmation == 'Y') {
						System.out.println("Course " + courseList.get(i).getCourseName() + " has been removed.");
						courseList.remove(i);
					}
				}
			} 
		}
	}
	
	public static void updateCourse(ArrayList<Course> courseList) {
		System.out.println("1. Update Name");
		System.out.println("2. Update Fees");
		System.out.println("3. Update Name & Fees");
		System.out.println("4. Quit");
		int updateOption = Helper.readInt("Enter option > ");
		
		if (updateOption == 1) {
			String nameToUpdate = Helper.readString("Enter Course Name > ");
			
			for (int i = 0; i < courseList.size(); i++) {
				if (courseList.get(i).getCourseName().equalsIgnoreCase(nameToUpdate)) {
					String newName = Helper.readString("Enter New Course Name > ");
					boolean courseAvaliableName = true;
		    		
		    		for (Course course : courseList) {
		                if (course.getCourseName().equalsIgnoreCase(newName)) {
		                	courseAvaliableName = false;
		                	}
		            }
		    		
		    		if (courseAvaliableName == true) {
						System.out.println(courseList.get(i).getCourseName() + " has been updated to " + newName + ".");
						courseList.get(i).setCourseName(newName);
						
		    		} else {
		    			System.out.println("Error: Course Name is not available.");
		    		}
				}
			}
		}
		else if (updateOption == 2) {
			String nameToUpdate = Helper.readString("Enter Course Name > ");
			
			for (int i = 0; i < courseList.size(); i++) {
				if (courseList.get(i).getCourseName().equalsIgnoreCase(nameToUpdate)) {
					double newFee = Helper.readDouble("Enter New Fee Amount > ");
					System.out.println(courseList.get(i).getCourseName() + " fees has been updated from $" + courseList.get(i).getCourseFee() + " to $" + newFee);
					courseList.get(i).setCourseFee(newFee);
				}
			}
		}
		else if (updateOption == 3) {
			String nameToUpdate = Helper.readString("Enter Course Name > ");
			
			for (int i = 0; i < courseList.size(); i++) {
				if (courseList.get(i).getCourseName().equalsIgnoreCase(nameToUpdate)) {
					String newName = Helper.readString("Enter New Course Name > ");
					boolean courseAvaliableName = true;
		    		
		    		for (Course course : courseList) {
		                if (course.getCourseName().equalsIgnoreCase(newName)) {
		                	courseAvaliableName = false;
		                	}
		            }
		    		
		    		if (courseAvaliableName == true) {
						double newFee = Helper.readDouble("Enter New Fee Amount > ");
						System.out.println(courseList.get(i).getCourseName() + " has been updated to " + newName + ".");
						System.out.println(courseList.get(i).getCourseName() + " fees has been updated from $" + courseList.get(i).getCourseFee() + " to $" + newFee);
				
						courseList.get(i).setCourseName(newName);
						courseList.get(i).setCourseFee(newFee);
						
		    		} else {
		    			System.out.println("Error: Course Name is not available.");
		    		}
				}
			}
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
	    public static String viewAllUsers(ArrayList<User> userList) {
	        System.out.println(String.format("\n%-20s %-20s %-30s %-10s %-10s", "User Name", "Role", "Email", "Mobile No.", "Home No."));
	        String output = "";
	        for (User u : userList) {
	            output += String.format("%-20s %-20s %-30s %-10s %-10s\n", u.getName(), u.getUserRole(), u.getEmail(), u.getMobileNumber(), u.getHomeNumber());
	        }
	        return output;
	    }
	    public static void addNewStudent(ArrayList<Student> studentList) {
	    	int id = Helper.readInt("Enter Student ID: ");
	    	String name = Helper.readString("Enter Student Name: ");
	    	boolean duplicate = false;
	    	for (int i=0; i<studentList.size(); i++) {
	    		if (studentList.get(i).getStudentID() == id) {
	    			duplicate = true;
	    			
	    		}
	    		} if (duplicate == true) {
	    			System.out.println("Error: Duplicate Student ID");
	    		}else {
	    			Student student = new Student(id,name);
	    			studentList.add(student);
	    			System.out.println("Student successfully added!");
	    		
	    	}
	    }
	    public static void removeStudent(ArrayList<Student> studentList) {
	    	int id = Helper.readInt("Enter Student ID: ");
	    	boolean found = false;
	    	for (int i = 0; i<studentList.size();i++) {
	    		if (studentList.get(i).getStudentID() == id) {
	    			found = true;
	    			studentList.remove(i);
	    		}
	    	}
	    	if (found ==false) {
	    		System.out.println("Error: Student ID not found.");
	    	}else {
	    		System.out.println("Student successfully removed.");
	    	}
	    }
	    public static Fees feeInput() {
	    	String feeName = Helper.readString("Enter fee name > ");
	    	double feeAmount = Helper.readDouble("Enter fee amount > $");
	    	String dueDate = Helper.readString("Enter due date (dd/mm/yyyy) > ");
	    	int feeId = Helper.readInt("Enter fee Id > ");
	    	
	    	Fees newFee = new Fees(feeName,feeAmount,dueDate, feeId);
			return newFee;
	    }
	    public static void addNewFee(ArrayList<Fees> feeList, Fees newFee) {
	    	feeList.add(newFee);
	    }
	    public static String viewAllFees(ArrayList<Fees> feeList) {
			System.out.println(String.format("%-15s %-20s %-40s %-5s" ,"Name", "Fee amount", "Due Date","Fee id"));
			String output = "";
			for (int i = 0; i< feeList.size(); i++) {
				output += String.format("%-15s %-20.2f %-40s %-5d\n",feeList.get(i).getFeeName(),feeList.get(i).getFeeAmount(),feeList.get(i).getDueDate(),feeList.get(i).getFeeId());
			}
			return output;
	    }
	    public static void deleteFee(ArrayList<Fees> feeList, int deleteId) {
	    	boolean foundFee = false;
			 while(foundFee == false) {
				 for(Fees f : feeList) {
					 if(f.getFeeId() == deleteId) {
						 feeList.remove(f);
						 foundFee = true;
						 System.out.println("Fee successfully deleted!");
						 break;
					 }
				 }
				 if(foundFee == false) {
		                System.out.println("Invalid fee ID. Please try again.");
		                deleteId = Helper.readInt("Enter user id > ");
				 }
			 }
	    }
	}
