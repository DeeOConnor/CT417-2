package test;

// @author 15332286
import assignment1.Student;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class UniTest {

    @Test
    public static void checkUsername() {
        //(String name, int age, Date dob, Course course, Module module) {
        Student s = new Student("Michael", 19, 12/1/2001, ); //that shouldn't work as other params are missing..
        //need to create entire course in here!?
        //https://stackoverflow.com/questions/2923227/displaying-date-of-birth-in-java-by-using-date-util for dob
        String testUsername = "Michael_19";
        assertEquals(s.getUsername(), testUsername);
    }
}


/*
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


 
public class UniTest {
    
    public UniTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void hello() {}
} */
