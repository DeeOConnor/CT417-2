package assignment1;

import org.joda.time.DateTime;
// https://stackoverflow.com/questions/19026744/maven-complaints-about-joda-time-even-though-i-installed-it
import java.util.ArrayList;
import java.util.List;

//@author 15332286 
 
public class Course {

    private String courseName;
    List<Student> students = new ArrayList<>();
    List<Module> modules = new ArrayList<>();
    
    private final DateTime date = new DateTime();
    
    DateTime startDate = new DateTime(date);
    DateTime endDate = new DateTime(date);
    
    //DateTime dt = new DateTime();
    //int month = dt.getMonthOfYear();  // where January is 1 and December is 12
    //int year = dt.getYear();
    
    public Course(String name, DateTime start, DateTime end) {
        this.courseName = name;
        this.startDate = start;
        this.endDate = end;
        
        //list of students initialised
        //list of modules
    }
    
    //Student foo = new Student(23, "Foo", 22);

    //students.add (foo);
}

// links https://kodejava.org/how-do-i-create-datetime-object-in-joda-time/
// https://codereview.stackexchange.com/questions/70630/school-which-registers-students-by-preferred-courses
// https://stackoverflow.com/questions/42373289/creating-a-student-arraylist-to-add-students-to-course-class-java