import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class C206_CaseStudyTest {
	private ArrayList<Student> studentList;
    private ArrayList<Attendance> attendanceList;
    private ArrayList<Enrolment> enrolmentList;

    ArrayList<User> userList = new ArrayList<User>();
    
	private Admin user1;
	private Admin user2;
	private Teacher user3;
	private Teacher user4;
	private Student s1;
	private Student s2;
	
	@Before
	public void setUp() throws Exception {
		//Prepare test data
		s1 = new Student(1, "Jack Park");
		s2 = new Student(2, "Tom Roger", 500.00, "25/09/23");
		user1 = new Admin("Admin1", 1, "adminP@ss", "Admin", "TuitionManagement@gmail.com", "9123 4567");
		user2 = new Admin("Admin2", 2, "adminP@ssw3rd", "Admin", "TuitionManagement2@gmail.com", "9123 4537", "9523 4127");
		user3 = new Teacher("Joseph Neo", 1, "p@ssT3st", "Teacher", "JNeo@yahoo.com", "8990 5902");
		user4 = new Teacher("Rahman Syed", 2, "p@ssT3st1ng", "Teacher", "RahmanSyed@gmail.com", "8331 5820", "9321 3888"); 
		
		userList = new ArrayList<User>();//For User testing
		studentList = new ArrayList<Student>();
	}

	@After 
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
@Test
public void testViewAllUsers() {
    // Test if Item list is not null but empty - boundary
    assertNotNull("Test if there is a valid user arraylist to retrieve items from", userList);

    // test if the list of users retrieved from the SourceCentre is empty - boundary
    String allUsers = C206_CaseStudy.viewAllUsers(userList);
    String testOutput = "";

    assertEquals("Check that ViewAllUserslist", testOutput, allUsers);

    // Given an empty list, after adding 4 users, test if the list is not empty
    userList.add(user1);
    userList.add(user2);
    userList.add(user3);
    userList.add(user4);
    assertNotEquals("Test that the user arraylist size is not empty", 0, userList.size());

    // test if the expected output string same as the list of users retrieved from the SourceCentre
    allUsers = C206_CaseStudy.viewAllUsers(userList);
    testOutput += String.format("%-20s %-20s %-30s %-10s %-10s\n", "Admin1", "Admin", "TuitionManagement@gmail.com", "9123 4567", "");
    testOutput += String.format("%-20s %-20s %-30s %-10s %-10s\n", "Admin2", "Admin", "TuitionManagement2@gmail.com", "9123 4537", "9523 4127");
    testOutput += String.format("%-20s %-20s %-30s %-10s %-10s\n", "Joseph Neo", "Teacher", "JNeo@yahoo.com", "8990 5902", "");
    testOutput += String.format("%-20s %-20s %-30s %-10s %-10s\n", "Rahman Syed", "Teacher", "RahmanSyed@gmail.com", "8331 5820", "9321 3888");

    assertEquals("Test that ViewAllUserslist works", testOutput, allUsers);
}

@Test 
public void testAddUser() {
	//Test that the list is not null so users can be added to it
    assertNotNull("Test if there is a valid user arraylist to add items to", userList);
    
    //Test that a previously empty list which has a user added to it has a size of 1
    C206_CaseStudy.addNewUser(userList, user1);
    assertEquals("Test that the userlist has a size of 1",1,userList.size());
    
    //Test that when another item is added the size increases to 2
    C206_CaseStudy.addNewUser(userList, user2);
    assertEquals("Test that the userlist has a size of 2",2,userList.size());

    //Test that when a new user with duplicate details is inputted, it is not added to the list
    C206_CaseStudy.addNewUser(userList, user2);
    assertNotEquals("Test that the userlist size does not increase",2,userList.size());
}
@Test
public void testDeleteUser() {
    userList.add(user1);
    userList.add(user2);
    userList.add(user3);
    userList.add(user4);
	//Test that the list updates when a user is deleted
    C206_CaseStudy.deleteUser(userList, 3, "Admin");
	assertEquals("Test that the userList size decreases",3,userList.size());
	//Test that the list does not update when an invalid user is deleted
    C206_CaseStudy.deleteUser(userList, 3, "Admin");

}

@Test
public void testAddNewEnrolment() {
    ArrayList<Enrolment> enrolmentList = new ArrayList<Enrolment>();
    ArrayList<Student> studentList = new ArrayList<Student>();
    ArrayList<Course> courseList = new ArrayList<Course>();

    // Adding sample students and courses to the lists
    studentList.add(new Student(1, "Alice"));
    studentList.add(new Student(2, "Bob"));
    courseList.add(new Course(1, "Math", 200.0));
    courseList.add(new Course(2, "English", 150.0));

    // Add an enrolment
    C206_CaseStudy.addNewEnrolment(enrolmentList, studentList, courseList);
    assertEquals("Check if enrolment list size is 1 after adding", 1, enrolmentList.size());

    // Add another enrolment
    C206_CaseStudy.addNewEnrolment(enrolmentList, studentList, courseList);
    assertEquals("Check if enrolment list size is 2 after adding", 2, enrolmentList.size());
}
@Test
public void testAddStudent() {
	
	
	
	assertNotNull("Test that that is valid Student arraylist to add to", studentList);
	
	C206_CaseStudy.addNewStudent(studentList);
	assertEquals("Test that Student arraylist size is 1", 1, studentList.size());
	
	C206_CaseStudy.addNewStudent(studentList);
	assertEquals("Test that Student arraylist size is 2", 2, studentList.size());
}
@Test
public void testViewAllStudents() {
	assertNotNull("Test if there is a valid user arraylist to retrieve items from", studentList);
	String allStudents = C206_CaseStudy.viewAllStudents(studentList);
    String testOutput = "";
    assertEquals("Check that ViewAllStudentlist", testOutput, allStudents);
	studentList.add(s1);
	studentList.add(s2);
	assertNotEquals("Test that the student arraylist size is not empty", 0, studentList.size());
	
	allStudents = C206_CaseStudy.viewAllStudents(studentList);
	testOutput += String.format("%-5d %-15s %-15.2f %-10s\n",1, "Jack Park", 0.00, "");
	testOutput += String.format("%-5d %-15s %-15.2f %-10s\n",2, "Tom Roger", 500.00, "25/09/23");
	assertEquals("Test that ViewAllUserslist works", testOutput, allStudents);
}
@Test
public void testRemoveStudent() {
	assertNotNull("Test if there is a valid user arraylist to retrieve items from", studentList);
	studentList.add(s1);
	studentList.add(s2);
	assertNotEquals("Test that the student arraylist size is not empty", 0, studentList.size());
	studentList.remove(s1);
	assertEquals("Test that there is 1 in student arraylist", 1, studentList.size());
	
	
}
@Test
public void testDeleteAttendance() {
    // Prepare attendance list
    attendanceList.add(new Attendance(1, 1, "01/08/2023"));
    attendanceList.add(new Attendance(2, 2, "02/08/2023"));

    // Test deleting an existing attendance
    C206_CaseStudy.deleteAttendance(attendanceList);
    assertEquals("Test that the attendance list size decreases", 1, attendanceList.size());

    // Test deleting a non-existing attendance (should not decrease the size)
    C206_CaseStudy.deleteAttendance(attendanceList);
    assertEquals("Test that the attendance list size remains the same", 1, attendanceList.size());
}

@Test
public void testAddNewAttendance() {
    // Prepare enrolment list
    enrolmentList.add(new Enrolment(1, 1, 1, "01/08/2023"));
    enrolmentList.add(new Enrolment(2, 2, 2, "02/08/2023"));

    // Test adding a single attendance
    C206_CaseStudy.addNewAttendance(attendanceList, enrolmentList);
    assertEquals("Test that attendance list has a size of 1", 1, attendanceList.size());

    // Test adding multiple attendances
    C206_CaseStudy.addNewAttendance(attendanceList, enrolmentList);
    assertEquals("Test that attendance list has a size of 2", 2, attendanceList.size());
}

@Test
public void testViewAllAttendances() {
    // Prepare expected output
    String expectedOutput = String.format("%-10s %-10s %-15s\n", "Attendance ID", "Enrolment ID", "Attendance Date");
    expectedOutput += String.format("%-12d %-10d %-15s\n", 1, 1, "01/08/2023");
    expectedOutput += String.format("%-12d %-10d %-15s\n", 2, 2, "02/08/2023");

    // Call the method and compare output
    String output = C206_CaseStudy.viewAllAttendances(attendanceList);
    assertEquals("Test if viewAllAttendances returns correct output", expectedOutput, output);
}
}