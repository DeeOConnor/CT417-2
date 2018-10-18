package assignment1;

import java.util.Date;
//@author 15332286

public class Student {

    private String name;
    private int age;
    private Date dob;
    private static int ID = 201800;

    private String username;
    private final Course course;
    private final Module module;

    public Student(String name, int age, Date dob, Course course, Module module) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.course = course;
        this.module = module;
        this.ID +=1;
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
    public Date getDOB() {
        return dob;
    }
    
    //student.getCourses: for each course that contains student, return name..
    
    public String getUsername() {
        username = name + "_" + age;
        return username;
    }

}


