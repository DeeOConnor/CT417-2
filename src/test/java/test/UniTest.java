package test;

// @author 15332286
import assignment1.Student;
import java.time.LocalDate;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class UniTest {

    @Test
    public static void checkUsername() {
        //String name, LocalDate dob, Course course, Module module
        Student s = new Student("Michael", 19, "cs & it", "CT417"); //that shouldn't work as other params are missing..
        //need to create entire course in here!?
        //https://stackoverflow.com/questions/2923227/displaying-date-of-birth-in-java-by-using-date-util for dob
        String testUsername = "Michael_19";
        assertEquals(s.getUsername(), testUsername);
    }
    
    @Test
    public void checkAge() {
        Student s2 = new Student("Michael", 19, "cs & it", "ct417");
        LocalDate birthDate = LocalDate.of(1961, 5, 17);
        
        //int actual = AgeCalculator.calculateAge(birthDate, LocalDate.of(2016, 7, 12));

        assertEquals(s2.getAge(), 19);
    }
}


//https://platform.netbeans.org/tutorials/nbm-maven-commandline.html maven installation stuff

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
