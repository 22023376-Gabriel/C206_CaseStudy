import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class C206_CaseStudyTest {

    ArrayList<User> userList = new ArrayList<User>();
    
	private Admin user1;
	private Admin user2;
	private Teacher user3;
	private Teacher user4;
	@Before
	public void setUp() throws Exception {
		//Prepare test data
		user1 = new Admin("Admin1", 1, "adminP@ss", "Admin", "TuitionManagement@gmail.com", "9123 4567");
		user2 = new Admin("Admin2", 2, "adminP@ssw3rd", "Admin", "TuitionManagement2@gmail.com", "9123 4537", "9523 4127");
		user3 = new Teacher("Joseph Neo", 1, "p@ssT3st", "Teacher", "JNeo@yahoo.com", "8990 5902");
		user4 = new Teacher("Rahman Syed", 2, "p@ssT3st1ng", "Teacher", "RahmanSyed@gmail.com", "8331 5820", "9321 3888"); 
		
		userList = new ArrayList<User>();//For User testing
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
	//Test if 
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

}