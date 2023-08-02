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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
