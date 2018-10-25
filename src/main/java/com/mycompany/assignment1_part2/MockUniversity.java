/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1_part2;

import assignment1.Course;
import assignment1.Module;
import assignment1.Student;
import org.joda.time.DateTime;



/**
 *
 * @author 15332286
 */
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
    
    //students have name course module
    //Students should be able to have many modules
    //List of modules should use .add(student)
    Student s1 = new Student("Anna", "CS", "CT417");
    Student s2 = new Student("Barry", "CS", "Maths");
    Student s3 = new Student("Carla", "CS", "Maths");
    Student s4 = new Student("Darren", "CS", "CT418");
    Student s5 = new Student("Edel", "CS", "CS150");
    Student s6 = new Student("Fergus", "CS", "CS150");
    Student s7 = new Student("Grainne", "CS", "CT417");
    Student s8 = new Student("Harry", "CS", "CT417");
    Student s9 = new Student("Ida", "CS", "CS150");
    Student s10 = new Student("Joe", "CS", "CT418");
       
    
    //lots of modules, have lots of students
    //create lots of students
    //print out a list of all  courses, modules, and students, usernames, assigned modules and registered courses 
    
}
