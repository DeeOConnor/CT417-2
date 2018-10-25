package assignment1;

import java.time.LocalDate;
import java.time.Period;
import static org.joda.time.DateTimeFieldType.year;
//@author 15332286

public class Student {

    private String name;
    private int age;
    private LocalDate dob; //= format what.. to pull out specific year, yymmdd, splitter after two digits
    private LocalDate today;
    private static int ID = 201800;

    private String username;
    private String course;
    private String module;
    //private final Course course;
    //private final Module module;

    //https://stackoverflow.com/questions/29062204/create-localdate-object-from-integers
    public Student(String name, String course, String module) {
        this.name = name;
        this.course = course;
        this.module = module;
        this.ID +=1;
        this.age = calculateAge();
        
    }
    
    public LocalDate getDateOfBirth() {
        return dob;
    }

    public void setDateOfBirth(LocalDate dob) {
        this.dob = dob;
    }
    
    
    private int calculateAge() {
        today = LocalDate.now();
        if ((dob != null) && (today != null)) {
            return Period.between(dob, today).getYears();
        } else {
            return 0;
        }
    }
    
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getDOB() {
        return dob;
    }
    
    //student.getCourses: for each course that contains student, return name..
    
    public String getUsername() {
        username = name + "_" + Integer.toString(age);
        return username;
    }

}



/*public class AgeCalculator {

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}*/