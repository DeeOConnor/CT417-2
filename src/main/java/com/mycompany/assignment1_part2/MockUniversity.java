package com.mycompany.assignment1_part2;
//@author 15332286 

import assignment1.Course;
import assignment1.Module;
import assignment1.Student;
import java.time.Month;
import org.joda.time.DateTime;
import java.time.LocalDate;


public class MockUniversity {
    //make students here and test the data!
    DateTime start = new DateTime();
    DateTime end = new DateTime();
    
    Course c1 = new Course("CS", start, end);
    
    //MODULES CT417, CT418, Maths, CS150, FYP
    //Modules have name and String ID
    Module ct417 = new Module("CT417", "CT417");
    Module ct418 = new Module("CT418", "CT418");
    Module maths = new Module("Maths", "Maths");
    Module cs150 = new Module("CS150", "CS150");
    Module fyp = new Module("FYP", "FYP");

    
    //Students should be able to have many modules
    //public Student(String name, LocalDate dob, String course, String module) {
    LocalDate dob1 = LocalDate.of(1999, Month.JANUARY, 10);
    Student s1 = new Student("Anna", dob1, "CS", "CT417");
    
    LocalDate dob2 = LocalDate.of(1998, Month.FEBRUARY, 11);
    Student s2 = new Student("Barry", dob2, "CS", "Maths");
    
    LocalDate dob3 = LocalDate.of(1997, Month.MARCH, 12);
    Student s3 = new Student("Carla", dob3, "CS", "Maths");
    
    LocalDate dob4 = LocalDate.of(1996, Month.APRIL, 13);
    Student s4 = new Student("Darren", dob4, "CS", "CT418");
    
    LocalDate dob5 = LocalDate.of(1995, Month.MAY, 14);
    Student s5 = new Student("Edel", dob5, "CS", "CS150");

    LocalDate dob6 = LocalDate.of(1994, Month.JUNE, 15);
    Student s6 = new Student("Fergus", dob6, "CS", "CS150");
    
    LocalDate dob7 = LocalDate.of(1993, Month.JULY, 16);
    Student s7 = new Student("Grainne", dob7, "CS", "CT417");
    
    LocalDate dob8 = LocalDate.of(1992, Month.AUGUST, 17);
    Student s8 = new Student("Harry", dob8, "CS", "CT417");
    
    LocalDate dob9 = LocalDate.of(1991, Month.SEPTEMBER, 18);
    Student s9 = new Student("Ida", dob9, "CS", "CS150");
    
    LocalDate dob10 = LocalDate.of(1990, Month.OCTOBER, 20);
    Student s10 = new Student("Joe", dob10, "CS", "CT418");
       
    
    //lots of modules, have lots of students
    //create lots of students
    //print out a list of all  courses, modules, and students, usernames, assigned modules and registered courses 
}
